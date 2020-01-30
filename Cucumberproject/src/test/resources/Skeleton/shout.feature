Feature:shout Feature

 @valid
Scenario: Persons are within the range
Given Sean is 10 meters away from Lucia
When Sean shouts "Free coffee"
Then Lucia hears the message "Free coffee"

@dry
Scenario:Persons are not in range
Given Sean is 100 meters away from Lucia
When Sean shouts "Free Coffee"
Then Lucia hears no messaage