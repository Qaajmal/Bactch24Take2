package com.dresses.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dresses.pages.DressesPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DressesStep {
	WebDriver driver;
	DressesPage pf;

	@Given("^user visit practice site$")
	
	public void user_visit_practice_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//***driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)***;
		pf = new DressesPage(driver);
	    
	    
	}

	@When("^user click on dresses tab$")
	public void user_click_on_dresses_tab() throws Throwable {
	   //driver.findElement(By.xpath("(//*[contains(text(),'Dresses')])[5]")).click(); 
	   pf.getDressesTab().click(); 
	}

	@When("^user capture all dress price from result set$")
	public void user_capture_all_dress_price_from_result_set() throws Throwable {
	    
	    
	}

	@When("^user add to cart second highest price dress$")
	public void user_add_to_cart_second_highest_price_dress() throws Throwable {
	    
	    
	}

	@Then("^user verify total price plus shipping$")
	public void user_verify_total_price_plus_shipping() throws Throwable {
	    
	    
	}

}
