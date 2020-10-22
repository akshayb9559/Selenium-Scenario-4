package demo;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

	WebDriver wd;
	String url = "https://www.google.co.in";

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Certification Data\\Selenium\\Driver\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get(url);
	}

	@Test
	public void test() throws InterruptedException {

		wd.findElement(By.name("q")).sendKeys("Selenium Webdriver");

		List<WebElement> list = wd.findElements(By.xpath("//ul[@class='erkvQe']//li"));

		// iterate through all suggestions and select required text
		for (int i = 0; i < list.size(); i++) {
			String element = list.get(i).getText();
			if (element.equals("selenium webdriver")) {
				list.get(i).click();
				break;
			}
		}

	}

	@After
	public void tearDown() throws Exception {

		wd.quit();
	}

}