Feature: Cucumber Casestudy Scenario1
Scenario: User credentials registration

Given Open browser and proceed to TestMe App
When User enters User Name as "RamKriskjhhf"
And User enters First Name as "Ram"
And User enters Last Name as "Krish"
And User enters Password as "ramkr98"
And User enters Confirm Password as "ramkr98"
And User select gender as "Male"
And User enters E -Mail as "ramkr98@gmail.com"
And User enters Mobile Number as "9876543210"
And User enters DOB as "10/10/2010"
And User enters Address as "YYYY"
And Select the Security question
And User enters Answer as "on earth"
And User clicks on login button
Then Check if TestMe App login page is displayed