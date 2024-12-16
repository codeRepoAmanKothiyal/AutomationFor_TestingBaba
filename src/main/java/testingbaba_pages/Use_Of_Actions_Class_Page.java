package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Use_Of_Actions_Class_Page  extends BaseLibrary{
	
	Actions act = new Actions(driver);
	
	public Use_Of_Actions_Class_Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//h2[@class=\"mb-0\"])[3]")
	private WebElement widgits;
	
	@FindBy(xpath = "//a[text()=\"tool tips\"]")
	private WebElement toolTips;
	
	@FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[14]")
	private WebElement hoverMeButton;
	
	@FindBy(xpath = "//button[@title=\"you hovered over the button\"]")
	private WebElement checkHoverTextisDisplay;
	
	@FindBy(xpath = "//a[text()=\"slider\"]")
	private WebElement slider;
	
	@FindBy(xpath = "(//h2[@class=\"mb-0\"])[4]")
	private WebElement interactions;
	
	
	public void clickWidgits() {
		widgits.click();
	}
	
	public void clickToolTips() {
		toolTips.click();
	}
	
	public void hoveronHoverMeButton() throws InterruptedException {
		act.moveToElement(hoverMeButton).perform();
		Thread.sleep(3000);	
	}
	
	public void checkHovertext() {
		checkHoverTextisDisplay.isDisplayed();
	}
	
	public void performRightClick() throws InterruptedException {
		act.contextClick(hoverMeButton).perform();
		Thread.sleep(3000);		
	}
	
	public void clickInteractions() {
		interactions.click();	
	}
	

}
