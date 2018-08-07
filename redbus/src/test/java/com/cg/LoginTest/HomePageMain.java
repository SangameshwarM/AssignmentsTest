package com.cg.LoginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
public class HomePageMain {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		HomePage page = PageFactory.initElements(driver,HomePage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		page.source.sendKeys("Pune");
		Thread.sleep(2000);
		page.source.sendKeys(Keys.ENTER);
		//page.source1.click();
		page.destination.sendKeys("Hyderabad");
		Thread.sleep(2000);
		page.source.sendKeys(Keys.ENTER);
		///page.destination1.click();
		Thread.sleep(2000);
		page.date.click();
		page.onward_cal.click();
		page.submit.click();

		
		ViewSeats views = PageFactory.initElements(driver,ViewSeats.class);
		views.seats.click();
		Thread.sleep(10000);
		WebElement	element = driver.findElement(By.xpath("//*[@id=\"rt_8826688\"]/div/div/div/div[2]/div[2]/div[2]/canvas"));

	    Actions builder = new Actions(driver);
	    builder.moveToElement(element,60,40).click().build().perform();
	    Thread.sleep(2000);
	    views.board.click();
	    views.drop.click();
	    Thread.sleep(2000);
	    views.proceed.click();
	    Thread.sleep(2000);
	    views.name.sendKeys("sangameshwar");
	    views.gender.click();
	    views.age.sendKeys("21");
	    views.email.sendKeys("sangameshwar@gmail.com");
	    views.phone.sendKeys("9666570195");
	    views.secure.click();
	    Thread.sleep(2000);
	    views.proceedpay.click();
	    
	}
}