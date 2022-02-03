@LeadScenarios
Feature: Create lead Functionality

Scenario Outline: TS003_CreateLead Testcase

When Click 'Leads' Link
Then Go to 'My Leads' page
When Click 'Create Lead' Link
Then Go to 'Create Lead' page
Given Enter CompanyName as <companyname>
And Enter FirstName as <firstname>
And Enter LastName as <lastname>
And Enter PhoneNumber as <phoneNumber>
When Click CreateLead Button
Then Check view lead page

Examples:
|companyname|firstname|lastname|phoneNumber|
|'regSmo'|'first3'|'last3'|'1234567890'|
