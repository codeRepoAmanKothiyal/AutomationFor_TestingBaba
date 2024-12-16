package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbaba_pages.Contact_Page;
import testingbaba_pages.Login_page;

public class Contect_page_Test extends BaseLibrary {
	
	Login_page ob;
	Contact_Page cp;
	
	@BeforeTest
	public void getLaunchUrl_TestingBaba() {
		
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob = new Login_page();
		cp = new Contact_Page();
	}
	
	@Test(priority = 0)
	public void getTitle_TestingBaba() {
		
		ob.getTitle_TestingBaba(); 	
	}
	@Test(priority = 1)
	public void clickOnClosebtn() {
		ob.clickOnClosebtn();
	}
	
	@Test(priority = 2)
	public void clickOnContactLinkText() throws InterruptedException {
		Thread.sleep(1000);
		cp.clickOncontectLinkText();
	}
	
	@Test(priority = 3)
	public void enterValueName() {
		cp.enterValueName(getReadData("fullName"));
	}
	
	@Test(priority = 4)
	public void enterValueEmailID() {
		cp.enterValueEmail(getReadData("emailid"));
	}
	
	@Test(priority = 5)
	public void enterValueMobNum() {
		cp.enterValueMobileNum(getReadData("mobNum"));
	}

}
