package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.crome.driver","C:\\software\\chromedriver_win32\\chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		
		
	}

}
