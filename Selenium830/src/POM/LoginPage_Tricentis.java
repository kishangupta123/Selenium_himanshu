package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Tricentis {
	@FindBy(id="Email")
	private WebElement EmailTf;
	
	@FindBy(name="Password")
	private WebElement PasswordTf;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement LoginButton;
	
	
	public LoginPage_Tricentis(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getEmailTf() {
		return EmailTf;
	}


	public WebElement getPasswordTf() {
		return PasswordTf;
	}


	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
	

}
