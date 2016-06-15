package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyDashboard extends PropertyMenuCommonLinks {
	
	WebDriver driver;
	
	public PropertyDashboard(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, PropertyDashboard.class);
	}
	
	public PropertyDashboard clickDashboardLink()
	{
		dashboardLink.click();
		return new PropertyDashboard(driver);
	}
	
	public RoomTypeList clickRoomTypeLink()
	{
		roomTypeLink.click();
		return new RoomTypeList(driver);
	}
	
	public MealPlanList clickMealPlanLink()
	{
		mealPlanLink.click();
		return new MealPlanList(driver);
	}
	
	public TaxPlanListPage clickTaxPlanList()
	{
		taxPlanLink.click();
		return new TaxPlanListPage(driver);
	}
	
	public PriceCalenderPage clickPriceLink()
	{
		priceLink.click();
		return new PriceCalenderPage(driver);
	}
	
	public ReservationCalender clickReservationLink()
	{
		reservationLink.click();
		return new ReservationCalender(driver);
	}
	
	public Reports clickReportsLink()
	{
		reportsLink.click();
		return new Reports(driver);
	}

}
