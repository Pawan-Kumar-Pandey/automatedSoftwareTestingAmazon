package amazonTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.sun.jdi.InternalException;

public class sortPrice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")));
		
		driver.findElement(By.xpath("//*[@id=\"FilterItemView_sortOrder_dropdown\"]/div/span[2]/span/span/span/span")).click();
		wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"FilterItemView_sortOrder_dropdown\"]/div/span[2]/span/span/span/span")));
		
				
		try {
			Screen myScreen = new Screen();
			Pattern p1 = new Pattern("C:\\Users\\pawan\\eclipse-workspace\\amazonTestCase\\assets\\price.PNG");
			myScreen.wait(p1,5);
			myScreen.click(p1);
			Thread.sleep(3000);
		
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,800)");		
		}
		catch (FindFailed e) {
			e.printStackTrace();
		}
		catch (InternalException e) {
			e.printStackTrace();
		}
	}

}
