package baselibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import excelutility.ExcelReader;
import propertyutility.PropertyUtility;
import waitutility.WaitUtility;

public class BaseLibrary implements ExcelReader, PropertyUtility, WaitUtility{
	
	public static WebDriver driver;
	String configPath ="C:\\Users\\ACER\\eclipse-workspace\\Automation_framework_new\\testdata\\testData_configFile.properties";
	
	public void getLaunchUrl(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\eclipse-workspace\\Automation_framework_new\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver(); 
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Override
	public String getExcelData(String path, int sheetNum, int rowNum, int colNum) {
		String value = "";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheetAt(sheetNum);
			value = sh.getRow(rowNum).getCell(colNum).getStringCellValue();
		}catch (FileNotFoundException e){
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return value;
	}

	@Override
	public String getReadData(String key) {
		String value ="";
		
		try {
			FileInputStream fps = new FileInputStream(configPath);
			Properties prop = new Properties();
			prop.load(fps);
			value=prop.getProperty(key);
					
		}catch (Exception e) {
			System.out.println("Error to read Data");
		}
		
		return value;
	}

	@Override
	public void explicitWait(WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	} 
	
	public void uploadUsingRobotClass(String path) {
		
		StringSelection selection=new StringSelection(path);
		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(selection, null);
		try {
			Robot robot=new Robot();
			robot.delay(250);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(250);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.delay(250);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(2500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getScreenshoot(String folderName, String fileName) {
		try {
		String loc = System.getProperty("user.dir");
		String finalPath= loc+"\\screenshot\\"+folderName+"\\"+fileName+".png";
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(finalPath));
		
		} catch (IOException e) {
			System.out.println("Issue intakeing SS");
		}
	}

}
