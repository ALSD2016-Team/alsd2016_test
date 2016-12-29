Feature: Test certificate application

	Scenario: certificate front end
		Given Open browser and open certificate application
		When I enter the data into the form of certificate generator
		
		| Fields                 | Values              				|
		| certificationId        | SCRUM1603-33          			|
		| studentName            | 陳泰迪    	   						|
		| courceDate             | 於 2016 年 4 月 16、17、23 日                 		|
		| courceName             | Design Patterns 這樣學就會了：入門實作班      |
		| courceDuration         | 全期共十八小時研習期滿，特此證明                   		|
		| certificationDate      | 2016 年 4 月 23 日                					|


		Then I click generate button and get a correct certificate
		