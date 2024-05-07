package com.OrangeHRM.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.OrangeHRM.base.TestBase;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddEmp extends TestBase{
	
	By pimBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
	By addEmp = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a");
	
	By FName = By.name("firstName");
	By MName = By.name("middleName");
	By LName = By.name("lastName");
	By EmpID = By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]");
	By CreateLoginDetailSlide = By.xpath("//*[@class='oxd-switch-input oxd-switch-input--active --label-right']");
	
	
	By username = By.xpath("(//*[@class='oxd-input oxd-input--active'])[3]");
	By enable = By.xpath("(//label[text()='Status']//following::span)[1]");
	By disable = By.xpath("(//label[text()='Status']//following::span)[2]");
	By password = By.xpath("(//label[text()='Password']//following::input)[1]");
	By cnfrmpass = By.xpath("(//label[text()='Password']//following::input)[2]");
	// (//*[@class='oxd-input oxd-input--active'])[5]");
	// (//label[text()='Password']//following::input)[1]
	
	
	
	By nickname = By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]");
	By otherid = By.xpath("(//label[text()='Other Id']//following::input)[1]");
	By dlnum = By.xpath("(//label[text()='Other Id']//following::input)[2]");
	By licexpdate = By.xpath("(//label[text()='Other Id']//following::input)[3]");
	By ssnnum = By.xpath("(//label[text()='Other Id']//following::input)[4]");
	By sinnum = By.xpath("(//label[text()='Other Id']//following::input)[5]");
