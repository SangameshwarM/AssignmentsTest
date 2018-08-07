package com.cg.AmazonDemo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeTest {

	WebDriver driver = null; 
	   @Given("Open Amazon$") 
	   public void goToRegPage() { 
		    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.navigate().to("https://www.amazon.in/");
	   }
	   
	   @When("^I enter Search as (.*)$") 
	   public void enterUsername(String arg1) {   
		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.accept.click();
		   home.navigation.click();
		   driver.navigate().to("https://www.amazon.in/Micromax-inches-32T8361HD-32T8352D-Ready/dp/B0784SX2SP/ref=sr_1_9?s=electronics&ie=UTF8&qid=1533618009&sr=1-9&keywords=TV");
		   home.navigationto.click();
	   }
	   @Then("^TV Should be added to cart$")
	   public void checkPass() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   
	   @When("^I Search as (.*)$") 
	   public void enterUsername1(String arg1) { 

		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.accept.click();
		   home.sg.click();
		   driver.navigate().to("https://www.amazon.in/House-Horizontal-Glasses-Definition-Periscope/dp/B073Y5NQD8/ref=sr_1_11?s=electronics&ie=UTF8&qid=1533618245&sr=1-11&keywords=sunglasses");
		   home.navigationto.click();
	   }
	   @Then("^Sun Glasses Should be added to cart$")
	   public void checkPass1() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^I click Search (.*)$") 
	   public void enterUsername2(String arg1) { 

		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.accept.click();
		   home.note4.click();
		   driver.navigate().to("https://www.amazon.in/Mi-Max-Black-64-GB/dp/B073VLGL5Y/ref=sr_1_2?s=electronics&ie=UTF8&qid=1533618342&sr=1-2&keywords=Mi+Note4");
		   home.navigationto.click();
	   }
	   @Then("^Mi Note4 Should be added to cart$")
	   public void checkPass2() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^I want to buy (.*)$") 
	   public void enterUsername3(String arg1) { 

		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.accept.click();
		   home.watch.click();
		   driver.navigate().to("https://www.amazon.in/Fossil-Grant-Chronograph-Analog-Black/dp/B00BEU5CTE/ref=sr_1_4?s=watches&ie=UTF8&qid=1533618769&sr=1-4&keywords=fossil+watch");
		   home.navigationto.click();
	   }
	   @Then("^fossil watch Should be added to cart$")
	   public void checkPass3() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^I wish to Buy (.*)$") 
	   public void enterUsername4(String arg1) { 

		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.accept.click();
		   home.iphone10.click();
		   driver.navigate().to("https://www.amazon.in/Apple-iPhone-Space-Grey-256GB/dp/B072LNNSQN/ref=sr_1_7?s=electronics&ie=UTF8&qid=1533619404&sr=1-7&keywords=iphone+10");
		   home.navigationto.click();
	   }
	   @Then("^Iphone10 Should be added to cart$")
	   public void checkPass4() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^All Items are added (.*)$") 
	   public void enterUsername5(String arg1) { 
		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.cart.click();
		   home.checkout.click();
	   }
	   
}
