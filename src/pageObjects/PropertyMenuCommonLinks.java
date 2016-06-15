package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyMenuCommonLinks {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='top']/div[1]/div[2]/div/div[2]/a[1]/div")
	public WebElement dashboardLink;
	
	@FindBy(xpath="//*[@id='top']/div[1]/div[2]/div/div[2]/a[2]/div")
	public WebElement roomTypeLink;
	
	@FindBy(xpath="//*[@id='top']/div[1]/div[2]/div/div[2]/a[3]/div")
	public WebElement mealPlanLink;
	
	@FindBy(xpath="//*[@id='top']/div[1]/div[2]/div/div[2]/a[4]/div")
	public WebElement taxPlanLink;
	
	@FindBy(xpath="//*[@id='top']/div[1]/div[2]/div/div[2]/a[5]/div")
	public WebElement priceLink;
	
	@FindBy(xpath="//*[@id='top']/div[1]/div[2]/div/div[2]/a[6]/div")
	public WebElement reservationLink;
	
	@FindBy(xpath="//*[@id='top']/div[1]/div[2]/div/div[2]/a[7]/div")
	public WebElement reportsLink;
	
	
	
	

}
