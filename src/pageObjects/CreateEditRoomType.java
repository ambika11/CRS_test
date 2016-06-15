package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class CreateEditRoomType {
	
	WebDriver driver;
	
	@FindBy(id="inputName")
	private WebElement nameTextBox;
	
	@FindBy(id="textAreaDescription")
	private WebElement descriptionTextbox;
	
	@FindBy(id="baseOccupancy")
	private WebElement baseOccupanyTextBox;
	
	@FindBy(id="maxExtraBed")
	private WebElement maxExtraBedTextBox;
	
	@FindBy(id="maxChildrenWithoutBed")
	private WebElement maxChildwoBedTextBox;
	
	@FindBy(xpath="//*[@id='top']/div[1]/div[3]/section/div/sliding-buttons-container/div/div/div/div/div/button[2]")
	private WebElement submitButton;
	
	@FindBy(xpath="//*[@id='top']/div[1]/div[3]/section/div/sliding-buttons-container/div/div/div/div/div/button[1]")
	private WebElement cancelButton;
	
	
	public CreateEditRoomType(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, CreateEditRoomType.class);
	}
	
	public void enterRoomTypeName(String name)
	{
		nameTextBox.sendKeys(name);
	}
	
	public void enterDescription(String descr)
	{
		descriptionTextbox.sendKeys(descr);
	}
	
	public void enterBaseOccupany(String base)
	{
		baseOccupanyTextBox.sendKeys(base);
	}
	
	public void enterMaxChildWithoutBed(String chBed)
	{
		maxChildwoBedTextBox.sendKeys(chBed);
	}
	
	public RoomTypeList clickSubmit()
	{
		submitButton.click();
		return new RoomTypeList(driver);
	}
	
	
	

}
