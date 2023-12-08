package MyLearning.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);                       // this will initialize driver to all @FindBy elements
		}
	
//	WebElement userEmail = driver.findElement(By.id("userEmail"));
//	PageFactory : nice way to right above line
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userPass;
	
	@FindBy(id="login")
	WebElement submit;
	
	public void loginApplication(String email, String password)
	{
		userEmail.sendKeys(email);
		userPass.sendKeys(password);
		submit.click();
	}
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client/");
	}
}
