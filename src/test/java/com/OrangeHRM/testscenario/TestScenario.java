package com.OrangeHRM.testscenario;

import com.OrangeHRM.base.TestBase;
import com.OrangeHRM.dataprovider.DataSet;
import com.OrangeHRM.pages.AddEmp;
import com.OrangeHRM.pages.LogOut;
import com.OrangeHRM.pages.Login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestScenario extends TestBase{
	
	@BeforeClass
	public void setUp() {
		launchBrowser();
		navigateToURL();
		wait(2000);
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	@Test(priority = 1)
	public void LoginTest() {
		Login log = new Login();
		
		String username = "Admin";
		String pwd = "admin123";
		log.login(username, pwd);
		wait(4000);
	}
	
	@Test(priority = 2, dataProvider = "testData", dataProviderClass=DataSet.class)
	public void AddEmpTest(String FName, String MName, String LName, String EmpID, String UserName, String Enable, String Disable, String Password, String CnfrmPassword, String Nickname, String otherID, String dlNum, String LicenseExpDate, String SSNnum, String SINnum, String nat, String maritial, String DOB, String gender, String MilitaryService, String Smoker, String BloodType ) {
		AddEmp addemp = new AddEmp();
		addemp.addingEmp(FName, MName, LName, EmpID);
		wait(3000);
		addemp.addUserDetail(UserName, Enable, Password, CnfrmPassword);
		wait(3000);
		addemp.PersonalDetail( Nickname, otherID, dlNum, LicenseExpDate, SSNnum, SINnum, nat, maritial, DOB, gender, MilitaryService, Smoker, BloodType);
		wait(3000);
	}
	
	@Test(priority = 3, enabled=true)
	public void LogOutTest()
	{
		LogOut lgout = new LogOut();
		lgout.logout();
	}
	
	@Test(priority = 4, dataProvider = "testData", dataProviderClass=DataSet.class, enabled =true)
		public void LoginTest1(String FName, String MName, String LName, String EmpID, String UserName, String Enable, String Disable, String Password, String CnfrmPassword, String Nickname, String otherID, String dlNum, String LicenseExpDate, String SSNnum, String SINnum, String nat, String maritial, String DOB, String gender, String MilitaryService, String Smoker, String BloodType ) 
		{
			Login log = new Login();
			log.login(UserName, Password);
			wait(2000);
		}
	
	
	
	
	
}