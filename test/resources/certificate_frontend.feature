Feature: Test Certificate Application

	Scenario: When_EnterTheCorrectValue_Expect_GetAnCorrectCertificate
		Given Open browser and open certificate application
		When I enter the correct value into the form
		
		| Fields                 | Values              				|
		| certificationId        | SCRUM1603-33          			|
		| studentName            | 陳泰迪    	   						|
		| courceDate             | 於 2016 年 4 月 16、17、23 日                 		|
		| courceName             | Design Patterns 這樣學就會了：入門實作班      |
		| courceDuration         | 全期共十八小時研習期滿，特此證明                   		|
		| certificationDate      | 2016 年 4 月 23 日                					|
		Then I click enabled generate button and get a correct certificate
		
	Scenario: When_EnterEmptyCertificateId_Expect_GenerateButtonIsDisabled
		Given Open browser and open certificate application
		When I enter the value with empty certificateId into the form
		
		| Fields                 | Values              				|
		| certificationId        |                              	|
		| studentName            | 陳泰迪    	   						|
		| courceDate             | 於 2016 年 4 月 16、17、23 日                 		|
		| courceName             | Design Patterns 這樣學就會了：入門實作班      |
		| courceDuration         | 全期共十八小時研習期滿，特此證明                   		|
		| certificationDate      | 2016 年 4 月 23 日                					|
		Then I can not click disabled generate button
	
	Scenario: When_EnterEmptyStudentName_Expect_GenerateButtonIsDisabled
		Given Open browser and open certificate application
		When I enter the value with empty student name into the form
		
		| Fields                 | Values              				|
		| certificationId        | SCRUM1603-33            			|
		| studentName            |      	   						|
		| courceDate             | 於 2016 年 4 月 16、17、23 日                 		|
		| courceName             | Design Patterns 這樣學就會了：入門實作班      |
		| courceDuration         | 全期共十八小時研習期滿，特此證明                   		|
		| certificationDate      | 2016 年 4 月 23 日                					|
		Then I can not click disabled generate button
		
	Scenario: When_EnterEmptyCourseDate_Expect_GenerateButtonIsDisabled
		Given Open browser and open certificate application
		When I enter the value with empty course date into the form
		
		| Fields                 | Values              				|
		| certificationId        | SCRUM1603-33            			|
		| studentName            | 陳泰迪     	   						|
		| courceDate             |                          		|
		| courceName             | Design Patterns 這樣學就會了：入門實作班      |
		| courceDuration         | 全期共十八小時研習期滿，特此證明                   		|
		| certificationDate      | 2016 年 4 月 23 日                					|
		Then I can not click disabled generate button
	
	Scenario: When_EnterEmptyCourseName_Expect_GenerateButtonIsDisabled
		Given Open browser and open certificate application
		When I enter the value with empty course name into the form
		
		| Fields                 | Values              				|
		| certificationId        | SCRUM1603-33            			|
		| studentName            | 陳泰迪     	   						|
		| courceDate             | 於 2016 年 4 月 16、17、23 日                  		|
		| courceName             | 							        |
		| courceDuration         | 全期共十八小時研習期滿，特此證明                   		|
		| certificationDate      | 2016 年 4 月 23 日                					|
		Then I can not click disabled generate button
	
	Scenario: When_EnterEmptyCourseDuration_Expect_GenerateButtonIsDisabled
		Given Open browser and open certificate application
		When I enter the value with empty course duration into the form
		
		| Fields                 | Values              				|
		| certificationId        | SCRUM1603-33            			|
		| studentName            | 陳泰迪     	   						|
		| courceDate             | 於 2016 年 4 月 16、17、23 日                  		|
		| courceName             | Design Patterns 這樣學就會了：入門實作班      |
		| courceDuration         |                          		|
		| certificationDate      | 2016 年 4 月 23 日                					|
		Then I can not click disabled generate button
		
	Scenario: When_EnterEmptyCertificationDate_Expect_GenerateButtonIsDisabled
		Given Open browser and open certificate application
		When I enter the value with empty certification date into the form
		
		| Fields                 | Values              				|
		| certificationId        | SCRUM1603-33            			|
		| studentName            | 陳泰迪     	   						|
		| courceDate             | 於 2016 年 4 月 16、17、23 日                  		|
		| courceName             | Design Patterns 這樣學就會了：入門實作班      |
		| courceDuration         | 全期共十八小時研習期滿，特此證明                   		|
		| certificationDate      |                 					|
		Then I can not click disabled generate button
		