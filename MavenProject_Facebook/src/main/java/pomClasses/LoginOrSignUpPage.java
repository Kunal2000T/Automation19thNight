package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	

//		variable
		@FindBy (xpath = "//input[@id='email']")
		private WebElement userName ;
		
		@FindBy (xpath = "//input[@type='password']")
		private WebElement password ;
		
		@FindBy (xpath = "//button[text()='Log in']")
		private WebElement loginButton ;
		
		@FindBy (xpath = "//a[text()='Create new account']")
		private WebElement createNewAccount ;
		
//		constructor
		public LoginOrSignUpPage (WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
//		method
		public void sendUserName(String username) {
			userName.sendKeys(username);	
		}
		public void sendPassword(String pass) {
			password.sendKeys(pass);	
		}
		public void clickOnLoginButton() {
			loginButton.click();
		}
		public void clickOnCreateNewAccount() {
			createNewAccount.click();
		}
		
		
		
	}



