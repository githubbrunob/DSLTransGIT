package visitors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Environ {
//	private Map<String, Map<String, Object>> values;
	private Map<String, Object> values;
	private Environ previous;
//
//	
	public Environ(Environ environ) {
		this.previous = environ;
		values = new LinkedHashMap<String, Object>();
//		values = new LinkedHashMap<String, Map<String, Object>>();
	}
	public Environ beginScope() {
		return new Environ(this);
	}
	public Environ endScope() {
		return previous;
	}
	
	public void addBinding(String key, Object value) {
		values.put(key, value);
	}
	public Object getBinding(String key) {
		Object result = values.get(key);
		if (result==null && previous!=null) 
			return previous.getBinding(key);
		else
			return result;
		
	}
//	public void addBinding(String key, String tag, Object value) {
//		Map<String, Object> assoctd = values.get(key);
//		if (assoctd==null)
//			values.put(key, assoctd = new LinkedHashMap<String, Object>() );
//		assoctd.put(tag,  value);
//	}
//	
//	public Object getBinding(String key, String tag) {
//		Map<String, Object> assoctd = values.get(key);
//		if (assoctd == null) {
//			if (previous!=null)
//				return previous.getBinding(key, tag);
//			else return null;
//		}
//		return assoctd.get(tag);
//	}
//	
//	public Set<Entry<String, Object>> getValues(String key) {
//		Map<String, Object> assoctd = values.get(key);
//		return assoctd.entrySet();
//	}
//
//
	
}
