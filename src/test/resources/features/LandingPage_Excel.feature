Feature: Landing web page

  Scenario Outline: Verify painting experts functionality with valid data
  	Given Chrome is opened and Asain paints app is opened
    Then User navigates on landing page
    When User enter sheetname "<SheetName>" and rownumber <RowNumber>
    And User click on Whatsapp notification 
    And User click on the Enqire Now button
    Then It Shows Thank you for your details  this message
    Examples:
					| SheetName    |   RowNumber  |
					| Sheet1       |      0       |
					