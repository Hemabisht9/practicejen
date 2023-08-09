package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {
	WebDriver driver;
	
	ExcelReader exlread = new ExcelReader("src\\main\\java\\testdata\\exelproject.xlsx");
	 String username = exlread.getCellData("logininfo", "UserName", 2);
	 String password = exlread.getCellData("logininfo", "Password", 2);
	 String dashBoardHeader = exlread.getCellData("Dashboardinfo", "DashboardHeader", 2);
	 String AddContactValidationText = exlread.getCellData("AddContactinfo", "AddContactValidationText", 2);
	String Fullname = exlread.getCellData("AddContactinfo", "FullName", 2);
	String Company = exlread.getCellData("AddContactinfo", "CompanyName", 2);
	String Email = exlread.getCellData("AddContactinfo", "Email", 2);
	String Phone = exlread.getCellData("AddContactinfo", "Phone", 2);
	String Address = exlread.getCellData("AddContactinfo", "Address", 2);
	 String City = exlread.getCellData("AddContactinfo", "City", 2);
	 String State = exlread.getCellData("AddContactinfo", "Address", 2);
	 String Zip = exlread.getCellData("AddContactinfo", "Zip", 2);
	 String Country = exlread.getCellData("AddContactinfo", "Country", 2);
	 
	   @Test
	   public void userShouldBeAbleToAddCustomer() throws InterruptedException {
		  driver =  BrowserFactory.init();
		  LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		   loginpage.PerformLogin(username, password);
		   
		   DashBoardPage dashboardpage = PageFactory.initElements(driver, DashBoardPage.class);
		   dashboardpage.validateDashBoardHeader(dashBoardHeader);
		   dashboardpage.clickCustomerButton();
		   dashboardpage.clickOnAddCustomerButton();
		   
		   AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
		   addcustomerpage.validateAddCustomerHeader(AddContactValidationText);
		   addcustomerpage.insertFullName(Fullname);
		   addcustomerpage.selectCompanyName(Company);
		   addcustomerpage.insertEmail(Email);
		   addcustomerpage.insertPhoneNumber(Phone);
		   addcustomerpage.insertAddress(Address);
		   addcustomerpage.insertCity(City);
		   addcustomerpage.insertState(State);
		   addcustomerpage.insertZipCode(Zip);
		   addcustomerpage.selectCountryName(Country);
		   addcustomerpage.clickOnSaveButton();
		   addcustomerpage.clickOnListCustomerButton();
		   addcustomerpage.insertedName();
		   addcustomerpage.clickOkButtonForDelete();
		   
	   }
}
