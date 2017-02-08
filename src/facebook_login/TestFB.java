package facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFB {

	public static void main(String[] args) throws InterruptedException {
		// 
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("avez0@ymail.com");
	    driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("210190");
	    driver.findElement(By.xpath(".//*[@id='u_0_o']")).click();
	    //Thread.sleep(5000); 
	    //driver.close();
	    
	}

}
