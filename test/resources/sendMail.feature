Feature: Test sendMail application

	Scenario: When_ClickGenerateBtn_Expect_CorrectMailContent 
		Given Enter sendMail application and select course  
		| Fields                 | Values        |
		| courseName             | SendMailTest  |
		When I click generate button
		Then I can preview the email content  
		| Fields                 | Values |
		| studnetName            | Orange |
		| mailContent            | Hi Orange,\n 您好，歡迎報名SendMailTest，以下是您的上課通知，請參考。\n若有任何問題，歡迎隨時聯絡我們。\n泰迪軟體 Erica |
		
	Scenario: When_ClickSendBtn_Expect_SuccessfulAlert
		Given Enter sendMail application and check mail content was right
		| Fields                 | Values        |
		| courseName             | SendMailTest  |
		When I click send button and check to send 
		Then I will get successful message on alert
		| Fields                 | Values      |
		| alertMsg               | 寄送email結束. |
		
Scenario: When_ClickSendBtn_Expect_GetEmail  
		Given Enter sendMail application and check mail content was right
		| Fields                 | Values        |
		| courseName             | SendMailTest  |
		When I click send button and check to send    
		Then I can get a mail from teddysoft
		| Fields | Values                      |
		| subject| SendMailTest - 已收到您的報名資料 |
		| from   | news.teddysoft.tw@gmail.com |
		
	Scenario: When_NotSelectCourse_Expect_SuccessfulAlert 
		Given Enter sendMail application and do not select course name
		When I click generate button and send button   
		Then It will be disabled
		| Fields                 | Values |
		| disabled               | true   |
		
	Scenario: When_NotSelectStudent_Expect_NeedChooseStudentAlert  
		Given Enter sendMail application and select course name and uncheck student
		| Fields                 | Values        |
		| courseName             | SendMailTest  |
		When I click send mail button   
		Then It will tell me should choose student
		| Fields                 | Values |
		| alertMsg               | Please choose Recipient!! |
		
