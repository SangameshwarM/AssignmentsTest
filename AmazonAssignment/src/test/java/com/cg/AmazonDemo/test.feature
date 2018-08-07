Feature: Amazon Booking
Scenario: Complete Booking on Amazon
Given Open Amazon
When I enter Search as TV
Then TV Should be added to cart
When I Search as Sun Glasses
Then Sun Glasses Should be added to cart
When I click Search Mi Note4
Then Mi Note4 Should be added to cart
When I want to buy fossil watch
Then fossil watch Should be added to cart
When I wish to Buy Iphone10
Then Iphone10 Should be added to cart
When 5 Items are added
Then Go to Payment Page