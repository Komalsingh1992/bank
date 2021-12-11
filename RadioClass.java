package OnlySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/reg/");
		 
		 
		 WebElement radio=driver.findElement(By.xpath("//input[starts-with(@id,'u_0_5')]"));
		 radio.click();
		
		 
	}

}
