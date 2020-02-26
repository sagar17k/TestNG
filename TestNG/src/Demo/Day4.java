package Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day4 {
	
	@AfterTest
	public void CarLoan()
	{
		System.out.println("CarLoan");
	}
	
	@Test
	public void WebCarLoan()
	{
		System.out.println("WebCarLoan");
	}
	
	@Test
	public void ApiCarLoan()
	{
		System.out.println("ApiCarLoan");
	}

}
