Feature: To validate the Login Functionality of facebook Application

Scenario: To validate login with valid username and invalid password

Given To Launch the Chrome browser and maximize window

When To Launch the url of the facebook application

And To pass Valid username in email field

And To pass Invalid password in password field

And To click the login button

And To check whether navigate to the home page or not
Then To close the browser

Scenario Outline: To validate the positive and negative combination of login functionality
Given User has to launch the browser and maximize the window
When User has to hit the facebook url 
And User has to pass the data "<emaildata>"in email field
And User has to pass the data "<passworddatas>"in password field
And User has to click login button
Then User has to close the browser

Examples:

|emaildatas 							|passworddatas|
|seleniuminmakes@gmail.com|inmakes			|
|pojomaven@gmail.com 			|254158				|
|cucumber@gmail.com				|inmake2545		|
|Testingjava@gmail.com 		|testcase25415|
|seleniumi2541@gmail.com	|inmakes			|
|Helloworld@gmail.com 		|254hello			|
|Jenkins@gmail.com				|java2145			|













