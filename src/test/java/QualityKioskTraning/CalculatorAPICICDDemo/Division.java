package QualityKioskTraning.CalculatorAPICICDDemo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Division {
	CalculatorAPI cal;
	int result;
	@BeforeGroups("RegressionTest")
	public void initGroup() {
		cal = new CalculatorAPI();
	}
	@BeforeClass
	public void init()
	{
		cal =  new CalculatorAPI();
	}
	
	@BeforeMethod
	public void reinitialize()
	{
		result=0;
	}
	@Test(groups= {"RegressionTest"})
	public void DivisionTestWithTwoPositiveNumbers()
	{
		result=cal.Division(10, 5);
		Assert.assertEquals(result, 2);
	}

}
