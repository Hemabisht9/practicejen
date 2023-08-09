package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage extends BasePage {
    @FindBy(how = How.XPATH, using = "//h2[text()=' Dashboard ']") WebElement DASHBOARD_HEADER_ELEMENT;
    @FindBy(how = How.XPATH, using = "//span[@class='fa arrow']") WebElement CUSTOMER_MENU_ELEMENT;
    @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADDCUSTOMER_MENU_ELEMENT;
    WebDriver driver;
    public DashBoardPage(WebDriver driver) {
    	this.driver =driver;
    }
    
    //mockdata
    String dashboard = "DashBoard";
    public void validateDashBoardHeader(String expected) {
        validateThePage(DASHBOARD_HEADER_ELEMENT.getText(), expected, "Dashboard page is not available");
     
      
    }
	public void clickCustomerButton() throws InterruptedException {
		   Thread.sleep(2000);
	        CUSTOMER_MENU_ELEMENT.click();
	}
	public void clickOnAddCustomerButton() {
		  ADDCUSTOMER_MENU_ELEMENT.click();
	}
    
}
