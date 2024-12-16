package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Alerts_page extends BaseLibrary{
	
	public Alerts_page() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//button[@class=\"btn  btn-block p-0 text-left mr-5 \"]")
	private WebElement alertFrameWindowsBtn;
	
	@FindBy(xpath = "//a[text()=\"alerts\"]")
	private WebElement alerts;
	
	@FindBy(xpath = "(//button[text()=\"Click me\"])[1]")
	private WebElement seeAlert;
	
	@FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[9]")
	private WebElement alertAppearAfter5Second;
	
	@FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[10]")
	private WebElement alertConfirmBox;
	
	@FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[11]")
	private WebElement alertPrompBox;
	
	
	public void clickOnAlertFrameAndWindowsBtn() {
		alertFrameWindowsBtn.click();
	}
	
	public void clickOnAlertBtn() {
		alerts.click();
	}
	
	public void clickOnSeeAlertMeBtn() throws InterruptedException {
		seeAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	public void clickOnAlertAppearAfter5Second() throws InterruptedException {
		alertAppearAfter5Second.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
	}
	
	public void clickOnAlertwithTwoChoice() {
		alertConfirmBox.click();
		driver.switchTo().alert().dismiss();
		
	}
	
	public void clickOnAlertPrompBox() throws InterruptedException {
		alertPrompBox.click();
		driver.switchTo().alert().sendKeys("Hi.. This is Aman");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
	}
	

	
}
