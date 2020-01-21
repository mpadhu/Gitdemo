package qaclickacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest
{
	@Test
	public void Selenium1()
	{
		System.out.println("Selenium1");
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
	}
	//Annotation is necessary for maven to run
	//@Test
	public void Selenium2()
	{
		System.out.println("Selenium2");
	}
}

