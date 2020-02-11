#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
Feature: Costco seaarch Test Feature
Scenario: Costco search scenario
Given the user is on Costco home page
When title of home page is Costco Wholesale
Then user enters Paper Towel in search bar
Then user submits the data
Then user is on SearchResult page   

   