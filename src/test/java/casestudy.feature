Feature: TestMe App User wanna signup in the TestMe App 

Scenario: SignUp to TestMe App
Given Open browser and proceed to TestMe App
When User enters User Name as "hsgvssd"
And User enters First Name as "ijaz"
And User enters Last Name as "khan"
And User enters Password as "Ijaz24398"
And User enters Confirm Password as "Ijaz24398"
And User select gender as "Male"
And User enters E -Mail as "helloit@gmail.com"
And User enters Mobile Number as "9876543210"
And User enters DOB as "03/24/1998"
And User enters Address as "no:31,gandhi street"
And User enters Answer as "on earth"
And User clicks on register button
Then Check if TestMe App home page is displayed