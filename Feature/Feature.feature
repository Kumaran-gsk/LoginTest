
Feature: Google

  @tag1
  Scenario: Google click
    Given launch chrome browser
    And open URL "https://www.mycontactform.com/"
    When login with username "Kumaran_gsk" & password "Kumarangsk@102"
    Then The Page Tile should display "Form Management - myContactForm.com" 
    And close browser
  