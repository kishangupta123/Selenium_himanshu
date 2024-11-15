package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage_Tricentis {
	// declaration
	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	// initialization
	public WelcomePage_Tricentis(WebDriver driver) {
		//initElements(initialization ELements) is a static method inside aPageFactory
		//Class So When we Calll init we have to call it via class name
		PageFactory.initElements(driver, this);
	}

	// getters
	public WebElement getLoginLink() {
		return loginLink;
	}

}
