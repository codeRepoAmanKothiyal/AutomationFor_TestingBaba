package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbaba_pages.DropDown_Menu_Page;
import testingbaba_pages.Login_page;
import testingbaba_pages.Practice_TextPage;

public class DropDown_Menu_Test extends BaseLibrary {
	
	Login_page ob;
	Practice_TextPage ptp;
	DropDown_Menu_Page ddp;
	
	@BeforeTest
	public void getLaunchUrl_TestingBaba() {
		
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob = new Login_page();
		ptp = new Practice_TextPage();
		ddp = new DropDown_Menu_Page();
		
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
		ddp.clickWidgits();
	}
	
	@Test(priority = 4)
	public void clickOnSelectMenu() {
		ddp.clickSelectMenu();
	}
	
	@Test(priority = 5)
	public void clickOnDropdownFirst() {
		ddp.SelectDropdownFirst();
	}
	
	@Test(priority = 6)
	public void clickOnDropdownSecond() {
		ddp.SelectDropdownSecond();
		System.out.println( System.getProperty("user.dir"));
		getScreenshoot("Screenshot","FirstScreenshot");
	}

}
