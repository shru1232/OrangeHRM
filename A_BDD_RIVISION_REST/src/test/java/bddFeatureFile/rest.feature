Feature: Test TestData5 Api endpoints with all requests

Background:
* configure base uri

Scenario: create new Entity
 Given set base path
 Then get request specification object
 And create request payload
 And attach request payload to request
 And select http post request