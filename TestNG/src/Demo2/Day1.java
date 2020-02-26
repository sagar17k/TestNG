package Demo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test(groups= {"Smoke"})
	public void m3()
	{
		
		System.out.println("Hi");
	}
	
	@Parameters({"URL"})
	@Test
	public void m2(String name)
	{
		System.out.println("Hello");
		System.out.println(name);
	}
	
	@Test(dataProvider="getData")
	public void m5()
	{
		System.out.println("End of Suite");
	}
	
	@Test
	public void m6()
	{
		System.out.println("Start of SUite");
	}

	@DataProvider
	public void getData() {}
}
