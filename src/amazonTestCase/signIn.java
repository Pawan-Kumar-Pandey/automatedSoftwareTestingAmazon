package amazonTestCase;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class signIn {

	WebDriver driver;
	Actions actions1;
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\SELENIUM\\\\\\\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&prevRID=NFR7SDADX1S511SR8E4J&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		actions1= new Actions(driver);
		
		actions1.click(driver.findElement(By.id("ap_email")))
		.sendKeys("ksamra138@gmail.com"+Keys.TAB)	
		.build()
		.perform();
			
			
		WebElement con = driver.findElement(By.id("continue"));	
		con.click();
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("sorvkomal123"); 
		
		WebElement sign = driver.findElement(By.id("signInSubmit"));	
		sign.click();
		
		
		
			
	        
			
			
			
 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
	signIn myobj=new signIn();
	myobj.invokeBrowser();
		
		

	}

}






