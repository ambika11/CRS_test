package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEditProperty {
	
	WebDriver driver;
	
	@FindBy(id="inputName")
	private WebElement hotelNameTextBox;
	
	@FindBy(id="noOfFloorsInput")
	private WebElement noOfFloorsTextBox;
	
	@FindBy(id="textAreaDescription")
	private WebElement descriptionTextBox;
	
	@FindBy(id="inputAddressLine1")
	private WebElement addressLine1;
	
	@FindBy(id="inputAddressLine2")
	private WebElement addressLine2;
	
	@FindBy(xpath="//*[@id='property_form_id']/div/div[1]/div[2]/address-country-fields/div/div[1]/div[1]/div/select")
	private WebElement countryDropdown;
	
	@FindBy(xpath="//*[@id='property_form_id']/div/div[1]/div[2]/address-country-fields/div/div[1]/div[2]/div/select")
	private WebElement stateDropdown;
	
	@FindBy(xpath="//*[@id='property_form_id']/div/div[1]/div[2]/address-country-fields/div/div[2]/div[1]/div/select")
	private WebElement townDropdown;
	
	@FindBy(id="inputPinCode")
	private WebElement pincodeTextBox;
	
	@FindBy(xpath="//*[@id='property_form_id']/div/div[1]/div[2]/address-country-fields/div/div[3]/div[1]/div/select")
	private WebElement locationDropdown;
	
	@FindBy(xpath="//*[@id='property_form_id']/div/div[1]/div[2]/address-country-fields/div/div[3]/div[2]/div/select")
	private WebElement cityDropdown;
	
	@FindBy(id="inputLandmark")
	private WebElement landmarkDropdown;
	
	@FindBy(id="inputLatitude")
	private WebElement latitudeTextBox;
	
	@FindBy(id="inputLongitude")
	private WebElement longitudeTextBox;
	
	@FindBy(id="inputContactEmail")
	private WebElement contactEmailTextBox;
	
	@FindBy(id="fl-input-0")
	private WebElement timezoneSearchBox;
	
	@FindBy(xpath="//*[@id='property_form_id']/div/div[2]/div[2]/fieldset/div[3]/select")
	private WebElement currencyDropdown;
	
	@FindBy(id="inputCheckin")
	private WebElement checkinField;
	
	@FindBy(id="inputCheckout")
	private WebElement checkourField;
	
	@FindBy(id="inputChild1AgeFrom")
	private WebElement childAgeWithoutBedTextBox;
	
	@FindBy(id="inputChild2AgeFrom")
	private WebElement childAgeWithBedTextBox;
	
	//Bank Details
	@FindBy(id="accountName")
	private WebElement accountNameTextBox;
	
	public CreateEditProperty(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, CreateEditProperty.class);
	}

}
