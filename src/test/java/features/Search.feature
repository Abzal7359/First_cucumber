@all
Feature: searching for products

Background:
Given user opens the application

@search @validproduct @smoke
Scenario: serach for valid product
#Given user opens the application
When enter valid product into search field
And click on search button
Then valid product should get displayed in search results

@search @invalidproduct
Scenario: serach for INvalid product
#Given user opens the application
When enter INvalid product into search field
And click on search button
Then proper text display no product matching should display

@search @emptysearch
Scenario: serach withour providing any product
#Given user opens the application       >>I use background keyword instead of writing Given same in every scenario
When user doesnt enter any product name into search field
And click on search button
Then proper text display no product matching should display 



