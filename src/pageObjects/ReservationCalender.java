package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservationCalender {
	
    WebDriver driver;
	
	public ReservationCalender(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, ReservationCalender.class);
	}
	
	@FindBy(xpath="//div[@class='col-md-4']/div[1]/button")
	private WebElement plusButton;
	
	@FindBy(xpath="//div[@class='col-md-4']/div[1]/ul")
	WebElement bookingOptions;
	
	
	public void createReservation()
	{
		plusButton.click();
		List<WebElement> options = bookingOptions.findElements(By.tagName("li"));
		for (WebElement opt : options) 
		{
			if(opt.getText().equals("Create Booking"))
			{
				opt.click();
			}
		}

	}
	
	
	
	
	


}
