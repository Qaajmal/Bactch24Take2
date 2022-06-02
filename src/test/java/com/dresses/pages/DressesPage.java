package com.dresses.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DressesPage {
	WebDriver driver;
	
	public DressesPage(WebDriver driver) {
		//"this" keyword is used here to distinguish global and local variable "driver"
		//gets driver as parameter from MainClass.java and assigns to the driver 
		//instance in this class
		
	this.driver=driver;
	PageFactory.initElements(driver, this);
	//Initializes WebEliments declared in this class using driver instance. 
	}
	
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Dresses')])[5]")
	private WebElement dressesTab;

	public WebElement getDressesTab() {
		return dressesTab;
	}

	public void setDressesTab(WebElement dressesTab) {
		this.dressesTab = dressesTab;
	}
	
	

}
