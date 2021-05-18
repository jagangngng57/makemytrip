package com.makemytrip.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
import com.makemytrip.locators.FlightsSearchPageLocators;
import com.makemytrip.utils.SeleniumDriver;

public class FlightsSearchPageActions {
	
	FlightsSearchPageLocators flightSearchPageLoc=null;
	WebDriver driver;
	
	public FlightsSearchPageActions()
	{
		flightSearchPageLoc=new FlightsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), flightSearchPageLoc);
	}
	
	public void clickonFlights()
	{
		try {
			Thread.sleep(20000);
			flightSearchPageLoc.searchAction.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void chooseToHaveRoundTripJourney() {
		try {
		flightSearchPageLoc.roundTrip.click();
		}catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@data-cy='roundTrip']")));
		  }
    }
	
	
	public void enterSourceAs(String destination) {
		System.out.println("Destination is from Feature: "+destination);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		flightSearchPageLoc.fromCity.sendKeys(destination);
		

    }
	
	
    public void enterDestinationAs(String origin)  {
    	//flightSearchPageLoc.toCity.clear();
    	System.out.println("origin is from Feature: "+origin);
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    	flightSearchPageLoc.toCity.sendKeys(origin);
    	
    	


    	
    	
    }

    
    public void enterDepartureDateAs(String date) {
    	flightSearchPageLoc.departureDate.click();
    }

    
    public void clickReturn() {
    	flightSearchPageLoc.returns.click();
    
    }
    
    public void clickDeparture() {
    	flightSearchPageLoc.departure.click();
    
    }
    
    public void enterReturnDateAs(String date) {
    	flightSearchPageLoc.returnDate.click();
    	//SeleniumDriver.getDriver().findElement(By.xpath("//*[@class='monthBlock last']//a[text()='"+date.split("/")[0]+"'] ")).click();
    }
    
    public void travellers()
    {
    	flightSearchPageLoc.travellerClass.click();
    }
    
    public void selectNumberOfAdults()
    {
    	flightSearchPageLoc.adults.click();
    }
    
    public void selectNumberOfChilds()
    {
    	flightSearchPageLoc.childs.click();
    }
    
    public void selectNumberOfInfants()
    {
    	flightSearchPageLoc.infants.click();
    }
    
    public void classSelect()
    {
    	flightSearchPageLoc.businessClass.click();
    }
    
    public void applyButton()
    {
    	flightSearchPageLoc.applyAction.click();
    }
    
    public void searchAction()
    {
    	flightSearchPageLoc.searchAction.click();
    }
    
    
    
    public void selectTheFirstAvailableAutoCompleteOptionFromSource() {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(SeleniumDriver.getDriver())
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement optionListElement = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//p[@class='font12 greyText appendBottom3']"));
            }
        });

        //select the first item from the auto complete list
        WebElement originOptionsElement = optionListElement;
        List<WebElement> originOptions = originOptionsElement.findElements(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']"));
        originOptions.get(0).click();
    }
    
    public void selectTheFirstAvailableAutoCompleteOptionFromDestination() {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(SeleniumDriver.getDriver())
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement optionListElement = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//p[@class='font12 greyText appendBottom3']"));
            }
        });

        //select the first item from the auto complete list
        WebElement originOptionsElement = optionListElement;
        List<WebElement> originOptions = originOptionsElement.findElements(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']"));
        System.out.println("List is ");
        originOptions.get(0).click();
        
        for (WebElement webElement : originOptions) {
        	System.out.println(webElement);
			
		}

    }
}
