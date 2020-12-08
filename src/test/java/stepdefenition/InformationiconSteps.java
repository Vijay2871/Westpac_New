package stepdefenition;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import pageObjects.InfoIcon;

public class InformationiconSteps {
	
	WebDriver driver;
	  InfoIcon infoicon;  
	  ConfigFileReader configFileReader;
	 TestContext testContext;

	 
	 public InformationiconSteps(TestContext context) {
		 testContext = context;
		 infoicon = testContext.getPageObjectManager().getInfoIcon();
		 }
	
	
	 @Given("^The user click the Westpac url on chrome browser and enter$")
	 public void the_user_click_the_Westpac_url_on_chrome_browser_and_enter() throws Throwable {
		infoicon.seturl();
	}

	 @Given("^User will see the Dashboard page of Westpac website$")
	 public void user_will_see_the_Dashboard_page_of_Westpac_website() throws Throwable {
	 infoicon.kiwicalculator();
	}

	 @Then("^User clicks the option KiwiSaver  on the top corner$")
	 public void user_clicks_the_option_KiwiSaver_on_the_top_corner() throws Throwable {
	    infoicon.kiwicalculatoroption();
	}

	 @Then("^User can click the KiwiSaver Retirement Calculator$")
	 public void user_can_click_the_KiwiSaver_Retirement_Calculator() throws Throwable {
	    infoicon.kiwicalculatoroptionclick();
	}

	 @Then("^User can see the information icon in the Retirement calculator page$")
	 public void user_can_see_the_information_icon_in_the_Retirement_calculator_page() throws Throwable {
	    infoicon.infoclick();
	}

}
