package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baselibrary.BaseLibrary;
import testingbaba_pages.Login_page;
import testingbaba_pages.Practice_TextPage;
import testingbaba_pages.Use_Of_Actions_Class_Page;

public class Use_Of_ActionsClass_Test extends BaseLibrary {
	
	Login_page ob;
	Practice_TextPage ptp;
	Use_Of_Actions_Class_Page uac;
	
	@BeforeTest
	public void getLaunchUrl_TestingBaba() {
		
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob = new Login_page();
		ptp = new Practice_TextPage();
		uac = new Use_Of_Actions_Class_Page();
		
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
	public void clickOnWidgits() {
		uac.clickWidgits();
	}
	
	@Test(priority = 4)
	public void clickOnToolTips() {
		uac.clickToolTips();
	}
	
	@Test(priority = 5)
	public void hoverOnHoverMeButton() throws InterruptedException {
		uac.hoveronHoverMeButton();
	}
	
	@Test(priority = 6)
	public void checkHoverText() {
		uac.checkHovertext();
	}
	
	@Test(priority = 7)
	public void performRightClick() throws InterruptedException {
		uac.performRightClick();
		uac.hoveronHoverMeButton();
	}
	
	@Test(priority = 8)
	public void clickOnInteractions() {
		uac.clickInteractions();
	}

}
