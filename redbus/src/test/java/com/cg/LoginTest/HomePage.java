package com.cg.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	@FindBy(how=How.ID,using="src")
	WebElement source;
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[1]/div/ul/li[5]")
	WebElement source1;
	@FindBy(how=How.ID,using="dest")
	WebElement destination;
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")
	WebElement destination1;
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[3]/div/label")
	WebElement date;
	@FindBy(how=How.XPATH,using="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[5]")
	WebElement onward_cal;
	@FindBy(how=How.XPATH,using="//*[@id=\"search_btn\"]")
	WebElement submit;
	

        
}
