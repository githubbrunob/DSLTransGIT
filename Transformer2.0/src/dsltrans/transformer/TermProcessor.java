package dsltrans.transformer;

import java.util.HashMap;
import java.util.List;

import dsltrans.ApplyAttribute;
import dsltrans.ApplyClass;
import dsltrans.Atom;
import dsltrans.Attribute;
import dsltrans.AttributeRef;
import dsltrans.ClassRef;
import dsltrans.Concat;
import dsltrans.MatchAttribute;
import dsltrans.MatchClass;
import dsltrans.Operator;
import dsltrans.Ref;
import dsltrans.Rule;
import dsltrans.Sequencer;
import dsltrans.Term;
import dsltrans.TypeOf;
import dsltrans.Wildcard;
import dsltrans.io.eclipse.EclipseSequenceExpansionProcessor;
import dsltrans.transformer.filter.AbstractFilter;
import dsltrans.transformer.filter.ApplyAttributeFilter;
import dsltrans.transformer.filter.ApplyEntityFilter;
import dsltrans.transformer.filter.MatchAttributeFilter;
import dsltrans.transformer.filter.MatchEntityFilter;
import dsltrans.transformer.filter.MatchFilter;


public class TermProcessor {
	
	
	public HashMap<Term, String> processedTerms;
	private List<MatchFilter> _matchFilterList;

	public TermProcessor(List<MatchFilter> mflist) {
		processedTerms = new HashMap<Term,String>();
		setMatchFilterList(mflist);
	}
	
	public void Clear(){ processedTerms.clear(); }
	
	public boolean hasTerm(Term attValue) {
		return processedTerms.containsKey(attValue);
	}
	
	// decode Attribute Terms
	public String processTerm(Term t, Rule r){
		String result = new String();
		if (t instanceof Atom) {
			result += ((Atom)t).getValue();
		} else if (t instanceof Sequencer) {
			// Add here the other base case considering the sequencer term.
			result += EclipseSequenceExpansionProcessor.SEQUENCER_STRING;
		} else if (t instanceof Operator) {
			if (t instanceof Concat) {
				Concat cc = (Concat)t;
				result += processTerm(cc.getLeftTerm(), r) + processTerm(cc.getRightTerm(), r);
			}
			else if (t instanceof TypeOf) {
				TypeOf to = (TypeOf)t;
				Attribute at = to.getAttributeRef();
				if (at instanceof MatchAttribute) {
					MatchAttribute ma = (MatchAttribute)at;
					MatchClass mc = (MatchClass)ma.eContainer();
					AbstractFilter af = null;
					for (MatchFilter mf : getMatchFilterList()){
						af = mf.getFilter(mc);
						if (af != null)
							break;
					}
					MatchEntityFilter mef = (MatchEntityFilter)af;
					for (MatchAttributeFilter mf : mef.getFilterAttributes())
						if (mf.getAttribute().equals(ma)) {
							result += mf.getCurrentAttribute().getMetaAttribute().getType();
							break;
						}
				}
			}
		}
		else if (t instanceof Ref) {
			if (t instanceof AttributeRef) {
				Attribute at = ((AttributeRef)t).getAttributeRef();
				if (at instanceof MatchAttribute) {
					MatchAttribute ma = (MatchAttribute)at;
					MatchClass mc = (MatchClass)ma.eContainer();
					AbstractFilter af = null;
					for (MatchFilter mf : getMatchFilterList()){
						af = mf.getFilter(mc);
						if (af != null)
							break;
					}
					if (af != null) {
						MatchEntityFilter mef = (MatchEntityFilter)af;
						for (MatchAttributeFilter mf : mef.getFilterAttributes())
							if (mf.getAttribute().equals(ma)) {
								result += (mf.getCurrentAttribute().getValue() == null? "" : mf.getCurrentAttribute().getValue());
								break;
							}
					}
				}
				else if (at instanceof ApplyAttribute){
					ApplyClass backClass = (ApplyClass)at.eContainer();
					if (r.getBackwards().contains(backClass)) {
						for (MatchFilter mf : getMatchFilterList()) {
							if (r.getMatch().contains(mf.get_matchModel())) {
								for (ApplyEntityFilter aef : mf.getApplyEntityFilters()) {
									if (aef.getApplyClass() == backClass) {
										for (ApplyAttributeFilter aaf : aef.getFilterAttributes()) {
											if (aaf.getAttribute().getAttributeName() == at.getAttributeName()) {
												result += aaf.getCurrentAttribute().getValue().toString();
											}
										}
									}
								}
							}
						}
					}
					else {
						Term value = ((ApplyAttribute) at).getAttributeValue();
						if (processedTerms.containsKey(value))
							result += processedTerms.get(value);
						else
							result += processTerm(value, r);
					}
				}
			}
			else if (t instanceof ClassRef) {
				ClassRef cr = (ClassRef)t;
				result += cr.getClassRef().getClassName();
			}
				
		}
		else if (t instanceof Wildcard) {
			result += '*';
		}
		
		processedTerms.put(t, result);
		return result;
	}
	
	public boolean parseCondition(String condition, String attValue) {
		boolean result = true;
		if (condition.contains("*")) {
			while (!condition.isEmpty()) {
				String subcondition = condition.substring(0, condition.indexOf('*'));
				if(subcondition.isEmpty()) {
					condition = condition.substring(condition.indexOf('*')+1, condition.length());
					result &= attValue.endsWith(condition);
					break;
				} else if (condition.startsWith(subcondition)) {
					result &= attValue.startsWith(subcondition);
					if(result) {
						attValue = attValue.substring(attValue.indexOf(subcondition)+subcondition.length(), attValue.length());
						condition = condition.substring(condition.indexOf('*')+1, condition.length());
					} else {
						result = false;
						break;						
					}
				} else {
					result = false;
					break;
				}
			}
		} else {
			result = attValue.equals(condition);
		}
		
		return result;
	}

	public String getTerm(Term attValue) {
		return processedTerms.get(attValue);
	}

	private void setMatchFilterList(List<MatchFilter> _matchFilterList) {
		this._matchFilterList = _matchFilterList;
	}

	private List<MatchFilter> getMatchFilterList() {
		return _matchFilterList;
	}	
	
}