package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChainListPage {
	
	WebDriver driver;
	
	public ChainListPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, ChainListPage.class);
	}
	
	@FindAll({@FindBy(xpath="//img[@class='card-gradient']")})
	List<WebElement> allChains;
	
	@FindAll({@FindBy(xpath="//div[@class='card-content ']/span/strong")})
	List<WebElement> allChainsText;
	
	//to select a particular chain
	public void clickChainCard(String name)
	{
		for (WebElement chain : allChains) 
		{
			for (WebElement chainText : allChainsText)
			{
				if (chainText.getText().equals(name))
				{
					chain.click();
				}
			}
			
		}
	}
	
	

}
