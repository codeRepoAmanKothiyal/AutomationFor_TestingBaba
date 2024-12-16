package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbaba_pages.Login_page;
import testingbaba_pages.Practice_CheckBox_Page;
import testingbaba_pages.Practice_TextPage;

public class Practice_Checkbox_Test extends BaseLibrary {
	
	Login_page ob;
	Practice_TextPage ptp;
	Practice_CheckBox_Page pcb;
	
	@BeforeTest
	public void getLaunchUrl_TestingBaba() {
		
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob = new Login_page();
		ptp = new Practice_TextPage();
		pcb = new Practice_CheckBox_Page();
		
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
	public void clickOnCkeckboxBtn() {
		pcb.clickOnCheckboxBtn();
	}
	
	@Test(priority = 5)
	public void clickOnMobileCheckbox() throws InterruptedException {
		pcb.clickOnMoblieCheckbox();
	}
	
	@Test(priority = 6)
	public void verifyMobileClicked() {
		pcb.checkMobileCheckboxClicked();
	}
	
	@Test(priority = 7)
	public void clickOnLaptopCheck() {
		pcb.clickOnLaptopcheckbox();
	}
	
	@Test(priority = 8)
	public void verifyLaptopClicked() {
		pcb.checkLaptopCheckboxClicked();
	}
	
	@Test(priority = 9)
	public void ckickOnDesktopCheck() {
		pcb.clickOnDesktopCheckbox();
	}
	
	@Test(priority = 10)
	public void verifyDesktopClicked() {
		pcb.checkDesktopCheckboxClicked();
	}

}
