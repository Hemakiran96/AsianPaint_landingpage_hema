Feature: Landing web page

  Scenario Outline: Verify painting experts functionality with valid data
  	Given Chrome is opened and Asain paints app is opened
    Then User navigates on landing page
    When User enter "<Name>" and "<Gmail>" and "<Mobile>" and "<Pincode>"
    And User click on Whatsapp notification 
    And User click on the Enqire Now button
    Then It Shows Thank you for your details  this message
    Examples:
					| Name      |        Gmail        |   Mobile   | Pincode |
					| Hemakiran | Hemakiran@gmail.com | 9999999999 |  533287 |
     
  Scenario Outline: Verify painting experts functionality with invalid data
  	Given Chrome is opened and Asain paints app is opened
    Then User navigates on landing page
    When User enter "<Name>" and "<Gmail>" and "<Mobile>" and "<Pincode>"
    And User click on Whatsapp notification 
    And User click on the Enqire Now button
    Then It Shows Enter invalid details
    Examples:
					| Name      |        Gmail        |   Mobile   | Pincode |
					| Hemakiran | Hemakiran@gmail.com | @@@@@@@@@@ |  533287 |