package example;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;

	@Test
	public void testEasy() {
		driver.get("http://www.mindteck.com");
		Calendar calendar = new GregorianCalendar();
		String filename=System.getProperty("user.dir")+"\\Screenshots\\" +calendar.get(Calendar.HOUR)+ "-" +calendar.get(Calendar.MINUTE)+ "-" + calendar.get(Calendar.SECOND)+".jpg";
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile,new File(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Product Engineering Solutions | Information Technology Services"));
//		Assert.assertTrue(title.contains("Product Technology Services"));
	}

	@BeforeTest
	public void beforeTest() {
		File file = new File("C:/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	public static void main(String[] args) {
		 System.out.println("Working Directory = " +
	              System.getProperty("user.dir"));
	}
	
	
}