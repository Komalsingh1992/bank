package OnlySelenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/reg/");
		 WebElement dropdwon=driver.findElement(By.id("day"));
		 Select sc=new Select(dropdwon);
		 sc.selectByVisibleText("31");
		//System.out.println();
		 
		 List<WebElement> month=driver.findElements(By.xpath("//select[@id='month']//option"));
		 int s=month.size();
		 System.out.println(s);
		// Iterator<WebElement> it=month.iterator();
		 for(int i =0;i<s;i++) {
			 String mw=month.get(i).getText();
			 System.out.println(mw);
			 if(month.get(i).getText().contains("Mar")) {
				 month.get(i).click();
				
			 }
		 }
		 
		 List<WebElement> link=driver.findElements(By.tagName("a"));
		 int link_size=link.size();
		 System.out.println(link_size);
		 Iterator<WebElement> it=link.iterator();
		 while(it.hasNext()) {
			 String url=it.next().getAttribute("href");
			 System.out.println(url);
		 }
		 
		
		
		 
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("E:\\ks\\SeleniumJava\\ScreenShot\\sc.png");
		 FileUtils.copyFile(src,dest);
		 
		 
		 
	}
	
	

}
