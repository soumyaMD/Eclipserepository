Feature: Purchase Product
Scenario Outline: User purchase product succesfully
Given The URL of testme App "http://10.232.237.143:443/TestMeApp/login.htm"
When User enters "<username>" as UserName
And User enters "<password>" as PassWord
Then User clicks on search bar
And clicks on searchbar
And click on dropbar
And click on finddetails
And display that Product details

Examples:
|username|password|
|soumyamda1|soumya123|



