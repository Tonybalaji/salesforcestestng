package Selesforcesautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.asm.Advice.Enter;

public class Edit {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chrome_options = new ChromeOptions();
		chrome_options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(chrome_options);
		driver.manage().window().maximize();
		
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
	    driver.findElement(By.id("Login")).click();
	      
	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

	    driver.findElement(By.xpath("//button[text()='View All']")).click();

	   
	   driver.findElement(By.xpath("//div[@class='slds-accordion__summary']")).click();
	   driver.findElement(By.xpath("//p[text()='Dashboards']/ancestor::li")).click();
	   
	   WebElement search = driver.findElement(By.xpath("//input[@class='search-text-field slds-input input uiInput uiInputText uiInput--default uiInput--input']"));
	   
	   search.sendKeys("salesforce automation byTonyBalaji",Keys.ENTER);
	   
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("(//div[@class='slds-hyphenate']/parent::span)[1]")).click();
	   
	    Thread.sleep(5000);
	    WebElement second = driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
		driver.switchTo().frame(second);
		
		driver.findElement(By.xpath("//button[text()='Edit']")).click();
		
		driver.switchTo().defaultContent();
		   WebElement frame =driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
	       driver.switchTo().frame(frame);
	       
	       driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled editProperties']")).click();
	       driver.findElement(By.xpath("(//div[@class='slds-form-element__control']//input[@class='slds-input'])[2]")).sendKeys("Hi There");   
	       String t1= driver.getTitle();   
	       driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	       driver.findElement(By.xpath("//button[text()='Done']")).click();
	       driver.findElement(By.xpath("//footer[@class='slds-modal__footer']//button[text()='Save']")).click();
	       String t2 = driver.getTitle();
		
	       if(t1.equals(t2)) {
	    	   System.out.println("The Dashboard is Edited Successfully");
	       }
		
	   
	}
	

}
