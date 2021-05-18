package QualityKioskTraning.CalculatorAPICICDDemo;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiplication {
	
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
	
	@DataProvider
	public Object[][] provideIntegerNumbers()
	{
		Object[][] setOfValues=new Object[4][3];
		setOfValues[0][0]=2;
		setOfValues[0][1]=3;
		setOfValues[0][2]=6;
		
		setOfValues[1][0]=5;
		setOfValues[1][1]=10;
		setOfValues[1][2]=50;
		
		setOfValues[2][0]=10;
		setOfValues[2][1]=10;
		setOfValues[2][2]=100;
		
		setOfValues[3][0]=30;
		setOfValues[3][1]=3;
		setOfValues[3][2]=90;
		return setOfValues;
	}
	
	@Test(dataProvider="provideIntegerNumbers")
	public void TestMultiplicationWithTwoPositiveNumbers(int numOne,int numTwo,int answer) {
		result = cal.Multiplication(numOne, numTwo);
		Assert.assertEquals(result, answer);
	}
}
