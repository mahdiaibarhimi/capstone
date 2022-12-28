Feature: Retail Account page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Aryana.sayed@gmail.com' and password 'Aryana1234&'
    And User click on loginbutton
    And User should be logged in into Account
    When User click on Account option

  @Test1
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Ahmad' and Phone '5713220192'
    And User click on Update button
    Then user profile information should be updated

  @Test2
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Aryana123&     | Aryana1234&   | Aryana1234&       |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @card
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2134567891011121 | Aryana     |              10 |           2024 |          123 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @update
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User  select the payment Card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2244567891087650 | David       |               6 |           2024 |          517 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @removed
  Scenario: Verify User can remove Debit or Credit card
    And User select the payment Card
    And User click on remove option of card section
    Then payment details should be removed

  @adress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName     | phoneNumber | streetAddress | apt | city       | state    | zipCode |
      | United States | Aryana sayed |  5713220192 | semonaryroad  | 404 | Aloxandria | Virginia |   22195 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @updateaddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user  fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city    | state   | zipCode |
      | United States | jack bower |  5713425344 | tassleford road   | 303 | Alexandria | Newyork |   21221 |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @removedaddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
