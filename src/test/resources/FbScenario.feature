@Feature1
Feature:To validate the login functionality of facebook application
Background:
Given To launch the chrome browser and maximize the window
@Regression @Sanity
Scenario:To validate login with valid username and invalid password
When To launch the url of the facebook application
And 	To pass valid username in email field
And 	To pass invalid password in password field
And To click the login button
And To check whether navigate to the homepage or not
Then To close the browser

@Smoke
Scenario Outline: To validate the positive and negative combination of login fuctionality
#Given User has to launch the browser and maximize the window
When User has to hit the facebook url
And User has to pass the data "<emaildatas>" in email field
And User has to pass the data "<passworddatas>" in password field
And User has to click the login button
Then User has to close the browser

Examples:
|emaildatas		    		|passworddatas|
|esakki@gmaill.com		|23232323|
|rani@gmail.com   		|afsdfsd|
|seleniuminmakes@gmail.com  		|inmakes|
|seleniumrani@gmail.com		|inmkes345|
|esairani@gmail.com			|4343434|
|ramco@gmail.com			|fsdfsdfsd|