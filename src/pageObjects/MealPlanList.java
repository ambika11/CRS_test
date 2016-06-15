package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MealPlanList {
	
	WebDriver driver;
	
	public MealPlanList(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, MealPlanList.class);
	}

}
