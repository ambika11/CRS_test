package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaxPlanListPage {
	
	WebDriver driver;
	
	@FindBy(id="//*[@id='top']/div[1]/div[3]/section/div/div[1]/h1/div/div/button")
	private WebElement plusButton;
	
	public TaxPlanListPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, TaxPlanListPage.class);
	}
	
	

}
