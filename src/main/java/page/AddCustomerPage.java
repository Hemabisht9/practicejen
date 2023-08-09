package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {
	
	 WebDriver driver;
	    public AddCustomerPage(WebDriver driver) {
	    	this.driver =driver;
	    }
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5") WebElement ADD_CUSTOMER_HEADER_ELEMENT;
    @FindBy(how = How.XPATH, using = "//input[@id='account']") WebElement FULL_NAME_ELEMENT;
    @FindBy(how = How.XPATH, using = "//select[@id='cid']") WebElement CUMPANY_DROPDOWN_ELEMENT;
    @FindBy(how = How.XPATH, using = "//input[@id='email']") WebElement EMAIL_ELEMENT;
    @FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement PHONE_ELEMENT;
    @FindBy(how = How.XPATH, using = "//*[@id=\"address\"]") WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]") WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]") WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]") WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]") WebElement COUNTRY_DPDWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]") WebElement SAVE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[text()='List Customers']") WebElement LIST_CUSTOMER_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/button[2]") WebElement DELETE_OK_BUTTON_ELEMENT;

    public void validateAddCustomerHeader(String expected) throws InterruptedException {
    	Thread.sleep(2000);
        validateThePage( ADD_CUSTOMER_HEADER_ELEMENT.getText(), expected, "Addcustomer page is not avaaailable");
    }
    String insertedName;
	public void insertFullName(String FullName) {
		 insertedName = FullName + randomNumGenerator(99);
		FULL_NAME_ELEMENT.sendKeys(insertedName);
		
	}
	public void selectCompanyName(String Company) {
		selectfromdropdown(CUMPANY_DROPDOWN_ELEMENT, Company);
		
	}
	public void insertEmail(String Email ) {
		EMAIL_ELEMENT.sendKeys(Email + randomNumGenerator(999) );
		
	}
	public void insertPhoneNumber(String Phone) {
		PHONE_ELEMENT.sendKeys(Phone + randomNumGenerator(999));
	}
	public void insertAddress(String Address) {
		ADDRESS_ELEMENT	.sendKeys(Address);
	}
	public void insertCity(String City) {
		CITY_ELEMENT.sendKeys(City);
	}
	public void insertState(String State) {
		STATE_ELEMENT.sendKeys(State);
	}
	public void insertZipCode(String Zip) {
		ZIP_ELEMENT.sendKeys(Zip);
	}
	public void selectCountryName(String Country) {
		selectfromdropdown(COUNTRY_DPDWN_ELEMENT, Country);
	}
	public void clickOnSaveButton() {
		SAVE_BUTTON_ELEMENT.click();
	}
	public void clickOnListCustomerButton() throws InterruptedException {
		Thread.sleep(2000);
		LIST_CUSTOMER_BUTTON_ELEMENT.click();
	}
     //xpath
	//tbody//tr[1]/td[3]/a
	//tbody//tr[2]/td[3]/a
	//tbody//tr[3]/td[3]/a
	//tbody//tr[4]/td[3]/a
	//tbody//tr[1]/td[7]/a[2]
	String before_xpath = "//tbody//tr[";
	String after_xpath = "]/td[3]/a";
	String after_xpath_delete = "]/td[7]/a[2]";
	public void insertedName() throws InterruptedException {
		for(int i = 1; i<=10; i++) {
			String actualName = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
		   if(actualName.contains(insertedName)) {
			   Thread.sleep(2000);
			   driver.findElement(By.xpath(before_xpath + i + after_xpath_delete)).click();
		   }
		  break;
		
		}
	}
		public void clickOkButtonForDelete() {
			DELETE_OK_BUTTON_ELEMENT.click();
		}	
}
	
   


