package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHomePage {
	WebDriver driver;
	
	public EbayHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Search field
	@FindBy(id="gh-ac")
	WebElement searchField;
	
	//Search button
	@FindBy(id="gh-btn")
	WebElement searchBtn;
	
	public WebElement searchField() {
		return searchField;
	}
	
	public WebElement searchBtn() {
		return searchBtn;
	}
}
