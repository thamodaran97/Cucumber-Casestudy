Feature: User Search in TestMeApp

@ValidSearch
Scenario: Valid Search
Given User should be in the search page
When User search for the product as "head", add to cart and proceed to payment
Then User receives the order conformation 

@InvalidSearch
Scenario: Invalid Search
Given User should be in the search page
When User searches for the invalid product as "camera"
Then User gets notification as invalid product 

@NoPurchase
Scenario: No Purchase
Given User should be in the search page
When User search for the product as "head" but does not add to cart
Then User tries to display the cart and finds no item in cart