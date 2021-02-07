// click element with pattern//



package amazonTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.sun.jdi.InternalException;

public class findElementPattern {
	WebDriver driver;
	static Screen myScreen;
	static JavascriptExecutor jse;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		driver.get("https://www.amazon.ca/");
		try {
			myScreen = new Screen();
			Pattern p1 = new Pattern("C:\\Users\\pawan\\eclipse-workspace\\amazonTestCase\\assets\\gift.PNG");
			Pattern p2 = new Pattern("C:\\Users\\pawan\\eclipse-workspace\\amazonTestCase\\assets\\jbl.PNG");

			myScreen.wait(p1,5);
			myScreen.click(p1);
			Thread.sleep(3000);
			
			myScreen.wait(p2,5);
			myScreen.click(p2);
			Thread.sleep(3000);
			
			
			jse = (JavascriptExecutor)driver;
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
