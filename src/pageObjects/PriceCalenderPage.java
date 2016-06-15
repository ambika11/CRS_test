package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Factory;

public class PriceCalenderPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='top']/div/div[3]/section/div/div[4]/div/div/div/div[1]/div/select")
	private WebElement roomTypeDropdown;
	
	@FindBy(xpath="//*[@id='top']/div/div[3]/section/div/div[4]/div/div/div/div[2]/div/select")
	private WebElement mealPlanDropdown;
	
	@FindBy(xpath="//*[@id='top']/div/div[3]/section/div/div[4]/div/div/div/div[3]/button")
	private WebElement setPriceButton;
	
	
	public PriceCalenderPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, PriceCalenderPage.class);
	}
	
	public void selectRoomType(String roomType)
	{
		Select select = new Select(roomTypeDropdown);
		select.selectByValue(roomType);
	}
	
	public void selectMealPlan(String mealPlan)
	{
		Select select = new Select(mealPlanDropdown);
		select.selectByValue(mealPlan);
	}
	
	public SetPricesPage clickSetPricesButton()
	{
		setPriceButton.click();
		return new SetPricesPage(driver);
	}
	

}
