package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Upload_UsingRobotClass_Page extends BaseLibrary{
	
String uploadFilePath ="C:\\Users\\ACER\\eclipse-workspace\\Automation_framework_new\\testdata\\testData_configFile.properties";
	
	public Upload_UsingRobotClass_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=\"upload and download\"]")
	private WebElement uploadAndDownload;
	
	@FindBy(xpath = "//input[@id=\"File1\"]")
	private WebElement choseFile;
	
	
	public void clickUploadAndDownload() {
		uploadAndDownload.click();
	}
	
	public void clickOnchosefile() {
		choseFile.click();
		uploadUsingRobotClass(uploadFilePath);
	}

}
