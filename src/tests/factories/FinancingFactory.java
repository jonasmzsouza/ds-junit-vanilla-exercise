package tests.factories;

import entities.Financing;

public class FinancingFactory {
	
	public static Financing createdValidObject() {
		return new Financing(100000.0, 2000.0, 80);
	}
	
	public static Financing createdInvalidObject() {
		return new Financing(100000.0, 2000.0, 20);
	}

}
