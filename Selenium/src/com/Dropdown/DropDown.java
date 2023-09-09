package com.Dropdown;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venkat\\eclipse-workspace\\Selenium\\Driver\\operadriver.exe");
		WebDriver D =new ChromeDriver();
		D.manage().window().maximize();
		D.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement dd1 = D.findElement(By.id("dropdown1"));
		Select s =new Select(dd1);
		s.selectByValue("3");
		WebElement DD2 = D.findElement(By.name("dropdown2"));
		Select s1 =new Select(DD2);
		s1.selectByIndex(1);
		WebElement DD3 = D.findElement(By.xpath("//select[@id=\"dropdown3\"]"));
		Select S2 =new Select(DD3);
		S2.selectByVisibleText("Loadrunner");
	    WebElement DD4 = D.findElement(By.xpath("//select[@class=\"dropdown\"]"));
	    Select S3 =new Select(DD4);
	    S3.selectByValue("1");
	    WebElement DD5 = D.findElement(By.xpath("(//select)[5]"));
	    Select S4 =new Select(DD5);
	    S4.selectByValue("3");
	    WebElement MD = D.findElement(By.xpath("(//select)[6]"));
	    Select S5 =new Select(MD);
	    S5.selectByIndex(3);
	    S5.selectByIndex(2);
	    S5.selectByValue("4");
  
        List<WebElement> list = S5.getAllSelectedOptions();
        for (WebElement webElement : list) {
        	
        	System.out.println(webElement.getText());
			
		}
        WebElement fs = S5.getFirstSelectedOption();
        System.out.println(fs.getText());
        
        boolean multiple = S5.isMultiple();
        System.out.println(multiple);
        
	    TakesScreenshot Ts =(TakesScreenshot)D;
	    File Src =Ts.getScreenshotAs(OutputType.FILE);
	    File Des =new File("C:\\Users\\venka\\eclipse-workspace\\Selenium\\Snapshot\\DD.png");
	    FileUtils.copyFile(Src, Des);
        Thread.sleep(3000);
        D.close();
	}

}
