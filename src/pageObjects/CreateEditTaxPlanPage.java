package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEditTaxPlanPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='surcharge_plan_form_id']/div[1]/div/div/button")
	private WebElement addButton;
	
	@FindBy(xpath="//*[@id='table-area-1']/tbody/tr[1]/td[1]")
	private WebElement taxToBeAdded;
	
	@FindBy(xpath="//*[@id='surcharge_plan_form_id']/div[3]/div/div[1]/div/div/div/fieldset/div/div[1]/div/input")
	private WebElement startDate;
	
	@FindBy(xpath="//*[@id='surcharge_plan_form_id']/div[3]/div/div[1]/div/div/div/fieldset/div/div[2]/div/div/input[1]")
	private WebElement endDate;
	
	@FindBy(xpath="//*[@id='surcharge_plan_form_id']/div[3]/div/div[1]/div/div/div/fieldset/div/div[4]/button")
	private WebElement addDateButton;
	
	@FindBy(id="valueFrom")
	private WebElement fromRange;
	
	@FindBy(id="valueTo")
	private WebElement toRange;
	
	@FindBy(xpath="//*[@id='top']/div/div[3]/section/div/sliding-buttons-container/div/div/div/div/div/button[2]")
	private WebElement saveButton;
	
	
	public CreateEditTaxPlanPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, CreateEditTaxPlanPage.class);
	}
	
	public void clickAddButton()
	{
		addButton.click();
	}
	
	public void selectTaxes()
	{
		taxToBeAdded.click();
	}
	
	public void selectStartDate(String sDate)
	{
		startDate.sendKeys(sDate);
	}
	
	public void selectEndDate(String eDate)
	{
		endDate.sendKeys(eDate);
	}

	public void enterFromRange(String fRange)
	{
		fromRange.sendKeys(fRange);
	}
	
	public void enterToRange(String tRange)
	{
		toRange.sendKeys(tRange);
	}
	
	public TaxPlanListPage clickSave()
	{
		saveButton.click();
		return new TaxPlanListPage(driver);
	}
}
