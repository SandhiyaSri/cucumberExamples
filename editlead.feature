@LeadScenarios
Feature: Edit lead Functionality
Scenario Outline: TS001_EditLead Testcase

When Click 'Leads' link
And CLick 'Find Leads' Link
Then Redirect to  'Find Leads' page
When Click 'Phone' tab
Then Give PhoneNumber <phoneNumber>
When Click 'Find Leads' button
And Click first lead
Then Go to 'View Lead' page
When Click 'Edit' Link
Then Update companyname as <companyName>
Then Click submit button

Examples:
|companyName|
|'TCS'|