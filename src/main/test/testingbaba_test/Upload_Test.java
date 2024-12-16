package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbaba_pages.Login_page;
import testingbaba_pages.Practice_TextPage;
import testingbaba_pages.Upload_Page;

public class Upload_Test extends BaseLibrary{
	
	Login_page ob;
	Practice_TextPage ptp;
	Upload_Page up;
	
	@BeforeTest
	public void getLaunchUrl_TestingBaba() {
		
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob = new Login_page();
		ptp = new Practice_TextPage();
		up = new Upload_Page();
		
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
	public void clickOnUploadAndDownload() {
		up.clickUploadAndDownload();
	}
	
	@Test(priority = 5)
	public void clickOnChooseFile() {
		up.clickOnchosefile();
	}

}
