Feature:  As a user I should be able to create, edit and delete contacts.
  So that I can have contact list and I can find the related contact with search option.
@contactCreate
  Scenario:  User should be able to create a new contact.
    Given User on the homepage
    When  User click on contacts button
    And   User click on create button
    And   User fills the new contact form and clicks save button
    Then  Verify user has created new contact successfully