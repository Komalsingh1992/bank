package OnlySelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFB {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.naukri.com/");
	String Mainwindow=driver.getWindowHandle();
	Set<String> childwindow=driver.getWindowHandles();
	int size=childwindow.size();
	System.out.println(size);
	Iterator<String> it=childwindow.iterator();
	while(it.hasNext()) {
		String cw=it.next();
		System.out.println(cw);
		if(!Mainwindow.equalsIgnoreCase(cw)) {
			driver.switchTo().window(cw);
			driver.close();
		}
	}
	driver.switchTo().window(Mainwindow);
	driver.quit();

	}

}
