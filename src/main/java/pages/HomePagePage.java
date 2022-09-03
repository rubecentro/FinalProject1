package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePage extends Basepage {

	WebDriver driver;
	public HomePagePage (WebDriver driver) {
		this.driver=driver;
	}
	
	
	@FindBy (how = How.XPATH, using ="//input[@name='data']")WebElement FIRST_ITEM;
	@FindBy (how = How.XPATH, using ="//input[@name='data']")WebElement SECOND_ITEM;
	@FindBy (how = How.XPATH, using ="//input[@name='data']")WebElement THIRD_ITEM;
	@FindBy (how = How.XPATH, using ="//input[@name='submit'][@value='Add']")WebElement ADD_BUTTON;
	@FindBy (how = How.XPATH, using ="//input[@name='allbox']")WebElement TOGGLE_ALL_CHECK_BOX;
	@FindBy (how = How.XPATH, using ="//input[@name='todo[1]']")WebElement CHECK_SINGLE_ITEM;
	@FindBy (how = How.XPATH, using ="//input[@name='submit'][@value='Remove']")WebElement REMOVE_ONE_ITEM;
	@FindBy (how = How.XPATH, using ="//input[@name='submit'][@value='Remove']")WebElement REMOVE_ALL_ITEM;
	
	
	
	public void addItems() {
		TOGGLE_ALL_CHECK_BOX.click();
		REMOVE_ALL_ITEM.click();
		FIRST_ITEM.sendKeys("Kigali" + this.generateRandomNumber(99));
		ADD_BUTTON.click();
		SECOND_ITEM.sendKeys("Butare"+ this.generateRandomNumber(99));
		ADD_BUTTON.click();
		THIRD_ITEM.sendKeys("Rusizi"+ this.generateRandomNumber(99));
		ADD_BUTTON.click();
	}
	
	public void checkToggleAllBox () {
		
		TOGGLE_ALL_CHECK_BOX.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void selectAndRemoveOneItem() {
		TOGGLE_ALL_CHECK_BOX.click();
		CHECK_SINGLE_ITEM.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		REMOVE_ONE_ITEM.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void selectAndRemoveAllItems() {
		TOGGLE_ALL_CHECK_BOX.click();
		REMOVE_ALL_ITEM.click();
		
	}
}
