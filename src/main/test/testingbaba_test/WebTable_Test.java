package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbaba_pages.Login_page;
import testingbaba_pages.Practice_TextPage;
import testingbaba_pages.WebTable_Page;

public class WebTable_Test extends BaseLibrary{
	
	Login_page ob;
	Practice_TextPage ptp;
	WebTable_Page wtp;
	
	@BeforeTest
	public void getLaunchUrl_TestingBaba() {
		
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob = new Login_page();
		ptp = new Practice_TextPage();
		wtp = new WebTable_Page();
		
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
	public void clickOnPractice() throws InterruptedException {
		Thread.sleep(1000);
		ob.clickOnPractice();
	}
	
	@Test(priority = 3)
	public void clickOnElements() {
		ptp.clickOnElementBtn();
	}
	
	@Test(priority = 4)
	public void clickOnWebTableBtn() {
		wtp.clickOnWebTableBtn();
	}
	
	@Test(priority = 5)
	public void enterValueName() {
		wtp.enterValueForName();
	}
	
	@Test(priority = 6)
	public void enterValueEmail() throws InterruptedException {
		wtp.enterValueForEmail();
		Thread.sleep(2000);
	}
	
	@Test(priority = 7)
	public void clickonSaveBtn() {
		wtp.ClickOnSaveBtn();
	}
	
	@Test(priority = 8)
	public void ValidateName() {
		wtp.validateName();
	}
	
	@Test(priority = 9)
	public void ValidateEmail() {
		wtp.validateEmail();
	}

}