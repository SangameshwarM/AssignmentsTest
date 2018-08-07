package com.cg.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ViewSeats {
	
	@FindBy(how=How.XPATH,using="//*[@id=\"8826688\"]/div/div[2]/div[1]")
	WebElement seats;
	@FindBy(how=How.XPATH,using="//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]")
	WebElement board;
	@FindBy(how=How.XPATH,using="//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[2]")
	WebElement drop;
	@FindBy(how=How.XPATH,using="//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")
	WebElement proceed;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-04\"]")
	WebElement name;
	@FindBy(how=How.XPATH,using="//*[@id=\"22_0\"]")
	WebElement gender;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-01\"]")
	WebElement age;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-05\"]")
	WebElement email;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-06\"]")
	WebElement phone;
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[4]/div/div/div[1]/div[5]/div/div[2]/div/label[2]/span")
	WebElement secure;
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")
	WebElement proceedpay;
}

