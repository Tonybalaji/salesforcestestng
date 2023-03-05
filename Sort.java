package Selesforcesautomation;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;

public class Sort {
public static void main(String[] args) {
	
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
   
   WebElement news=driver.findElement(By.xpath("//*[@id=\"brandBand_2\"]/div/div/div/div/div[2]/div/div[2]/lightning-datatable/div[2]/div/div/table/thead/tr/th[1]/lightning-primitive-header-factory/span/a/lightning-primitive-icon"));
   Actions move=new Actions(driver);
   move.moveToElement(news).perform();
   news.click();
 
   
   
}
}