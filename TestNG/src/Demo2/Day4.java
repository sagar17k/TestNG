package Demo2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test(groups= {"Smoke"})
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
