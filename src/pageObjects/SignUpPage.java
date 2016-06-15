package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver driver;
	
	@FindBy(id="inputEmail")
	private WebElement emailTextBox;
	
	@FindBy(id="inputPassword")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//*[@id='top']/div/div[3]/div/div[1]/div[3]/div/button[2]")
	private WebElement loginButton;
	
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, SignUpPage.class);
	}
	
	
	public void enterEmail(String username)
	{
		emailTextBox.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passwordTextBox.sendKeys(password);
	}
	
	public RootChainPage clickLogin()
	{
		loginButton.click();
		return new RootChainPage(driver);
	}
	
	
	
	
	
	
	
	
	

}
