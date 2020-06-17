Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "rck" and password "1234"
Then Home page is populated
And Cards are displayed if "true"

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "lalit" and password "4321"
Then Home page is populated
And Cards are displayed if "false"