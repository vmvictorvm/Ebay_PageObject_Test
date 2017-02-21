package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbaySearchPage {
	
	WebDriver driver;
	public EbaySearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//"see all" link will pop up a memory list when clicked.
	@FindBy(xpath="//a[@aria-label='Memory search refinements dialog']")
	WebElement seeAllMemory;
	
	//8GB checkbox for memory
	@FindBy(id="e1-3_Memory_8GB")
	WebElement eightGBCheckBox;
	
	//Apply button
	@FindBy(xpath="//input[@type='submit']")
	WebElement applyBtn;
	
	
	public WebElement seeAllMemory() {
		return seeAllMemory;
	}
	
	public WebElement eightGBCheckBox() {
		return eightGBCheckBox;
	}
	
	public WebElement applyBtn() {
		return applyBtn;
	}
}
