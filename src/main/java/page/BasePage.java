package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage {
	public void validateThePage(String actual, String expected, String errormsg) {

		Assert.assertEquals(actual, expected, errormsg);

		}
	public int randomNumGenerator(int bound) {
		 Random rnd = new Random();
			int generatednum = rnd.nextInt(bound);
		return generatednum;
		
	} 
 public void selectfromdropdown(WebElement Element, String visibleText) {
		Select sel = new Select(Element);
		sel.selectByVisibleText(visibleText);

	}
}
