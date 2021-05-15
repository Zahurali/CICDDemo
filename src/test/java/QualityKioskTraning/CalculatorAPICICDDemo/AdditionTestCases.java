package QualityKioskTraning.CalculatorAPICICDDemo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AdditionTestCases {
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
	@Test(priority=0 , groups={"RegressionTest"})
	public void TestAdditionWithPositiveNumbers()
	{
		result = cal.Addition(10,20);
		Assert.assertEquals(result, 30,"Addition is not correct");
		
	}
	@Test(priority=1)
	public void TestAdditionWithNegativeNumbers()
	{
		 result = cal.Addition(-10,-20);
		Assert.assertEquals(result, -30,"Addition is wrong");
	}
	@Test(priority=3)
	public void TestAdditionWithZeroNumbers()
	{
		 result = cal.Addition(0, 0);
		Assert.assertEquals(result, 0);
	}
	@Test(priority=2,groups={"RegressionTest"})
	public void TestAdditionWithPositiveNegativeNumbers()
	{
		 result = cal.Addition(10, -30);
		Assert.assertEquals(result, -20);
	}

}
