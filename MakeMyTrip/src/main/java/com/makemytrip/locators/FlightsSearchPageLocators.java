package com.makemytrip.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsSearchPageLocators {

	
	
	@FindBy(xpath="//span[contains(text(),'DEPARTURE')]")
	public WebElement departure;
	
	@FindBy(xpath="//*[@data-cy='roundTrip']")
	public WebElement roundTrip;
	
	@FindBy(xpath="//*[@id='fromCity']")
	public WebElement fromCity;
	
	@FindBy(xpath="//p[@class='font12 greyText appendBottom3']")
	public WebElement actionMove;
	
	@FindBy(xpath="//*[@id='toCity']")
	public WebElement toCity;
	
	@FindBy(xpath="//div[@class='DayPicker-Day'][contains(@aria-label,'Tue May 18 2021')]")
	public WebElement departureDate;
	
	
	@FindBy(xpath="//span[contains(text(),'RETURN')]")
	public WebElement returns;	

	
	@FindBy(xpath="//div[@aria-disabled='false'][contains(@aria-label,'Sun May 30 2021')]")
	public WebElement returnDate;
	
	@FindBy(xpath="//span[contains(text(),'Travellers & CLASS')]")
	public WebElement travellerClass;
	
	@FindBy(xpath="//*[@data-cy='adults-2']")
	public WebElement adults;
	
	@FindBy(xpath="//*[@data-cy='children-1']")
	public WebElement childs;
	
	@FindBy(xpath="//*[@data-cy='infants-1']")
	public WebElement infants;
	
	@FindBy(xpath="//li[contains(text(),'Business')]")
	public WebElement businessClass;
	
	
	@FindBy(xpath="//button[contains(text(),'APPLY')]")
	public WebElement applyAction;
	
	@FindBy(xpath="//a[contains(text(),'Search')]")
	public WebElement searchAction;
	
	
	
	
	
}
