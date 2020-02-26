package Demo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void BikeLoan()
	{
		
		System.out.println("BikeLoan");
	}
	
	@Test
	public void BikeLoanWeb()
	{
		System.out.println("WebBikeLoan");
	}
	
	@Test
	public void BikeLoanApi()
	{
		System.out.println("ApiBikeLoan");
	}
	
	@BeforeTest
	public void HarleyBikeLoan()
	{
		System.out.println("HarleyBikeLoan");
	}

}
