package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbaba_pages.Alerts_page;
import testingbaba_pages.Login_page;
import testingbaba_pages.Practice_TextPage;

public class Alerts_Test extends BaseLibrary{
	
	Login_page ob;
	Practice_TextPage ptp;
	Alerts_page ap;
	
	
	@BeforeTest
	public void getLaunchUrl_TestingBaba() {
		
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob = new Login_page();
		ptp = new Practice_TextPage();
		ap = new Alerts_page();
		
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
	public void clickOnAlertFrameAndWindows() {
		ap.clickOnAlertFrameAndWindowsBtn();
	}
	
	@Test(priority = 4)
	public void clickOnAlert() {
		ap.clickOnAlertBtn();
	}
	
	@Test(priority = 5)
	public void clickOnSeeAlertMe() throws InterruptedException {
		ap.clickOnSeeAlertMeBtn();
	}
	
	@Test(priority = 6)
	public void clickOnSeeAlertAfter5Sec() throws InterruptedException {
		ap.clickOnAlertAppearAfter5Second();
	}
	
	@Test(priority = 7)
	public void clickOnAlertwithChoice() {
		ap.clickOnAlertwithTwoChoice();
	}
	
	@Test(priority = 8)
	public void clickAlertPrompBoxAndSendKey() throws InterruptedException {
		ap.clickOnAlertPrompBox();
	}

}
