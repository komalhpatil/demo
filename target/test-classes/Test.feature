
@tag
Feature: Login to Linkedin to view the profile
	
	
  @Happypath
  Scenario Outline: Positive Test of login to linked in to view the profile
  	Given User landed on Linkedin page
  	When Logged in with username <name> and password <password>
  	When User clicks on view profile name <namef> is displayed
  	
  	
  	
  	 Examples: 
      | name  								|  password		    |	namef|
      | komalhpatil@gmail.com |  Casio@123    | Komal Patil|
  	
     @Happypath
  Scenario Outline: Positive Test of login to linked in to view the profile
  	Given User landed on Linkedin page
  	When Logged in with username <name> and password <password>
  	When User clicks on view profile name <namef> is displayed
  	
  	
  	
  	 Examples: 
      | name  								|  password		    |	namef|
      | komalhpatil@gmail.com |  Casio@123    | Komal Patil|
  	
  	  @Happypath
  Scenario Outline: Positive Test of login to linked in to view the profile
  	Given User landed on Linkedin page
  	When Logged in with username <name> and password <password>
  	When User clicks on view profile name <namef> is displayed
  	
  	
  	
  	 Examples: 
      | name  								|  password		    |	namef|
      | komalhpatil@gmail.com |  Casio@123    | Komal Patil|
  	

