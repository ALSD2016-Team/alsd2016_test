Feature: Test sendMail application

	Scenario: Preview email content 
		Given Enter sendMail application and select course  
		| Fields                 | Values        |
		| courseName             | SendMailTest  |
		When I click generate button
		Then I can preview the email content  
		| Fields                 | Values |
		| studnetName            | Orange |
		| mailContent            | Hi Orange,\n 您好，歡迎報名SendMailTest，以下是您的上課通知，請參考。\n若有任何問題，歡迎隨時聯絡我們。\n泰迪軟體 Erica |
		
	Scenario: Send email to student
		Given Enter sendMail application after check mail content was right
		| Fields                 | Values        |
		| courseName             | SendMailTest  |
		When I click send button and check to send 
		Then I will get successful message on alert
		| Fields                 | Values |
		| alertMsg               | 寄送email結束. |
		
	Scenario: Send email app Select no course 
		Given Enter sendMail application and do not select course name
		When I click generate button and send button   
		Then It will be disabled
		| Fields                 | Values |
		| disabled               | true   |
		
	Scenario: Send email app Select course but select no student  
		Given Enter sendMail application and select course name and uncheck student
		| Fields                 | Values        |
		| courseName             | SendMailTest  |
		When I click send mail button   
		Then It will tell me should choose student
		| Fields                 | Values |
		| alertMsg               | Please choose Recipient!! |