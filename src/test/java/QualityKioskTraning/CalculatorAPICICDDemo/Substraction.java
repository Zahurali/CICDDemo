package QualityKioskTraning.CalculatorAPICICDDemo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Substraction {
	CalculatorAPI cal;
	int result;
	
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
	@Test(priority=0)
	public void SubtractionWithPositiveNumbers()
	{
		result = cal.Subtraction(80, 70);
		Assert.assertEquals(result, 10);
		System.out.println( "Result= "+ result);
	}
	@AfterClass
	public void TearDown()
	{
		cal=null;
	}
}
