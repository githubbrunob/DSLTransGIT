package transformerProcessor.exceptions;

import transformerProcessor.TransformationSource;

public class TransformationSourceException extends Exception {

	private String _message;
	private TransformationSource _source;
	private Exception _originException;
	
	public TransformationSourceException(String string,
			TransformationSource transformationSource, Exception e) {
		_message = string;
		_source = transformationSource;
		_originException = e;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void printStackTrace() {
		System.err.println("message: " + _message + " from: " + _source.toString());
		_originException.printStackTrace();
	}
}
