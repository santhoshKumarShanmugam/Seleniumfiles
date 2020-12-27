package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class geek {
	
	WebDriver driver;
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver\\86\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		driver.close();
		
		
	}
	
}
