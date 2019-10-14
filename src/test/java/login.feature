Feature: user login in the application
Scenario Outline: user login using credentials

Given user enter the credentials
When user enter the "username" and "password"
Then login successfull!!! 
Examples: 
|username||password|
|lalitha||Password123|  