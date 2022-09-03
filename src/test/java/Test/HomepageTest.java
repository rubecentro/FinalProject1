package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.HomePagePage;
import util.BrowserFactory;

public class HomepageTest {

	
	

	

	public class HomePageTest {

		WebDriver driver;
		
		@Test
		public void userShouldBeAbleToAddItem() {
			
			 driver = BrowserFactory.init();
			 HomePagePage homepage = PageFactory.initElements(driver, HomePagePage.class);
			 homepage.addItems();
			 homepage.checkToggleAllBox();
			 homepage.selectAndRemoveOneItem();
			 homepage.selectAndRemoveAllItems();
			
			 BrowserFactory.tearDown();
		}
		
	}

}
