package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEditMealPlan {
	
	WebDriver driver;
	
	@FindBy(id="mealPlanName")
	private WebElement mealPlanNameTextBox;
	
	@FindBy(id="mealPlanDescription")
	private WebElement mealPlanDescTextBox;
	
	@FindBy(xpath="//*[@id='top']/div[1]/div[3]/section/div/sliding-buttons-container/div/div/div/div/div/button[2]")
	private WebElement submitButton;
	
	public CreateEditMealPlan(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, CreateEditMealPlan.class);
	}
	
	public void enterMealPlanName(String name)
	{
		mealPlanDescTextBox.sendKeys(name);
	}
	
	public void enterDescription(String descr)
	{
		mealPlanDescTextBox.sendKeys(descr);
	}
	
	public MealPlanList clickSubmit()
	{
		submitButton.click();
		return new MealPlanList(driver);
	}
	


}
