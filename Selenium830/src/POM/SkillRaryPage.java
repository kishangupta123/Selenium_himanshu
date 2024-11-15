package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryPage {
		
	//Declaration
		@FindBy(id="navbar-search-input")
		private WebElement searchTextField;
	
		//initiliazation
		public SkillRaryPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//getters

		public WebElement getSearchTextField() {
			return searchTextField;
		}

		
		
	}


