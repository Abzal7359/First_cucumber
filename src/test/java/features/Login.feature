@all
Feature: User Login
Registerd user shoulb able to login succesfully or not

Background:
Given user navigates to login page

@login @validcredintials @smoke @regression
Scenario Outline: Login with valid credintials

#Given user navigates to login page
When user enters valid email address <email>
When user enters valid password <password>
And clicks login button
Then user should login succesfully
Examples:
|email							|password			|
|abzalHuss@gmail.com|12349				|
|naveen@gmail.com		|3201k				|
|harish@gmail.com		|1nvdu829			|

@login @ivalidcredintials @smoke @regression
Scenario: Login with Invalid credintials
#Given user navigates to login page
When user enters INvalid email address "abzal27359@gmail.com"
When user enters INvalid password "77359@Abzal"
And clicks login button
Then user should get proper warning message

@login @validemailandivalidpassword @smoke
Scenario: Login with valid email address and Invalid password
#Given user navigates to login page
When user enters valid email address "abzalhussain27359@gmail.com"
When user enters INvalid password "77359@Abzal"
And clicks login button
Then user should get proper warning message

Scenario: Login with Invalid email address and valid password
#Given user navigates to login page
When user enters INvalid email address "abzal27359@gmail.com"
When user enters valid password "73597359@Abzal"
And clicks login button
Then user should get proper warning message

Scenario: Login without any  credintials
#Given user navigates to login page
When user doesnt enter any credintials
And clicks login button
Then user should get proper warning message


