package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateBooking {
	
	WebDriver driver;
	
	public CreateBooking(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, CreateBooking.class);
	}
	
	@FindBy(xpath="//*[@id='reservation_form_id']/div[1]/div/div/div[1]/div[1]/div/input")
	private WebElement checkinDate;
	
	@FindBy(xpath="//*[@id='reservation_form_id']/div[1]/div/div/div[1]/div[2]/div/input")
	private WebElement 

} 
