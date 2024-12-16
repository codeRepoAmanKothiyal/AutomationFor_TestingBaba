package testingbaba_pages;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Practice_RadioButtons_Page extends BaseLibrary {
	
	public Practice_RadioButtons_Page() {
		
		PageFactory.initElements(driver, this);
		// this is getting user to initialize elements	
	}
	
	@FindBy(xpath = "//a[text()=\"radio buttons\"]")
	private WebElement radioButton;
	
	@FindBy(xpath = "//input[@id=\"yes\"]")
	private WebElement yesRadioBtn;
	
	@FindBy(xpath = "//input[@id=\"impressive\"]")
	private WebElement impressiveRadioBtn;
	
	@FindBy(xpath ="//input[@id=\"no\"]")
	private WebElement noRadioBtn;
	
	@FindBy(xpath = "//p[@id=\"radio-content\"]")
	private WebElement verifyRadioBtnText;
	
	
	public void clickOnRadioBtn() {
		radioButton.click();
	}
	
	public void clickOnYesRadioBtn() {
		yesRadioBtn.click();
	}
	
	public void clickOnImpressiveRadioBtn() {
		impressiveRadioBtn.click();
	}
	
	public void clickOnNoRadioBtn() {
		noRadioBtn.click();
	}
	
	public void checkWhichRadioBtnClicked() {
		String verifyText=verifyRadioBtnText.getText();
		if(verifyText.contains("impressive")) {
			System.out.println("Passed... Impressive Checkbox Verified");
		}else if(verifyText.contains("yes")) {
			System.out.println("Passed... Yes Checkbox Verified");
		}else if(verifyText.contains("no")) {
			System.out.println("Passed... No Checkbox Verified");
		}else {
			System.out.println("failed...");
		}
	}
	
	

}
