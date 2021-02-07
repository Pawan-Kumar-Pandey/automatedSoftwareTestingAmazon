package amazonTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectElement {
	WebDriver driver;
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\SELENIUM\\\\\\\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.amazon.com/ref=nav_logo");
			WebElement all = driver.findElement(By.className("hm-icon-label"));
		    all.click(); 
		    
		    WebElement electronics = driver.findElement(By.linkText("Electronics"));
		    electronics.click(); 
		    
		    WebElement headphones = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[9]/a"));
		    headphones.click();
		    
		    WebElement earbud = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
		    earbud.click();
		    
		    WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		    cart.click();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		selectElement myobj=new selectElement();
		myobj.invokeBrowser();
		

	}

}

