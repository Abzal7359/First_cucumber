@all
Feature: user Registration

Background:
Given user navigates to registration page

@smoke @register @mandatoryfields
Scenario: user registered with mandatory fields
#Given user navigates to registration page
When user enters below details into the fields
|firstname				|abzal|
|lastname					|shaik|
|email						|akmal987@gmail.com|
|mobile number		|7654312921|
|password					|9871|
|confirm password	|9871|

#When user enters firstname "abzal" into the firstname field
#When enters lastname "shaik" into the last name field
#And enters email "akmal987@gmail.com" into the email field
#And enter mobile number "7654312921" into mobile number field
#And enter password "9871" into password field
#And enter confirm password "9871" into confirm password field

And select privacy policy
And click continue button
Then Account should register successfully

@smoke @register @allfields
Scenario: user registered with all fields
#Given user navigates to registration page
When user enters below details into the fields
|firstname				|abzal|
|lastname					|shaik|
|email						|akmal987@gmail.com|
|mobile number		|7654312921|
|password					|9871|
|confirm password	|9871|
And select yes for NewsLetter
And select privacy policy
And click continue button
Then Account should register successfully
@emptyallfields @register
Scenario: user register without filling any fields
#Given user navigates to registration page
When user doesnt enter details into any fields
And click continue button
Then Appropriate warning mssgs display under all mandatory fields
@register @sanity 
Scenario: user registered with duplicate email address
#Given user navigates to registration page
When user enters below details into the fields
|firstname				|abzal|
|lastname					|shaik|
|email						|abzalhussain27359@gmail.com|
|mobile number		|7654312921|
|password					|9871|
|confirm password	|9871|
And select privacy policy
And click continue button
Then warning mssg displaying email is already existing
