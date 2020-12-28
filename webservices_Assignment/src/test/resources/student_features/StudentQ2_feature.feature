
Feature: Validate response from jsonholder webservice

  
  Scenario: Request a response and ceck for particular userID
    Given set the GET method as /posts 
    When Get the webservices https://jsonplaceholder.typicode.com/posts
    Then check the status code is 200
    And check if response body  includes
    
  And  get the value of title from the response with userID
  
  
  
	
   
 
  
