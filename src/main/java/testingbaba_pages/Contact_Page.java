package testingbaba_pages;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Contact_Page extends BaseLibrary{
	
	public Contact_Page() {
		PageFactory.initElements(driver, this);
		// this is getting user to initialize elements	
	}
	
	@FindBy(xpath = "//a[text()=\"Contact\"]")
	private WebElement contectLinkText;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div[3]/form/div[1]/input")
	private WebElement name;

	@FindBy(xpath = "/html/body/section[1]/div/div/div[3]/form/div[2]/input")
	private WebElement email;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div[3]/form/div[3]/input")
	private WebElement mobileNum;
	
	
	public void clickOncontectLinkText() {
		contectLinkText.click();
	}
	
	public void enterValueName(String fullname) {
		name.clear();
		name.sendKeys(fullname);
	}
	
	public void enterValueEmail(String emailid) {
		email.clear();
		email.sendKeys(emailid);
	}
	public void enterValueMobileNum(String mobNum) {
		mobileNum.clear();
		mobileNum.sendKeys(mobNum);
	}
}
