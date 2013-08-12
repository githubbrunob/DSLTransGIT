package visitors.helpers;

import SATEL.APN.adtmm.Operation;

public class AsGenerator {
	private Operation operation;

	public AsGenerator(Operation operation) {
		this.operation = operation;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
}
