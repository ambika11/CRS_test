package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Reports {
	
    WebDriver driver;
	
	public Reports(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, Reports.class);
	}


}
