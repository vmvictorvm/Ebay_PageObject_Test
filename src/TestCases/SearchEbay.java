package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjectRepository.EbayHomePage;
import ObjectRepository.EbaySearchPage;

public class SearchEbay {
	WebDriver driver;

	
	@Test
	public void testSearchLaptop() {
		//Set to use Chrome browser driver
		System.setProperty("webdriver.chrome.driver", "/Users/victormclean/chromedriver");
		driver = new ChromeDriver();
		
		//Go to home page
		driver.get("http://www.ebay.com");
		
		//Passing our driver into home page class constructor 
		//Enter search keywords and click search button
		EbayHomePage homePage = new EbayHomePage(driver);
		homePage.searchField().sendKeys("hp omen laptop");
		homePage.searchBtn().click();
		
		//Passing our driver into search page class constructor
		//Click on "see all" link to display a list of memory
		//Select 8gb memory checkbox and click apply button
		EbaySearchPage resultPage = new EbaySearchPage(driver);
		resultPage.seeAllMemory().click();
		
		//Explicit wait.  Wait until the 8Gb checkbox shows up on the page before clicking on it
		WebDriverWait wd = new WebDriverWait(driver, 5);		
		wd.until(ExpectedConditions.visibilityOf(resultPage.eightGBCheckBox()));
		resultPage.eightGBCheckBox().click();
		resultPage.applyBtn().click();
	}
	
	

}
