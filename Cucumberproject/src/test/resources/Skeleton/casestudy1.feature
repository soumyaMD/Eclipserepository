Feature:Testme App Login feature file
Scenario:Valid login for Testme App
Given The URL of Testme App "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
When User enters "soumyamda1" as userName
And User enters "soumya" as firstname
And User enters "md" as lastname
And User enters "soumya123" as Password
And User enters "soumya123" as confirmpassword
And User enters "Female" as gender
And User enters "soumya123@gmail.com" as E-mail
And User enters "9741066251" as Mobilenumber
And User enters "28/03/1998" as DOB
And User enters "Nagamangala123" as Address
And User enters "What is your Birth Place" as SecurityQuestion
And User enters "Nagamangala" as Answer
And User clicks on register button
Then User is in a valid Page

 