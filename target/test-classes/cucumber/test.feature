
@tag
Feature: Purchase the order from Ecommerce Website
  I want to use this template for my feature file

	Background:
	Given I landed on Ecommerce Page

  @Regression1
  Scenario Outline: Positive Test of Submitting the order
  
    Given Logged in with username <name> and password <password>


    Examples: 
      | name  								|  password		    |	
      | komalhpatil@gmail.com |  Rahul@123    | 

