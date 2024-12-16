package testingbaba_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class WebTable_Page extends BaseLibrary {
	
	String fullEmail="kothiyalaman3@gmail.com";
	String firstName="Aman Kothiyal";
	
	public WebTable_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=\"web tables\"]")
	private WebElement webTableBtn;
	
	@FindBy(xpath = "//label[text()=\"Name:\"]/following::input[1]")
	private WebElement enterName;
	
	@FindBy(xpath = "//label[text()=\"Email:\"]/following::input[1]")
	private WebElement enterEmail;
	
	@FindBy(xpath = "//button[text()=\"Save\"]")
	private WebElement save;
	
	
	
	public void clickOnWebTableBtn() {
		webTableBtn.click();
		driver.switchTo().frame(1);
	}
	
	public void enterValueForName() {
		enterName.clear();
		enterName.sendKeys(firstName);
	}
	
	public void enterValueForEmail() {
		enterEmail.clear();
		enterEmail.sendKeys(fullEmail);
	}
	
	public void ClickOnSaveBtn() {
		save.click();
	}
	
	public void validateName() {
		String expetedName =driver.findElement(By.xpath("//tr[@data-name=\""+firstName+"\"]/child::td[1]")).getText();
		
		if(firstName.contains(expetedName)) {
			System.out.println("Passed... Name Matched");
		}else {
			System.out.println("failed..");
		}
	}
	
	public void validateEmail() {
		String expetedEmail =driver.findElement(By.xpath("//tr[@data-name=\""+firstName+"\"]/child::td[2]")).getText();
		
		if(fullEmail.contains(expetedEmail)) {
			System.out.println("Passed... Email Matched");
		}else {
			System.out.println("failed..");
		}
	}

}
