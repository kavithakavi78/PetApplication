package org.resources;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Select s;
	
	public static void generateJvmReport(String json) {
		File f= new File("C:\\Users\\Admin\\eclipse-workspace\\kavi\\CucumberProj\\Jvm-Report");
		
		Configuration con= new Configuration(f, "Cucumber Execution Report");
		con.addClassifications("BrowserName", "Chrome");
		con.addClassifications("BrowserVersion", "81");
		con.addClassifications("OS", "Windows10");
		con.addClassifications("Application", "JPet");
		
		List<String> li= new ArrayList<String>();
		li.add(json);
		
		ReportBuilder rb= new ReportBuilder(li, con);
		rb.generateReports();
		
	}

	public static String getData(int r1, int c1) throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\kavi\\CucumberProj\\Excel\\Data.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Values");
		Row r = s.getRow(r1);
		Cell c = r.getCell(c1);
		int type = c.getCellType();
		String value = null;
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd/mm/yyyy");
				value = sim.format(d);
			} else {
				double d = c.getNumericCellValue();
				value = String.valueOf(d);
			}

		} else if (type == 1) {
			value = c.getStringCellValue();
		}
		return value;

	}
	public static String readData(int r2, int c2) throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\kavi\\CucumberProj\\Excel\\Data.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Inputs");
		Row r = s.getRow(r2);
		Cell c = r.getCell(c2);
		int type = c.getCellType();
		String value = null;
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd/mm/yyyy");
				value = sim.format(d);
			} else {
				double d = c.getNumericCellValue();
				value = String.valueOf(d);
			}

		} else if (type == 1) {
			value = c.getStringCellValue();
		}
		return value;

	}

	public static void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\kavi\\CucumberProj\\driver\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public static void LaunchApp(String Url) {
		driver.get(Url);

	}

	public static void type(WebElement w, String s) {
		w.sendKeys(s);
	}

	public static void click(WebElement w) {
		w.click();
	}

	public static String TakeUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;

	}

	public static String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;

	}

	public static void moveTo(WebElement e) {
		a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	public static void dragDrop(WebElement src, WebElement des) {
		a.dragAndDrop(src, des).perform();
	}

	public static void doubleClick(WebElement e) {
		a.doubleClick().perform();
	}

	public static void contextClick(WebElement e) {
		a.contextClick().perform();
	}

	public static void SBI(WebElement w, int Index) {
		s = new Select(w);
		s.selectByIndex(Index);
	}

	public static void SBV(WebElement w, String value) {
		s = new Select(w);
		s.selectByValue(value);
	}

	public static void SBVText(WebElement w, String Text) {
		s = new Select(w);
		s.deselectByVisibleText(Text);
	}

	public static void TakeScreenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File saveFile = new File("C:\\Users\\Admin\\eclipse-workspace\\kavi\\CucumberProj\\ScreenShots\\SS.jpeg");
		FileUtils.copyFile(screenshotAs, saveFile);

	}
	public static void robotttt() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void quit() {
		driver.quit();
	}
}
