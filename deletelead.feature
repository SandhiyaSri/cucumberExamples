@LeadScenarios
Feature: Delete lead Functionality


Scenario Outline: TS001_DeleteLead Testcase

When Click 'Leads' link
And CLick 'Find Leads' Link
Then Redirect to  'Find Leads' page
When Click 'Phone' tab
Then Give PhoneNumber <phoneNumber>
When Click 'Find Leads' button
And Click first lead
Then Go to 'View Lead' page
When Click 'Delete' link
And Click 'Find Leads' link
Then Redirect to 'Find Leads' page
Given Give FirstLeadid in leadId textbox
When click 'Find Leads' Button
Then Get RecordsText and check

Examples:
|phoneNumber|1234567890|



