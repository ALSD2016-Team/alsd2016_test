Feature: courseManage

	Scenario: When_InputCorrectValue_Expect_CreateCourseSuccess
    Given Open course management application
    When I input correct value into form of create course
    | Fields                 | Values              	|
	| courseName             | Scrum敏捷方法實作班                     	|
	| courseCode             | SC0   	   		   	|
	| type                   | 公開班	               	|
	| ccAddress              | wayne265265@gmail.com|
	| Batch             	 | 1                    |
	| location               | 延平南路12號4樓                		|
	| Lecturer               | TeddyChen            |
	| Duration 				 | 10					|
	| ticketType 			 |　原價					|
	| status 				 | 準備中 					|
    Then I click AddCourse Button and get successful message
  