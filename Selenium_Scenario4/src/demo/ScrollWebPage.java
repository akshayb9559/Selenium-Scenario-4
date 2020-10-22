package demo;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebPage {

	WebDriver wd;
	String url = "http://openclinic.sourceforge.net/openclinic/home/index.php";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Certification Data\\Selenium\\Driver\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get(url);
		wd.manage().window().maximize();
	}

	@Test
	public void test() {
		
		JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,1000)");

	}

	@After
	public void tearDown() throws Exception {
		wd.quit();
	}
}
