package SwagLabs_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaglabsTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		
		//Launch the Swag labs login page
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		
		//For Execution Speed match
		Thread.sleep(2000);
		
		
		//Enter Username
		WebElement Username = driver.findElement(By.id("user-name"));
		Username.sendKeys("standard_user");
		Thread.sleep(1000);
		
		
		//Enter password
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		
		//Click on Login button
		WebElement Loginbutton = driver.findElement(By.className("btn_action"));
		Loginbutton.click();			
		Thread.sleep(2000);
		
		
		//Click on Add to Cart btn
		WebElement AddtoCart_Product1 = driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]"));
		AddtoCart_Product1.click();
		Thread.sleep(2000);
		
		
		WebElement AddtoCart_Product2 = driver.findElement(By.xpath("//div[@class='inventory_list']//div[4]//div[3]//button[1]"));
		AddtoCart_Product2.click();
		Thread.sleep(2000);
		
		
		//Click on Go to Cart btn
		WebElement GotoCart = driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]"));
		GotoCart.click();
		Thread.sleep(2000);
		
		
		//Click on Checkout btn
		WebElement Checkout = driver.findElement(By.xpath("//a[normalize-space()='CHECKOUT']"));
		Checkout.click();
		Thread.sleep(2000);
		
		
		//Enter First Name
		WebElement Firstname = driver.findElement(By.id("first-name"));
		Firstname.sendKeys("Rushi");
		Thread.sleep(1000);
		
		
		//Enter Last Name
		WebElement Lastname = driver.findElement(By.id("last-name"));
		Lastname.sendKeys("Panchal");
		Thread.sleep(1000);
		
		
        //Enter Zip-Code 
		WebElement Zipcode = driver.findElement(By.id("postal-code"));
		Zipcode.sendKeys("411041");
		Thread.sleep(2000);
 		
		
        //Click on Continue btn
		WebElement Continue = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
		Continue.click();
		Thread.sleep(3000);
		
		//To Scroll the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	    Thread.sleep(1500);    
	        
		//Click on Finish btn
		WebElement Finishbtn = driver.findElement(By.xpath("//a[normalize-space()='FINISH']"));
		Finishbtn.click();
		Thread.sleep(3000);
		
		
		//Order placed Msg display
		WebElement ordermsg = driver.findElement(By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']"));
	    
	    
		//Placed Msg Stored in String 
		String Orderplacced = ordermsg.getText();
		
         
		//For closing current Window
		driver.close();
		

		//For Checking Expected msg to Actual msg 
		if(Orderplacced.equals("THANK YOU FOR YOUR ORDER"))
		{
			System.out.println("\n\nYour Order is Sucessfully Placed,\n And has been dispatched..");
		}
		else
		{
			System.out.println("Order is not Placed,\n And Not has been dispatched..");
		}		
		
	}

}
