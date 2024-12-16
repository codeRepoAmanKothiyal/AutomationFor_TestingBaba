package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Practice_TextPage extends BaseLibrary {
	
	public Practice_TextPage () {
		PageFactory.initElements(driver, this);
		// this is getting user to initialize elements
	}
	
	@FindBy(xpath = "//button[@data-target =\"#elements\"]")
	private WebElement elementBtn;
	// //a [@class =\"nav-link active\" and text()=\"text box\"]"
	@FindBy(xpath="//a [text()=\"text box\"]")
	private WebElement textbox;
	
	@FindBy(xpath = "//input [@id=\"fullname1\"]")
	private WebElement fullName;
	
	@FindBy(xpath = "//input [@id=\"fullemail1\"]")
	private WebElement email;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/textarea[1]")
	private WebElement currentAddress;
	
	@FindBy(xpath= "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/textarea[2]")
	private WebElement permanentAddress;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/input[3]")
	private WebElement submitBtn;
	

	
	
	
	public void clickOnElementBtn() {
		elementBtn.click();
	}
	
	public void clickOnTextbox() {
		textbox.click();
	}
	
	public void enterValueFullName(String fullname) {
		fullName.clear();
		fullName.sendKeys(fullname);
	}
	public void enterValueEmail(String emailid) {
		email.clear();
		email.sendKeys(emailid);
	}
	
	public void enterValueCurrentAddress(String cAddress) {
		currentAddress.clear();
		currentAddress.sendKeys(cAddress);
	}
	
	public void enterValuePermanentAddress(String pAddress) {
		permanentAddress.clear();
		permanentAddress.sendKeys(pAddress);
	}
	
	public void clickOnSubmitBtn() {
		submitBtn.click();
	}
}
