package LaunchPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;


public class Launch {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.opera.driver","C:\\Users\\venkat\\eclipse-workspace\\Selenium\\Driver\\operadriver.exe");
		WebDriver Driver = new OperaDriver();
		Driver.get("https://www.gamestheshop.com");
		Thread.sleep(3000);
		TakesScreenshot Ts = (TakesScreenshot) Driver ;
		File Src = Ts.getScreenshotAs(OutputType.FILE);
	    File Des = new File("C:\\Users\\venka\\eclipse-workspace\\Selenium\\Snapshot\\venkat.png");
	    FileUtils.copyDirectory(Src, Des);
	    Driver.close();
	

}
}
