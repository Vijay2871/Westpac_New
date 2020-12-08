package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;
import junit.framework.Assert;
import managers.FileReaderManager;

@SuppressWarnings("deprecation")
public class InfoIcon {
	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public  InfoIcon(WebDriver ldriver) 
	{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	configFileReader= new ConfigFileReader();
}
	
	@FindBy(xpath="//*[@id=\\\"ubermenu-section-link-kiwisaver-ps\\\"]") WebElement kiwicalclick;
	@FindBy(xpath="//*[@href=\\\"/kiwisaver/#sidenav-4825\\\"]") WebElement retcaloption;
	@FindBy(xpath="//span[contains(@class,'sw-sidenav-item-link-text last')][text()='KiwiSaver Retirement Calculator']") WebElement retcaloptionclick;
	@FindBy(xpath="//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button/i") WebElement informationclick;
	
	public void seturl() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationurl());
	}
	
	public void kiwicalculator() throws InterruptedException  
	{
		kiwicalclick.click();
		Thread.sleep(4000);
	
	}
	
	public void kiwicalculatoroption() throws InterruptedException  
	{
		
		retcaloption.click();
		Thread.sleep(4000);

	}
	
	public void kiwicalculatoroptionclick() throws InterruptedException  
	{

		retcaloptionclick.click();
		Thread.sleep(4000);
		
	}
	
	@SuppressWarnings("deprecation")
	public void infoclick() throws InterruptedException  
	{

		informationclick.click();
		Thread.sleep(4000);
		String str="“This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver";
		Assert.assertTrue(str.contains("This calculator has an age limit of 18 to 64 years old."));
		
	}
}
