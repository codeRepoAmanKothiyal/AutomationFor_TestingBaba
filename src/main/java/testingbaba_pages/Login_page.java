package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Login_page extends BaseLibrary{
	
	public Login_page(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	
	@FindBy(xpath = "//a[text()=\"Practice\"]")
	private WebElement practiceLinkText;
	
	
	public void getTitle_TestingBaba() {
		
		String title = driver.getTitle();
		System.out.println("title is "+ title);
		
	}
	
	public void clickOnClosebtn() {
		closebtn.click();
	}
	
	public void clickOnPractice() {
		practiceLinkText.click();
	}

}
