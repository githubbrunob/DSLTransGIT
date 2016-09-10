package dsltrans.exceptions;

import dsltrans.AbstractAttributeRelation;

public class InvalidAttributeRelationException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	private AbstractAttributeRelation _relation;
	
	public InvalidAttributeRelationException(String string, AbstractAttributeRelation relation) {
		super(string);
		_relation = relation;
	}

	public AbstractAttributeRelation getRelation() {
		return _relation;
	}
	
	
}
