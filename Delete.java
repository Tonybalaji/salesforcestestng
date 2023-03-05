package Selesforcesautomation;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Delete {
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
	   
	   WebElement ell=driver.findElement(By.xpath("//input[@class='search-text-field slds-input input uiInput uiInputText uiInput--default uiInput--input']"));
	   ell.sendKeys("salesforce automation byTonyBalaji",Keys.ENTER);
	   
	   Thread.sleep(3000);
	   WebElement br=driver.findElement(By.xpath("//*[@id=\"brandBand_2\"]/div/div/div/div/div[2]/div/div[2]/lightning-datatable/div[2]/div/div/table/tbody/tr/td[6]/lightning-primitive-cell-factory/span/div/lightning-primitive-cell-actions/lightning-button-menu"));
		Actions move=new Actions(driver);
		move.moveToElement(br).perform();
		br.click();
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']/parent::button")).click();
		System.out.println();
		
       

	}

}