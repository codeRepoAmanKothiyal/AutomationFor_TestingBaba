package testingbaba_pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baselibrary.BaseLibrary;

public class DropDown_Menu_Page extends BaseLibrary {

	public DropDown_Menu_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//h2[@class=\"mb-0\"])[3]")
	private WebElement widgits;
	
	@FindBy(xpath = "//a[text()=\"select menu\"]")
	private WebElement selectMenu;
	
	@FindBy(xpath = "(//select[@class=\"form-control\"])[3]")
	private WebElement dropdownFirst;
	
//	@FindBy(xpath = "(//select[@class=\"form-control\"])[3]/child :: option")
//	private WebElement listOfFirstDropdown;
	
	@FindBy(xpath = "//label[text()=\"OLd Styel Select Menu\"]/following :: select[1]")
	private WebElement clickOnDropdownSecond;
	
	
	public void clickWidgits() {
		widgits.click();
	}
	
	public void clickSelectMenu() {
		selectMenu.click();
	}
	
	public void SelectDropdownFirst() {
		dropdownFirst.click();
		//WebElement optionsList = driver.findElement(By.xpath("(//select[@class=\"form-control\"])[3]/child :: option"));
		
		Select sec = new Select(dropdownFirst);
		sec.selectByIndex(3);
//		optionsList.get(4).click();
//		dropdownFirst.click();
	}
	
	public void SelectDropdownSecond() {
		clickOnDropdownSecond.click();
		List<WebElement> optionsList2 = driver.findElements(By.xpath("((//label[text()=\"OLd Styel Select Menu\"])/following :: select[1])/child :: option"));
		
//		for(WebElement ele : optionsList2 ) {
//			String val= ele.getText();
//			if(val.equals("Java")) {
//				ele.click();
//				break;
//			}
//		} // the above method is for if we want to select by using text.
		optionsList2.get(4).click();
		clickOnDropdownSecond.click();
	}
	
}


