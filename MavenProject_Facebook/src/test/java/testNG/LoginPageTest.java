package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.LoginOrSignUpPage;

public class LoginPageTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\ALL Notes AUTO MANUAL + SQL\\AUTOMATION NOTES\\KUNAL AUTOMATION DOCUMENT\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();
//		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		driverTest.manage().window().maximize();
		
		driverTest.get("https://www.facebook.com/");

		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage (driverTest);
		
		loginOrSignUpPage.sendUserName("kunal");
		loginOrSignUpPage.sendPassword("13ww22334");
		loginOrSignUpPage.clickOnLoginButton();

}
}
