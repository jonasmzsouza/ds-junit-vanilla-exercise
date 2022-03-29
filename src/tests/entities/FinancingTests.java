package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factories.FinancingFactory;

public class FinancingTests {

	@Test
	public void constructorShouldCreatedObjectWhenValidateData() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;

		Financing financ = FinancingFactory.createdValidObject();

		Assertions.assertEquals(totalAmount, financ.getTotalAmount());
		Assertions.assertEquals(income, financ.getIncome());
		Assertions.assertEquals(months, financ.getMonths());
	}

	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing financ = FinancingFactory.createdInvalidObject();
		});

	}
	
	@Test
	public void setTotalAmountShouldSetDataWhenValidateData() {
		
		// arrange
		Double setValue = 90000.0;		
		Financing financ = FinancingFactory.createdValidObject();
		
		// action
		financ.setTotalAmount(setValue);
		
		// assert
		Assertions.assertEquals(setValue, financ.getTotalAmount());
		
		
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Double setValue = 110000.0;
			Financing financ = FinancingFactory.createdValidObject();
			financ.setTotalAmount(setValue);
		});
	}
	
	
	@Test
	public void setIncomeShouldSetDataWhenValidateData() {
		
		// arrange
		Double setValue = 2050.0;
		Financing financ = FinancingFactory.createdValidObject();
		
		// action
		financ.setIncome(setValue);
		
		// assert
		Assertions.assertEquals(setValue, financ.getIncome());
		
		
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Double setValue = 1950.0;
			Financing financ = FinancingFactory.createdValidObject();
			
			financ.setIncome(setValue);
		});
	}
	
	@Test
	public void setMonthsShouldSetDataWhenValidateData() {
		
		// arrange
		Integer setValue = 85;
		Financing financ = FinancingFactory.createdValidObject();
		
		// action
		financ.setMonths(setValue);
		
		// assert
		Assertions.assertEquals(setValue, financ.getMonths());
		
		
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Integer setValue = 75;
			Financing financ = FinancingFactory.createdValidObject();
			
			financ.setMonths(setValue);
		});
	}
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		
		Double expectedValue = 20000.0;		
		Financing financ = FinancingFactory.createdValidObject();
		
		Double entry = financ.entry();
		
		Assertions.assertEquals(expectedValue, entry);
	}
	
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		
		Double expectedValue = 1000.0;		
		Financing financ = FinancingFactory.createdValidObject();
		
		Double quota = financ.quota();
		
		Assertions.assertEquals(expectedValue, quota);
	}

	
}
