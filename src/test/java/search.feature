Feature: user search for a product


Background: user login using credentials
Given user in the sign in page
When user enter the "lalitha" and "Password123"
Then user login successfull!!!

#@tag
Scenario: user search for a available product
Given user in the home page to search
When user search the product as "head" in the search box
Then product description page is visible

#@tag2
Scenario: user search for a unavailable product
Given user in the home page to search
When user search the different product as "telephone" in the search box
Then product not available page is displayed

Scenario: user searches with a blank text
Given user in the home page to search
When user search for a product with blank text
Then popup appears