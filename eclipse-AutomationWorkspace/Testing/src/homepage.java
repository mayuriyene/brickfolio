import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class homepage {

	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	//	WebDriverManager.chromedriver.setup();
		
		WebDriver driver=new ChromeDriver();
	Thread.sleep(200);
		driver.get("https://brickfolio.in/managed-offices/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class=\"form-control name\"]")).sendKeys("XYZ");
		driver.findElement(By.xpath("//*[@class=\"form-control mobile\"]")).sendKeys("9221166");
		driver.findElement(By.xpath("//*[@class=\"form-control email\"]")).sendKeys("XYZ@gmail.com");
		driver.findElement(By.id("submitEnq")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul/li[3]/a")).click();
		
		
}

		
//		  File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		  System.out.println(ss); String str= RandomString.make(); File f= new
//		  File("E:\\OJT\\Automated SS" +str+ ".jpg"); FileHandler.copy(ss, f);
//		 
	}