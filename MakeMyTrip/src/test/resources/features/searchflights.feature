Feature: Acceptance testing.
  In order to book the tickets verify that makemytrip page is loading and able to book the tickets

   Scenario Outline: Validate ticketBooking
    Given I am on the Home Page "https://www.makemytrip.com/" of makemytrip Website
    Then I select RoundTrip radioButton
    Then I enter <From> and <To> values 
    Then I enter <Departure> and <ReturnDate>
    Then I select <traveller> class
    Then I select <adults> and <childs> and <infants> and <class>
    Then I select apply button
    Then I click on search
    
    
        Examples:  
    |  From    			       |  To   		 	  |Departure 	   |ReturnDate  |adults|childs|infants |class  |
    | "Mumbai"             | "Bangalore"  |"19/05/2021"  |"27/05/2021"|"2"   |"1"   |1       |2      |
    
