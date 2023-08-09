package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;
  
public class LoginTest {
	 ExcelReader exlread = new ExcelReader("src\\main\\java\\testdata\\exelproject.xlsx");
	 String username = exlread.getCellData("logininfo", "UserName", 2);
	 String password = exlread.getCellData("logininfo", "Password", 2);
	 String dashBoardHeader = exlread.getCellData("Dashboardinfo", "DashboardHeader", 2);
	 WebDriver driver;
	   @Test
       public void UserShouldBeAbleToLogin() throws InterruptedException {
    	 driver =  BrowserFactory.init();
    	 LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    	 loginPage.PerformLogin(username, password);
    	 DashBoardPage dashboardpage = PageFactory.initElements(driver, DashBoardPage.class);
    	 dashboardpage.validateDashBoardHeader(dashBoardHeader);
    	 dashboardpage.clickCustomerButton();
    	 dashboardpage.clickOnAddCustomerButton();
       }
}
