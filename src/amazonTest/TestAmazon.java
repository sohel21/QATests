package amazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAmazon {
public static void main(String[] args) throws Exception {
	 WebDriver driver=new FirefoxDriver();
	 //WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("abrarsohel@gmail.com");
        driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("Aliya@210190");
        driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
        driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("US Polo watch for men");
        driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
        driver.findElement(By.xpath(".//*[@id='result_8']/div/div/div/div[2]/div[2]/a/h2")).click();
        driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
        driver.findElement(By.xpath(".//*[@id='hlb-ptc-btn-native']")).click();
        driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("Awaiz@210190");
        driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
        /*driver.findElement(By.xpath(".//*[@id='add1']")).sendKeys("Gladewood");
        driver.findElement(By.xpath(".//*[@id='city']")).sendKeys("Plano");
        driver.findElement(By.xpath(".//*[@id='state']")).sendKeys("Texas");
        driver.findElement(By.xpath(".//*[@id='country']")).sendKeys("US");
        driver.findElement(By.xpath(".//*[@id='postcode']")).sendKeys("75075");
        driver.findElement(By.xpath(".//*[@id='phone']")).sendKeys("385237890");
        driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("abrar21");
        driver.findElement(By.xpath(".//*[@id='cpassword']")).sendKeys("abrar21");
        driver.findElement(By.xpath(".//*[@id='newsletter']")).click();
        driver.findElement(By.xpath(".//*[@id='terms']")).click();
        driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[16]/td/input")).click();*/



}
}
