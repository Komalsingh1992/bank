package OnlySelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioByList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		List<WebElement> radio=driver.findElements(By.name("sex"));
		int size=radio.size();
		System.out.println(size);
		for(int i =0;i<size;i++) {
			if(radio.get(i).getText().contains("Male")) {
				radio.get(i).click();
				System.out.println(radio.get(i).isSelected());
			}
		}

	}

}
