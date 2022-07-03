Feature: Logout feature
  As a logged in user I should be securely able to logout so that I can end my session.
@Logout
Scenario:
  Given User on the homepage
  When  User clicks on user dropdown menu
  Then  User clicks on logout button
  And   User logged out securely