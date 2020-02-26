package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {
	public WebDriver w=null;
	@Test
	public void m1() throws IOException, InterruptedException
	{
		Properties p = new Properties();
		FileInputStream f = new FileInputStream("C:\\Users\\alahiri\\eclipse-workspace\\TestNG\\src\\Demo\\datadriven.properties");
		p.load(f);
		System.out.println(p.getProperty("username"));
		if(p.getProperty("browser").equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		}
		Thread.sleep(2000);
		w.get(p.getProperty("url"));
		
		
		
	}
	
	@Test
	public void m2()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@Test
	public void m5()
	{
		System.out.println("End of Suite");
	}
	
	@Test
	public void m6()
	{
		System.out.println("Start of SUite");
	}

}
