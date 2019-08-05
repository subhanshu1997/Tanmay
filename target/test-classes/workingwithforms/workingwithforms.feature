Feature: Email Registration

Scenario: Invalid User Name
Given User is on User Registration Page
When User enters invalid User Name
Then The User Name  field is invalid

Scenario: Invalid password
Given User is on User Registration Page
When User enters valid User Name but invalid password
Then The Password field is invalid

Scenario: Invalid Confirm Password
Given User is on User Registration Page
When User enters valid User Name and Password but enters invalid data in Confirm Password field
Then The Confirm Password  field is invalid

Scenario: Invalid First Name
Given User is on User Registration Page
When User enters valid data in User Name,Password and Confirm Password field but invalid data in First Name field
Then The First Name  field is invalid

Scenario: Invalid Last Name
Given User is on User Registration Page
When User enters valid data in User Name,Password and Confirm Password field but invalid data in Last Name field
Then The Last Name  field is invalid

Scenario Outline: User is Registering an email Id
Given User is on User Registration Page
When User selects <input> radio button
Then <value> should be send as Gender value
Examples:
| input | value |
| Male | Male |
| Female | Female | 

Scenario: Invalid Date Of Birth
Given User is on User Registration Page
When User enters valid data in User Name,Password,Confirm Password and Last Name field but invalid data in Date of Birth field
Then The Date Of Birth field is invalid

Scenario: Invalid Email Id
Given User is on User Registration Page
When User enters valid data in User Name,Password,Confirm Password,Last Name and Date of birth field but invalid data in Email Id field
Then The Email Id" field is invalid

Scenario: Invalid Address
Given User is on User Registration Page
When User enters valid data in User Name,Password,Confirm Password,Last Name,Date of birth and Email Id field but invalid data in Address field
Then The Address  field is invalid

Scenario Outline: User is Registering an email Id
Given User is on User Registration Page
When User selects <city>
Then <status> should be send
Examples:
| city | status |
| Mumbai | Mumbai |
| Pune | Pune |
| Bangalore | Bangalore |
| Chennai | Chennai |

Scenario: Invalid Phone Field
Given User is on User Registration Page
When User enters valid data in User Name,Password,Confirm Password,Last Name,Date of birth,Email Id and Address field but invalid data in Phone field
Then The Phone field is invalid

Scenario Outline: User is Registering an email Id
Given User is on User Registration Page
When User selects <hobbies>
Then <status> should be send
Examples:
| hobbies | status |
| Music | Music |
| Reading | Reading |
| Movies | Movies |

Scenario: Sumit Form
Given User is on User Registration Page
When User clicks on Submit button with valid inputs
Then Redirected to Success Page 

Scenario: Reset Form
Given User is on User Registration Page
When User clicks on Reset button
Then All fields in forms should be set to blank




