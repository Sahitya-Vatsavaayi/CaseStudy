Feature: Conduit CRUD Functions

Scenario:  Login into App
Given User is on Login page
When User provide "bing4053@gmail.com" and "Bingoboi@123"
Then User should be on Home Page

Scenario: Create new Article
Given User should be on New Article Page
When User enters Article details
 | BingoTitle9 | Doggie | Bingoooo | Black |
Then Article must be created

Scenario: View Article
Given User should be on Global Feed page
When User select an article "BingoTitle9"
Then Article detail page must be displayed in view article


Scenario: Update an Article
Given Article detail page must be displayed in update article
When User update article detail
Then Article detail must be updated

Scenario: Delete an Article
Given Article detail page must be displayed in delete article
When User delete article 
Then Article must be