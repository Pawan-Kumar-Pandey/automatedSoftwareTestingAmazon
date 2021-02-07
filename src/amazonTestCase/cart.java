package amazonTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class cart {
	WebDriver driver;
	public void invokeBrowser() {
	try {
		System.setProperty("webdriver.chrome.driver", "D:\\\\SELENIUM\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/TOZO-Bluetooth-Wireless-Headphones-Waterproof/dp/B07J2Z5DBM/ref=sr_1_1?dchild=1&qid=1611992595&s=electronics&sr=1-1");
		
		WebElement cart = driver.findElement(By.id("add-to-cart-button"));
	    cart.click();
	    
	    WebElement addCart = driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]"));
	    addCart.click();
		
	    
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	

	public static void main(String[] args) {
		cart myobj=new cart();
		myobj.invokeBrowser();
		

	}

}

