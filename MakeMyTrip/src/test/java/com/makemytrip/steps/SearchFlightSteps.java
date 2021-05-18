package com.makemytrip.steps;

import com.makemytrip.actions.FlightsSearchPageActions;
import com.makemytrip.utils.SeleniumDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchFlightSteps {
	
	FlightsSearchPageActions searchActions = new FlightsSearchPageActions();
	
	@Given("^I am on the Home Page \"([^\"]*)\" of makemytrip Website$")
	public void i_am_on_the_Home_Page_of_makemytrip_Website(String url) throws Throwable {
		SeleniumDriver.openPage(url);
	}
	

	
	@Then("^I select RoundTrip radioButton$")
	public void i_select_RoundTrip_radioButton() throws Throwable {
		
		searchActions.chooseToHaveRoundTripJourney();
	}

	@Then("^I enter \"([^\"]*)\" and \"([^\"]*)\" values$")
	public void i_enter_and_values(String fromCity, String toCity) throws Throwable {
		System.out.println("To City is "+toCity);
		System.out.println("From City "+fromCity);
		
		
		searchActions.enterSourceAs(fromCity);
		searchActions.selectTheFirstAvailableAutoCompleteOptionFromSource();
		searchActions.enterDestinationAs(toCity);
		searchActions.selectTheFirstAvailableAutoCompleteOptionFromDestination();
		
	}

	@Then("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String departureDate, String returnDate) throws Throwable {
		
		Thread.sleep(3000);
		searchActions.clickDeparture();
		searchActions.enterDepartureDateAs(departureDate);
		searchActions.clickReturn();
		
		Thread.sleep(5000);
		searchActions.enterReturnDateAs(returnDate);
	}

	@Then("^I select <traveller> class$")
	public void i_select_traveller_class() throws Throwable {
		searchActions.travellers();
	}

	@Then("^I select \"([^\"]*)\" and \"([^\"]*)\" and (\\d+) and (\\d+)$")
	public void i_select_and_and_and(String adults, String childs, int infants, int businessClass) throws Throwable {
		Thread.sleep(5000);
		searchActions.selectNumberOfAdults();
		searchActions.selectNumberOfChilds();
		searchActions.selectNumberOfInfants();
		searchActions.classSelect();
		Thread.sleep(4000);
		
	}

	@Then("^I select apply button$")
	public void i_select_apply_button() throws Throwable {
		
		Thread.sleep(3000);
		searchActions.applyButton();
		
	}
	
	

	@Then("^I click on search$")
	public void i_click_on_search() throws Throwable {
		
		Thread.sleep(4000);
		searchActions.searchAction();
	}
}
