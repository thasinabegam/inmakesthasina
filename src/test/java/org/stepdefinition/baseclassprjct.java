package org.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclassprjct {
public static WebDriver driver;
	
	//launchbrowser
	public static void LaunchTheBrowser () {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}

	
	//windowmax
	public static void Windowmaximize() {
		driver.manage().window().maximize();
	}
	
	
	//launch url
	 public static void Launchurl(String url) {
		 driver.get(url);
		 }  
	 
	 //getpagetitle
	 public static void pagetitle() {
		 String title=driver.getTitle();
		 System.out.println(title);
	 }

	 //getpageurl
	 public static void pageurl() {
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
	 }
	 
	 //textpassing
	 public static void passtext(String text,WebElement web) {
		 web.sendKeys(text);
	 }
	 
	 //closeentirebrowser
	 public static void closeentirebrowser() {
		 driver.quit();
	 }
	 
	 //clickbtn
	 public static void clickbtn(WebElement ele) {
		 ele.click();
	 }
	 
	 //takescreenshot
	public static void screenshot(String imgname) throws IOException {
		TakesScreenshot ls=(TakesScreenshot) driver;
		File image=ls.getScreenshotAs(OutputType.FILE);
		File f=new File("Location+imgname.png");
		FileUtils.copyFile(image, f);
		}
	
	//Actions part
	public static Actions a;
	public static void Movethecursor(WebElement targetwebelement) {
		a=new Actions(driver);
		a.moveToElement(targetwebelement).perform();
	}
	
	//DragandDrop
	public static void DragDrop(WebElement DragWebElement,WebElement DropWebElement) {
		a=new Actions(driver);
		a.dragAndDrop(DragWebElement, DropWebElement).perform();
		}
	
	
	//JavaScriptExecutor
	public static JavascriptExecutor js;
	public static void scrollthepage(WebElement tarwebele) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0]scrollIntoView(true)", tarwebele );
		
	}
	
	public static void scroll(WebElement Element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0]scrollIntoView(true)", Element );
		
	}
	
	
	//Frameworks
	public static void excelread(String Sheetname,int rownum,int cellnum) throws IOException {
		File f=new File("excellocation.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Datas");
		Row r= mysheet.getRow(rownum);
		Cell c = r.getCell(cellnum);
		int type = c.getCellType();
		
		String value="";
		if (type==1) {
			String cellValue = c.getStringCellValue();
		
			}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat s=new SimpleDateFormat(value);
			String value1=s.format(dd);
			
			
		}
		else {
			double d= c.getNumericCellValue();
			long l=(long)d;
			String valueOf = String.valueOf(1);
			}
	}
	
	//framework createnewexcel
	public static void CreateNewExcelFile(int rownum,int cellnum,String writeData) throws IOException {
		File f=new File("Excel location.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet newsheet = w.createSheet("Datas");
		Row r = newsheet.createRow(rownum);
		Cell newcell = r.createCell(cellnum);
		newcell.setCellValue(writeData);
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		}
	
	//framework createcell
	public static void CreateCell (int getrow,int crecell,String newdata) throws IOException {
		File f=new File("Excel location.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet newsheet = w.createSheet("Datas");
		Row r = newsheet.getRow(getrow);
		Cell newcell = r.createCell(crecell);
		newcell.setCellValue(newdata);
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		}
	
	//framework createrow
	public static void Createrow (int crerow,int crecell,String newdata) throws IOException {
		File f=new File("Excel location.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet newsheet = w.createSheet("Datas");
		Row r = newsheet.createRow(crerow);
		Cell newcell = r.createCell(crecell);
		newcell.setCellValue(newdata);
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		}
	
	//framework updateparticularcell
	public static void updatedatatoparticularcell (int gettherow,int getthecell,String existingdata,String WritenewData) throws IOException {
		File f=new File("Excel location.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet newsheet = w.createSheet("Datas");
		Row r = newsheet.getRow(gettherow);
		Cell newcell = r.getCell(getthecell);
		String value = newcell.getStringCellValue();
		if (value.equals(existingdata)) {
			newcell.setCellValue(WritenewData);
			
		}
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		
		}

}
