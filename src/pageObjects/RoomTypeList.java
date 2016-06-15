package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomTypeList {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='top']/div[1]/div[3]/section/div[2]/div[2]/div/div/button")
	private WebElement  plusButton;
	
	public RoomTypeList(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, RoomTypeList.class);
	}
	
	public CreateEditRoomType clickPlusButton()
	{
		plusButton.click();
		return new CreateEditRoomType(driver);
	}

}
