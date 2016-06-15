package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParticularChainList {
	
	WebDriver driver;
	
	public ParticularChainList(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, ParticularChainList.class);
	}
	
	@FindBy(xpath="//*[@id='top']/div/div[3]/section/div[1]/div/button[1]")
	private WebElement chainsButton;
	
	@FindBy(xpath="//*[@id='top']/div/div[3]/section/div[1]/div/button[2]")
	private WebElement propertyButton;
	
//	@FindAll({@FindBy(xpath="//img[@class='card-gradient']")})
//	List<WebElement> allChains;
//	
//	@FindAll({@FindBy(xpath="//div[@class='card-content ']/span/strong")})
//	List<WebElement> allChainsText;
	
	@FindAll({@FindBy(xpath="//img[@class='card-gradient']")})
	List<WebElement> allProperties;
	
	@FindAll({@FindBy(xpath="//div[@class='card-content ']/span/strong")})
	List<WebElement> allPropertiesText;
	
	public void clickChainButton()
	{
		chainsButton.click();
	}
	
	public void clickPropertyButton()
	{
		propertyButton.click();
	}
	
	//to select a particular chain
//	public void clickChainCard(String name)
//	{
//		for (WebElement chain : allChains) 
//		{
//			for (WebElement chainText : allChainsText)
//			{
//				if (chainText.getText().equals(name))
//				{
//					chain.click();
//				}
//			}
//			
//		}
//	}
	
	//to select a particular property
	public PropertyDashboard clickPropertyCard(String name)
	{
		for (WebElement property : allProperties) 
		{
			for (WebElement propertyText : allPropertiesText)
			{
				if (propertyText.getText().equals(name))
				{
					property.click();
					break;
				}
			}
			
		}
		
		return new PropertyDashboard(driver);
	}

}
