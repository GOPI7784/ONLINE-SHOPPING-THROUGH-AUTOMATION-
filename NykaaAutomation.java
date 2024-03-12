package Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaAutomation {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace\\NewWorkspace"
				+ "\\SELENIUMPROJECT\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions ac =new Actions(driver);
		Robot r = new Robot();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.nykaa.com/");

		WebElement login = driver.findElement(By.xpath("(//button[@kind = \"secondary\"])[1]"));
		ac.moveToElement(login).build().perform();
		ac.click(login).build().perform();
		
		WebElement mobilelogin = driver.findElement(By.xpath("//input[@class = \"input text-center\"]"));
		mobilelogin.click();
		mobilelogin.sendKeys("7904884713");
		
		WebElement proceed = driver.findElement(By.xpath("//button[@type = \"submit\"]"));
		proceed.click();
		
		Thread.sleep(2000);
		
		WebElement OTP= driver.findElement(By.name("otpValue"));
		OTP.click();
		
		Scanner s = new Scanner(System.in);
		String OTP1 = s.next();
		System.out.println(OTP1);
		OTP.sendKeys(OTP1);
		
		WebElement Verify = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		Verify.click();
		
		WebElement hair = driver.findElement(By.xpath("//a[text() = \"hair\"]"));
		ac.moveToElement(hair).build().perform();
		
		
		WebElement hairoil = driver.findElement(By.xpath("(//a[text() = \"Hair Oil\"]) [1]"));
		ac.moveToElement(hairoil).build().perform();
		ac.click(hairoil).build().perform();
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		for(String title :windowHandles) {
			String titles = driver.switchTo().window(title).getTitle();
			System.out.println(titles);
			
		}
		String page = "Hair Oil - Buy Hair Oil Online at Best Prices in India | Nykaa";
		
		for( String title :windowHandles) {
			if(driver.switchTo().window(title).getTitle().equals(page)) {
				break;
			}
			
		}
		
		Thread.sleep(3000); 
	    JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,3000)");
        
        
		WebElement Bag = driver.findElement(By.xpath("(//span[text()=\"Add to Bag\"]) [1]"));
		
		js.executeScript("arguments[0].scrollIntoView();", Bag);
		js.executeScript("arguments[0].click();", Bag);
		Thread.sleep(3000);
		
		WebElement clickbag = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[2]/div[2]/button/span"));
		
		js.executeScript("arguments[0].scrollIntoView();", clickbag);
		js.executeScript("arguments[0].click();", clickbag);
		Thread.sleep(3000);
		
		 TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        File dest = new File("C:\\Users\\GOPI V\\eclipse-workspace\\NewWorkspace\\SELENIUMPROJECT\\screenshot\\click.png");
	        FileUtils.copyFile(src, dest);
	        
	        Thread.sleep(3000);
	        
	        
	        System.out.println("screenshot is taken");
	        
	        WebElement iframe = driver.findElement(By.xpath("//iframe[@src=\"/mobileCartIframe?ptype=customIframeCart\"]"));
			driver.switchTo().frame(iframe).findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div/div[2]/button/div")).click();
		    Thread.sleep(3000);
			
			 TakesScreenshot ts2 = (TakesScreenshot) driver;
		        File src2 = ts2.getScreenshotAs(OutputType.FILE);
		        File dest2 = new File("C:\\Users\\GOPI V\\eclipse-workspace\\NewWorkspace\\SELENIUMPROJECT\\screenshot\\nykaa4.png");
		        FileUtils.copyFile(src2, dest2);
		        Thread.sleep(3000);
		        System.out.println("screenshot is taken");
		        
//			WebElement clickaddre = driver.findElement(By.xpath("//div[@class = \"css-1pan5g8 e1gecm6x0\"]"));
//			ac.moveToElement(clickaddre).build().perform();
//			ac.click(clickaddre).build().perform();
			
			
		
//		   WebElement address = driver.findElement(By.xpath("//textarea[@placeholder = \"Road Name/ Area /Colony\"]"));
//			 ac.moveToElement(address).build().perform();
//			 ac.click(address).build().perform();
//			 address.sendKeys("small street parameswaramangalam arakkonam");
		    
//			WebElement doorno = driver.findElement(By.xpath("//input[@placeholder = \"House/ Flat/ Office No.\"]"));
//			 ac.moveToElement(doorno).build().perform();
//			ac.click(doorno).build().perform();
//			 doorno.sendKeys("159");
		    
//			WebElement pincode = driver.findElement(By.xpath("//input[@placeholder = \"Pincode\"]"));
//			ac.moveToElement(pincode).build().perform();
//			ac.click(pincode).build().perform();
//			pincode.sendKeys("631151");
//			Thread.sleep(2000);
		    
//			WebElement name = driver.findElement(By.xpath("//input[@placeholder = \"Name\"]"));
//			ac.moveToElement(name).build().perform();
//			ac.click(name).build().perform();
//			name.sendKeys("Gopinath");
//		    
//			Thread.sleep(2000);
		    
//			 WebElement phoneno = driver.findElement(By.xpath("//input[@placeholder = \"Phone\"]"));
//			ac.moveToElement(phoneno).build().perform();
//			ac.click(phoneno).build().perform();
//			phoneno.sendKeys("7904884713");
		    
//			Thread.sleep(2000);
		    
//			 WebElement email = driver.findElement(By.xpath("//input[@type = \"email\"]"));
//			 ac.moveToElement(email).build().perform();
//			 ac.click(email).build().perform();
//			 email.sendKeys("gopinath070820@gmail.com");
		    
//			WebElement button = driver.findElement(By.xpath("//button[text() = \"Ship to this address\"]"));
//			ac.moveToElement(button).build().perform();
//			 ac.click(button).build().perform();
//                		
		  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div"
		  		+ "[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]/button")).click();
		  
		  
		  WebElement cashon = driver.findElement(By.xpath("//p[text() = \"Cash on delivery\"]"));
		  ac.moveToElement(cashon).build().perform();
		  js.executeScript("arguments[0].click();", cashon);
		  
		  Thread.sleep(3000);
		  TakesScreenshot ts1 = (TakesScreenshot) driver;
	        File src1 = ts1.getScreenshotAs(OutputType.FILE);
	        File dest1 = new File("C:\\Users\\GOPI V\\eclipse-workspace\\NewWorkspace\\SELENIUMPROJECT\\screenshot\\order.png");
	        FileUtils.copyFile(src1, dest1);
	        Thread.sleep(3000);
	        System.out.println("screenshot is taken");
	        
		    
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
