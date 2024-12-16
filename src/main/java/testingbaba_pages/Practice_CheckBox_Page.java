package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Practice_CheckBox_Page extends BaseLibrary{

	
	public Practice_CheckBox_Page() {
		PageFactory.initElements(driver, this);
		// this is getting user to initialize elements	
	}
	
	@FindBy(xpath = "//a[text()=\"check box\"]")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@id=\"myCheck\"]")
	private WebElement mobileCheckbox;
	
	@FindBy(xpath = "//h6[@id=\"text\"]")
	private WebElement verifyMobileClicked;
	
	@FindBy(xpath = "//input[@id=\"mylaptop\"]")
	private WebElement laptopCheckbox;
	
	@FindBy(xpath = "//h6[@id=\"text1\"]")
	private WebElement verifyLaptopClicked;
	
	@FindBy(xpath = "//input[@id=\"mydesktop\"]")
	private WebElement desktopCheckbox;
	
	@FindBy(xpath = "//h6[@id=\"text2\"]")
	private WebElement verifyDesktopClicked;
	
	
	public void clickOnCheckboxBtn() {
		checkbox.click();
		driver.switchTo().frame(0);
	}
	
	public void clickOnMoblieCheckbox() throws InterruptedException {
		Thread.sleep(1000);
		mobileCheckbox.click();
	}
	
	public void checkMobileCheckboxClicked() {
		String verifyText1=verifyMobileClicked.getText();
		if(verifyText1.contains("Mobile")) {
			System.out.println("Passed... Mobile Checkbox Verified");
		}else {
			System.out.println("Failed... Mobile Checkbox Verified");
		}
	}
	
	public void clickOnLaptopcheckbox() {
		laptopCheckbox.click();
	}
	
	public void checkLaptopCheckboxClicked() {
		String verifyText2=verifyLaptopClicked.getText();
		if(verifyText2.contains("Laptop")) {
			System.out.println("Passed... Laptop Checkbox Verified");
		}else {
			System.out.println("Failed... Laptop Checkbox Verified");
		}
	}
	
	public void clickOnDesktopCheckbox() {
		desktopCheckbox.click();
	}
	
	public void checkDesktopCheckboxClicked() {
		String verifyText3=verifyDesktopClicked.getText();
		if(verifyText3.contains("Desktop")) {
			System.out.println("Passed... Desktop Checkbox Verified");
		}else {
			System.out.println("Failed... Desktop Checkbox Verified");
		}
	}
	
}
