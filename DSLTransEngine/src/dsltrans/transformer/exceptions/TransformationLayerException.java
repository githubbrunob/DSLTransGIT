package dsltrans.transformer.exceptions;

import dsltrans.transformer.TransformationLayer;

public class TransformationLayerException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TransformationLayerException(String string,
			TransformationLayer transformationLayer, Exception e) {
		_message = string;
		_source = transformationLayer;
		_originException = e;
	}
	private String _message;
	private TransformationLayer _source;
	private Exception _originException;
	
	@Override
	public void printStackTrace() {
		System.err.println("message: " + _message + " from: " + _source.toString());
		_originException.printStackTrace();
	}
	
}