//	By nationalitychoose = By.xpath("(//label[text()='Nationality']//following::div)[4]");
//	By marital = By.xpath("(//label[text()='Marital Status']//following::div)[4] ");
//	By dob = By.xpath("(//label[text()='Date of Birth']//following::input)[1]");
//	By male = By.xpath("(//label[text()='Date of Birth']//following::input)[2]");
//	By female = By.xpath("(//label[text()='Date of Birth']//following::input)[3]");
//	By militaryser = By.xpath("(//label[text()='Date of Birth']//following::input)[4]");
//	By smoker = By.xpath("(//label[text()='Date of Birth']//following::input)[5]");
//	By bloodtype = By.xpath("(//label[text()='Blood Type']//following::div)[4]");
//	By save = By.xpath("(//label[text()='Blood Type']//following::button)[1]");	
	By Nationalitydropdown = By.xpath("(//div[@clear='false'][normalize-space()='-- Select --'])[1]");
    By Listbox1 = By.xpath("(//div[@role='listbox'])[1]");
    By Maritaldropdown = By.xpath("//div[@clear='false'][normalize-space()='-- Select --']");
    By Listbox2 = By.xpath("//div[@role='listbox']");
    By Birthday = By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]");
    By Bloodgroupdropdown = By.xpath("(//div[contains(text(),'-- Select --')])[1]");
    By Listbox3 = By.xpath("(//div[@role='listbox'])[1]");
    By Gender = By.xpath("//label[normalize-space()='Male']");
	
	public void addingEmp(String Fname, String Mname, String Lname, String Empid)
	{
		System.out.print("1.................................");
		wait(2000);
		driver.findElement(pimBtn).click();
		
		wait(1000);
		driver.findElement(addEmp).click();
		wait(1000);
		
		
		//ADDING USER DETAIL
	
			wait(200);
			driver.findElement(FName).clear();
			wait(100);
			driver.findElement(FName).sendKeys(Fname);
			wait(200);
			
			
			wait(200);
			driver.findElement(MName).clear();
			wait(100);
			driver.findElement(MName).sendKeys(Mname);
			wait(200);
			
			
			wait(200);
			driver.findElement(LName).clear();
			wait(100);
			driver.findElement(LName).sendKeys(Lname);
			wait(200);
			
			
			wait(500);
			driver.findElement(EmpID).clear();
			wait(500);
			driver.findElement(EmpID).sendKeys(Empid);
			wait(200);
			
			driver.findElement(CreateLoginDetailSlide).click();
			wait(1000);
			}	
	
	public void addUserDetail(String UserName, String Enable, String Password, String CnfrmPassword) {
		
		//ADDING USER DETAIL
		
		driver.findElement(username).clear();
		wait(800);
		driver.findElement(username).sendKeys(UserName);
		wait(200);
		
//		if(Enable == "Y")
//		{
//			driver.findElement(enable).click();
//		}
//		else
//		{
//			driver.findElement(disable).click();
//		}
		
		driver.findElement(password).clear();
		wait(800);
		driver.findElement(password).sendKeys(Password);
		wait(1000);
		
		driver.findElement(cnfrmpass).clear();
		wait(800);
		driver.findElement(cnfrmpass).sendKeys(CnfrmPassword);
		wait(200);
		
		//Clicking on save button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		
		wait(7000);
		
	}
	
	public void PersonalDetail(String Nickname, String otherID, String dlNum, String LicenseExpDate, String SSNnum, String SINnum, String nat, String maritial, String DOB, String gender, String MilitaryService, String Smoker, String BloodType)
	{
		
		
		//ADDING PERSONAL DETAIL
		wait(2000);
		driver.findElement(nickname).clear();
		wait(300);
		driver.findElement(nickname).sendKeys(Nickname);
		wait(300);
		
		driver.findElement(otherid).clear();
		wait(300);
		driver.findElement(otherid).sendKeys(otherID);
		wait(300);
		
		driver.findElement(dlnum).clear();
		wait(300);
		driver.findElement(dlnum).sendKeys(dlNum);
		wait(300);
		
		driver.findElement(licexpdate).click();
		wait(300);
//		Date date = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
//		String dateconverted = sdf.format(LicenseExpDate);
//		driver.findElement(licexpdate).sendKeys(dateconverted);
		driver.findElement(licexpdate).sendKeys(LicenseExpDate);
		wait(1000);
		
		driver.findElement(ssnnum).clear();
		wait(300);
		driver.findElement(ssnnum).sendKeys(SSNnum);
		wait(1000);
		
		driver.findElement(sinnum).clear();
		wait(300);
		driver.findElement(sinnum).sendKeys(SINnum);
		wait(1000);
		System.out.print("2");
		
		
//		driver.findElement(nationalitychoose).click();
//		wait(800);
//		List<WebElement> nationalityDD = driver.findElements(By.xpath("(//div[@role='listbox'])[1]"));
//		wait(200);
//		for(int i =0; i< nationalityDD.size(); i++)
//		{
//			if(nationalityDD.get(i).getText().equalsIgnoreCase(nat))
//			{
//				nationalityDD.get(i).click();
//			}
//		}
//
//		System.out.print("3");
//		driver.findElement(marital).click();
//		wait(300);
//		List<WebElement> maritalDD = driver.findElements(marital);
//		wait(200);
//		for(int i =0; i< maritalDD.size(); i++)
//		{
//			if(maritalDD.get(i).getText().equalsIgnoreCase(maritial))
//			{
//				maritalDD.get(i).click();
//			}
//		}
//		
//		System.out.print("5");
//		driver.findElement(dob).click();
//		wait(300);
//		driver.findElement(dob).sendKeys(DOB);
//		wait(1000);
//		driver.findElement(dob).click();
//		
//		
//		
//		if(gender == "Male")
//		{
//			driver.findElement(male).click();
//		}
//		else
//		{
//			driver.findElement(female).click();
//		}
//		
//		driver.findElement(militaryser).click();
//		wait(300);
//		driver.findElement(militaryser).sendKeys(MilitaryService);
//		wait(1000);
//		
//		
//		if(Smoker == "Y")
//		{
//		driver.findElement(smoker).click();
//		wait(1000);
//		}
//		else
//		{
//			driver.findElement(smoker).clear();
//		}
//		
//				
//		
//		driver.findElement(bloodtype).click();
//		wait(300);
//		List<WebElement> bloodDD = driver.findElements(bloodtype);
//		wait(200);
//		for(int i =0; i< bloodDD.size(); i++)
//			{
//				if(bloodDD.get(i).getText().contains(BloodType))
//				{
//					bloodDD.get(i).click();
//				}
//			}
//			
//		
//		
//		
//		wait(1000);
//		driver.findElement(save).click();
//		wait(3000);
		
		WebElement dropDown1 = driver.findElement(Nationalitydropdown);
        dropDown1.click();
        wait(500);
        WebElement tagDD=driver.findElement(Listbox1);
        wait(500);
        List<WebElement> list = tagDD.findElements(By.tagName("div"));
        wait(500);
        for(WebElement dd:list) {
            if(dd.getText().equalsIgnoreCase(nat)) {
                dd.click();    
                break;
            }
        }
        

        wait(600);

         
         WebElement dropDown2 = driver.findElement(Maritaldropdown);
            dropDown2.click();
            wait(700);
            WebElement tagDD2=driver.findElement(Listbox2);
            wait(500);
            List<WebElement> list2 = tagDD2.findElements(By.tagName("div"));
            for(WebElement dd2:list2) {
                if(dd2.getText().equalsIgnoreCase(maritial)) {
                    dd2.click();
                    break;
                }
            }

            wait(600);

             WebElement birthday=driver.findElement(Birthday);
             birthday.sendKeys(DOB);
             wait(600);



             WebElement gndr=driver.findElement(Gender);
             gndr.click();
             wait(600);


             driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Save'])[1]")).click();
             wait(2000);


             JavascriptExecutor js2 = (JavascriptExecutor) driver;
             js2.executeScript("window.scrollBy(0,250)", "");
             wait(600);

            

             WebElement dropDown3 = driver.findElement(Bloodgroupdropdown);
                dropDown3.click();
                wait(700);
                WebElement tagDD3=driver.findElement(Listbox3);
                wait(500);
                List<WebElement> list3 = tagDD3.findElements(By.tagName("div"));
                for(WebElement dd3:list3) {
                    if(dd3.getText().equalsIgnoreCase(BloodType)) {
                        dd3.click();
                        break;
                    }
                }

                 wait(600);



            driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Save'])[2]")).click();



}
	
	
}