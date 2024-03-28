import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brickfolio {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriverManager.chromedriver().setup();
		
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("https://brickfolio.in");
			
			Thread.sleep(3000);
			
		//	driver.findElement(By.linkText("https://brickfolio.in/residential-properties")).click();
		 WebElement RESIDENTIALButton=driver.findElement(By.xpath("//nav[@class='nav-menu d-none d-lg-block']//a[normalize-space()='RESIDENTIAL']"));
		 RESIDENTIALButton.click();
		 
		 Thread.sleep(3000);
		String RESIDENTIAURL= driver.getCurrentUrl();
		System.out.println(RESIDENTIAURL);
			
		String Expectedurl="https://brickfolio.in/residential-properties";
		if(RESIDENTIAURL.equals(Expectedurl))
		{System.out.println(" Validation of RESIDENTIALUrl is Suceesfully");
				
		}else {
			System.out.println(" Validation of RESIDENTIALrl isFailed");
		}
		
		Thread.sleep(3000);
		WebElement COMMERCIALButton=driver.findElement(By.xpath("//nav[@class='nav-menu d-none d-lg-block']//a[normalize-space()='COMMERCIAL']"));
		COMMERCIALButton.click();
		
		String COMMERCIALurl=driver.getCurrentUrl();
		System.out.println(COMMERCIALurl);
		
		Thread.sleep(3000);
		
		String ExpedtedUrlOfCOMMERCIAL="https://brickfolio.in/commercial-properties";
		
		
		if(COMMERCIALurl.equals(ExpedtedUrlOfCOMMERCIAL))
		{
			System.out.println("Validation of COMMERCIALUrl is Sucessfully");
		}else {
			
			System.out.println("Validation of COMMERCIALUrl is Failed");
		}
		
		Thread.sleep(3000);
		WebElement INVESTMENTSButton=driver.findElement(By.xpath("//nav[@class='nav-menu d-none d-lg-block']//a[normalize-space()='INVESTMENTS']"));
		INVESTMENTSButton.click();
		
		
		 String INVESTMENTSUrl=driver.getCurrentUrl();
		 System.out.println(INVESTMENTSUrl);
		 
		String ExpedtedUrlOfINVESTMENTS="https://brickfolio.in/investment-properties";
		
		if(INVESTMENTSUrl.equals(ExpedtedUrlOfINVESTMENTS)) {
			
			System.out.println("Validation of INVESTMENTSUrl is Successfully");
		}else {
			
			System.out.println("Validation of INVESTMENTS is Failed");
		}
		
		Thread.sleep(500);
		
		WebElement HomeButton=driver.findElement(By.xpath("//nav[@class='nav-menu d-none d-lg-block']//a[normalize-space()='HOME']"));
		HomeButton.click();
		
//		driver.close();
		
		Thread.sleep(1000);
		
		
		         List<WebElement> DropdownSelectArea= driver.findElements(By.xpath("//*[@name=\"areas\"]//option"));
		           for(WebElement value:DropdownSelectArea)
		           {
		        	   
		        	       String AllValue=value.getText();
		        	       System.out.println(AllValue);
		        	       
		        	       if(AllValue.equals("Baner")) {
		        	    	   value.click();
		        	    	   
		        	       }
		        	       
		           }
			System.out.println("Dropdown of SelectArea Value validation is successfully");
			
			Thread.sleep(3000);
			
			
			List<WebElement>   DropdownSelectConfiguration =driver.findElements(By.xpath("//*[@name=\"config\"]//option"));
			       for(   WebElement DropdownSelectConfigurationValue:DropdownSelectConfiguration)
			       {
			    	   String DropdownSelectConfigurationValue1=DropdownSelectConfigurationValue.getText();
			    	              
			    	   System.out.println(DropdownSelectConfigurationValue1);
			    	   
			    	   if(DropdownSelectConfigurationValue1.equals("2BHK"))
			    	   {
			    		   DropdownSelectConfigurationValue.click();
			    		   
			    	   }
			    	   
			       }
			       System.out.println("Dropdown of SelectConfiguration Value validation is successfully"); 
			       
			       Thread.sleep(500);
			       
			List<WebElement>       SelectBudget  =driver.findElements(By.xpath("//*[@name=\"price\"]//option"));
			        for(WebElement Selectbudget:SelectBudget)
			        {
			        	        
			        	String SelectbudgetValue=Selectbudget.getText();
			        	System.out.println(SelectbudgetValue);
			        	
			        	if(SelectbudgetValue.equals("30L -40L"));
			        	
			        	
			        }
			        System.out.println("Dropdown of SelectBudget Value validation is successfully");
			        
			        Thread.sleep(500);
			        
			       WebElement SearchButton= driver.findElement(By.xpath("//button[@class='btn-primary btn-block']"));
			       SearchButton.click();
			       
			      driver.close();

	
	}

}
