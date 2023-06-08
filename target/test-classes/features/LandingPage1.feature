Feature: Landing web page

  Scenario: Validate user navigates to Landing Page
    Given Chrome is opened and Asain paints app is opened
    Then User navigates on landing page
    
 Scenario: Validate Landing page UI
    Given Chrome is opened and Asain paints app is opened
    Then User navigates on landing page
    Then fields are visible on the landing page
    
 Scenario: Validate Lanidng page fields
 		Given Chrome is opened and Asain paints app is opened
   	Then User navigates on landing page
   	When User Enter the pincode "456456" in Find the store feild
    Then User is Should able to Enter the pincode 