package Selesforcesautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewDashboard{
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option =new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver =new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']/button")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-accordion__summary']")).click();
		
		driver.findElement(By.xpath("//p[text()='Dashboards']/ancestor::li")).click();
		
		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
		
		WebElement frame= driver.findElement(By.xpath("//div[@class='dashboardContainer']/iframe"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("dashboardNameInput")).sendKeys("salesforce automation byTonyBalaji");
		
		driver.findElement(By.id("submitBtn")).click();
		
		driver.switchTo().defaultContent();

		   
	    Thread.sleep(500);
		WebElement second = driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
		driver.switchTo().frame(second);
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String T1 = driver.getTitle();
		
		
		driver.findElement(By.xpath("//button[text()='Done']")).click();
        String t2= driver.getTitle();
		
        
        
        if(T1.equals(t2)) {
        	System.out.println("created Successfully");
        
        }

	
	
	
	
	
	
	}
	
	
	
	
	
	
	
}