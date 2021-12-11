package OnlySelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		 WebElement ds=driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']"));
		 ds.clear();
		 ds.sendKeys("de");
		 ds.sendKeys(Keys.ARROW_DOWN);
		 ds.sendKeys(Keys.ENTER);
		 
		 for(int i =0;i<5;i++ ) {
			 ds.sendKeys(Keys.ARROW_DOWN);
		 }
		 ds.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);		 
		 
		 WebElement dd=driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']"));
		 dd.clear();
		 dd.sendKeys("M");
		 dd.sendKeys(Keys.ARROW_DOWN);
		 dd.sendKeys(Keys.ENTER);
		 for(int i =0;i<=1;i++ ) {
			 dd.sendKeys(Keys.ARROW_DOWN);
		 }
		 dd.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
	    //List<WebElement> dd=driver.findElements(By.xpath(""));
	    
	
	
	}

}
