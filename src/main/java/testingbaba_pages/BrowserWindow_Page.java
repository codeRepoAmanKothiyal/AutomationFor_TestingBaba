package testingbaba_pages;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class BrowserWindow_Page extends BaseLibrary{
	
	public BrowserWindow_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//button[@class=\"btn  btn-block p-0 text-left mr-5 \"]")
	private WebElement alertFrameAndWindowsBtn;
	
	@FindBy(xpath = "//a[text()=\"browser windows\"]")
	private WebElement BrowserWindow;
	
	@FindBy(xpath = "//a[@href=\"https://www.google.co.in/\"]")
	private WebElement newTabFirst;
	
	@FindBy(xpath = "//a[text()=\"New Window\"]")
	private WebElement newWindow;
	
	@FindBy(xpath = "//a[text()=\"New Window Message\"]")
	private WebElement newWindowMessageRead;

	
	public void clickAlertFrameWindowsBtn() {
		alertFrameAndWindowsBtn.click();
	}
	
	public void clickBrowserWindows() {
		BrowserWindow.click();
	}
	
	public void clickOnNewTabFirst() throws InterruptedException {
		newTabFirst.click();
		
		Set<String> handels = driver.getWindowHandles();
		List<String> listHandels = new ArrayList<>(handels);
		
		driver.switchTo().window(listHandels.get(1));
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("amazon.com");
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.switchTo().window(listHandels.get(0));
	}
	
	public void ClickOnNewWindow() throws InterruptedException {
		newWindow.click();
		
		Set<String> handels = driver.getWindowHandles();
		List<String> listHandels = new ArrayList<>(handels);
		
//		for(String str:handels) {
//			System.out.println(str);
//		}
		
		driver.switchTo().window(listHandels.get(2));
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("amazon.com");
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.switchTo().window(listHandels.get(0));
	}
	
	public void clickOnNewWindowMessage() {
		newWindowMessageRead.click();
		
		Set<String> handels = driver.getWindowHandles();
		List<String> listHandels = new ArrayList<>(handels);
		
//		for(String str:handels) {
//			System.out.println(str);
//		}
		driver.switchTo().window(listHandels.get(3));
//		String newWindowText= driver.findElement(By.xpath("/html/body/p/text()")).getText();
//		System.out.println(newWindowText);
		driver.switchTo().window(listHandels.get(0));
	}
}
