package page;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USER_NAME_ELEMENT;
    @FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
    @FindBy(how = How.XPATH, using = "//button[@name='login']") WebElement SIGNIN_BUTTON_ELEMENT;
    
   //mockdata
    String username = "demo@techfios.com";
    String password = "abc123";
    
    WebDriver driver;
    public LoginPage(WebDriver driver) {
    	this.driver = driver;
    }
    public void PerformLogin(String username, String password) {
    	USER_NAME_ELEMENT.sendKeys(username);
    	PASSWORD_ELEMENT.sendKeys(password);
    	SIGNIN_BUTTON_ELEMENT.click();
    }
}
