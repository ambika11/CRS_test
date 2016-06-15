package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SetPricesPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='top']/div/div[3]/section/div/div[4]/div/div/div[1]/div[1]/div/input")
	private WebElement startDate;
	
	@FindBy(xpath="//*[@id='top']/div/div[3]/section/div/div[4]/div/div/div[1]/div[2]/div/div/input")
	private WebElement endDate;
	
	@FindBy(xpath="html/body/div[1]/div[3]/section/div/div[5]/div/div/div[1]/div/form/fieldset/div[1]/div/input")
	private WebElement basePriceTextBox;
	
	@FindBy(xpath="html/body/div[1]/div[3]/section/div/div[5]/div/div/div[1]/div/form/fieldset/div[2]/div/input")
	private WebElement singlePriceTextBox;
	
	@FindBy(xpath="html/body/div[1]/div[3]/section/div/div[5]/div/div/div[1]/div/form/fieldset/div[3]/div/input")
	private WebElement doublePriceTextBox;
	
	@FindBy(xpath="html/body/div[1]/div[3]/section/div/div[5]/div/div/div[1]/div/form/fieldset/div[4]/div/input")
	private WebElement extraBedPriceTextBox;
	
	@FindBy(xpath="html/body/div[1]/div[3]/section/div/div[5]/div/div/div[1]/div/form/fieldset/div[5]/div/input")
	private WebElement extraBedRentalPriceTextBox;
	
	@FindBy(xpath="html/body/div[1]/div[3]/section/div/div[5]/div/div/div[1]/div/form/fieldset/div[6]/div/input")
	private WebElement extraChildWithoutBedPriceTextBox;
	
	@FindBy(xpath="html/body/div[1]/div[3]/section/div/div[5]/div/div/div[1]/div/form/fieldset/div[7]/div/input")
	private WebElement extraChildWithBedPriceTextBox;
	
	@FindBy(xpath="//*[@id='top']/div[1]/div[3]/section/div/sliding-buttons-container/div/div/div/div/div/button[2]")
	private WebElement saveButton;
	
	
	public SetPricesPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, SetPricesPage.class);
	}
	
	public void enterBasePrice(String bp)
	{
		basePriceTextBox.sendKeys(bp);
	}
	
	public void enterSinglePrice(String sp)
	{
		singlePriceTextBox.sendKeys(sp);
	}
	
	public void enterDoublePrice(String dp)
	{
		doublePriceTextBox.sendKeys(dp);
	}
	
	public void enterExtraBedPrice(String ebp)
	{
		extraBedPriceTextBox.sendKeys(ebp);
	}
	
	public void enterExtraBedRentalPrice(String ebr)
	{
		extraBedRentalPriceTextBox.sendKeys(ebr);
	}
	
	public void enterExtraChildWithoutBedPrice(String ecwob)
	{
		extraChildWithoutBedPriceTextBox.sendKeys(ecwob);
	}
	
	public void enterExtraChildWithBedPrice(String ecwb)
	{
		extraChildWithBedPriceTextBox.sendKeys(ecwb);
	}
	
	public PriceCalenderPage clickSave()
	{
		saveButton.click();
		return new PriceCalenderPage(driver);
	}
	
	

}
