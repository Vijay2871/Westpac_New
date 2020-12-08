package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.InfoIcon;

public class PageObjectManager {
	 private WebDriver driver;
private InfoIcon infoicon;
	 
	
	 
	 public PageObjectManager(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
		 
		public InfoIcon getInfoIcon(){
		 
		 return (infoicon == null) ? infoicon = new InfoIcon(driver) : infoicon;
		 
		 }
		 
		
  
}
