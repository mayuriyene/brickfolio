package locators;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Facebook_Acc_Creation {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize(); // screen maximize
		
		driver.findElement(By.xpath("//*[@data-testid=\'open-registration-form-button\']")).click(); // create account button
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Mayuri");//first name
		driver.findElement(By.name("lastname")).sendKeys("Yene");// Last name
		driver.findElement(By.name("reg_email__")).sendKeys("8975595984");//Email /mob 
		driver.findElement(By.id("password_step_input")).sendKeys("Mayuri@123"); // pass
		Thread.sleep(3000);
		
		
		//Drop down menu
		WebElement wb= driver.findElement(By.name("birthday_day")); // birth day
		Select day=new Select(wb);
		
		//day.selectByVisibleText("24");     // Visible text  					    / type 1
		
		//day.selectByIndex(23);        	 // index of element count from 0 	 	/ type 2
		
		day.selectByValue("24");         	 //count from 1  				  		/ type 3
		
		Thread.sleep(2000);
		
		WebElement wb1= driver.findElement(By.id("month")); // birth month
		Select month=new Select(wb1);
		
		month.selectByVisibleText("Oct");  
		
		//month.selectByIndex(9);         // index of element count from 0 - 
		
		// day.selectByValue("10");          //count from 1 
		
		Thread.sleep(2000);
		
		WebElement wb2= driver.findElement(By.id("year")); // birth year
		Select year=new Select(wb2);
		year.selectByVisibleText("1996");
		
		
		Thread.sleep(2000);
		
		
		//radio button method 1
		
		//driver.findElement(By.xpath("//input[@value='1']")).click(); 
		
		//radio button method 2
		
		List<WebElement> radiosElements = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Total radio button available" +radiosElements.size());
		
		System.out.println(radiosElements.get(1).isSelected());  // radio button selected
		System.out.println(radiosElements.get(2).isDisplayed());  // radio button available
		System.out.println(radiosElements.get(1).isEnabled());     // is able to select or not
		
		
		//screenshot
		
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(ss);
		String str= RandomString.make();
		File f= new File("E:\\OJT\\Automated SS"+str+".jpg");
		FileHandler.copy(ss, f);
		
		radiosElements.get(0).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
