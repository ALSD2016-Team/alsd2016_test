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
		| Fields                 | Values              				|
		| imageName              | CorrectImage.png          		|
		
	Scenario: When_EnterEmptyCertificateId_Expect_GetCertificateWithoutCertificateId
		Given Open browser and open certificate application
		When I enter the value with empty certificateId into the form
		| Fields                 | Values              				|
		| certificationId        |                              	|
		| studentName            | 陳泰迪    	   						|
		| courceDate             | 於 2016 年 4 月 16、17、23 日                 		|
		| courceName             | Design Patterns 這樣學就會了：入門實作班      |
		| courceDuration         | 全期共十八小時研習期滿，特此證明                   		|
		| certificationDate      | 2016 年 4 月 23 日                					|
		
		Then I click enabled generate button and get a correct certificate
		| Fields                 | Values              				|
		| imageName              | NoCertificateIdImage.png         |
	
	Scenario: When_EnterEmptyStudentName_Expect_GetCertificateWithoutStudentName
		Given Open browser and open certificate application
		When I enter the value with empty student name into the form
		| Fields                 | Values              				|
		| certificationId        | SCRUM1603-33            			|
		| studentName            |      	   						|
		| courceDate             | 於 2016 年 4 月 16、17、23 日                 		|
		| courceName             | Design Patterns 這樣學就會了：入門實作班      |
		| courceDuration         | 全期共十八小時研習期滿，特此證明                   		|
		| certificationDate      | 2016 年 4 月 23 日                					|
		
		Then I click enabled generate button and get a correct certificate
		| Fields                 | Values              				|
		| imageName              | NoStudentNameImage.png          	|
		
	Scenario: When_EnterEmptyCourseDate_Expect_GetCertificateWithoutCourseDate
		Given Open browser and open certificate application
		When I enter the value with empty course date into the form
		| Fields                 | Values              				|
		| certificationId        | SCRUM1603-33            			|
		| studentName            | 陳泰迪     	   						|
		| courceDate             |                          		|
		| courceName             | Design Patterns 這樣學就會了：入門實作班      |
		| courceDuration         | 全期共十八小時研習期滿，特此證明                   		|
		| certificationDate      | 2016 年 4 月 23 日                					|
		
		Then I click enabled generate button and get a correct certificate
		| Fields                 | Values              				|
		| imageName              | NoCourseDateImage.png          	|
	
	Scenario: When_EnterEmptyCourseName_Expect_GetCertificateWithoutCourseName
		Given Open browser and open certificate application
		When I enter the value with empty course name into the form
		| Fields                 | Values              				|
		| certificationId        | SCRUM1603-33            			|
		| studentName            | 陳泰迪     	   						|
		| courceDate             | 於 2016 年 4 月 16、17、23 日                  		|
		| courceName             | 							        |
		| courceDuration         | 全期共十八小時研習期滿，特此證明                   		|
		| certificationDate      | 2016 年 4 月 23 日                					|
		
		Then I click enabled generate button and get a correct certificate
		| Fields                 | Values              				|
		| imageName              | NoCourseNameImage.png          	|
	
	Scenario: When_EnterEmptyCourseDuration_Expect_GetCertificateWithoutCourseDuration
		Given Open browser and open certificate application
		When I enter the value with empty course duration into the form
		| Fields                 | Values              				|
		| certificationId        | SCRUM1603-33            			|
		| studentName            | 陳泰迪     	   						|
		| courceDate             | 於 2016 年 4 月 16、17、23 日                  		|
		| courceName             | Design Patterns 這樣學就會了：入門實作班      |
		| courceDuration         |                          		|
		| certificationDate      | 2016 年 4 月 23 日                					|
		
		Then I click enabled generate button and get a correct certificate
		| Fields                 | Values              				|
		| imageName              | NoCourseDurationImage.png        |
		
	Scenario: When_EnterEmptyCertificationDate_Expect_GetCertificateWithoutCertificationDate
		Given Open browser and open certificate application
		When I enter the value with empty certification date into the form	
		| Fields                 | Values              				|
		| certificationId        | SCRUM1603-33            			|
		| studentName            | 陳泰迪     	   						|
		| courceDate             | 於 2016 年 4 月 16、17、23 日                  		|
		| courceName             | Design Patterns 這樣學就會了：入門實作班      |
		| courceDuration         | 全期共十八小時研習期滿，特此證明                   		|
		| certificationDate      |                 					|
		
		Then I click enabled generate button and get a correct certificate
		| Fields                 | Values              				|
		| imageName              | NoCertificationDateImage.png     |
		
	Scenario: When_EnterEmptyValue_Expect_GetAnEmptyCertificate
		Given Open browser and open certificate application
		When I enter empty value into the form
		| Fields                 | Values              				|
		| certificationId        | 				           			|
		| studentName            |      	   						|
		| courceDate             | 			                		|
		| courceName             | 						 		    |
		| courceDuration         | 			                  		|
		| certificationDate      |                 					|
		
		Then I click enabled generate button and get a correct certificate
		| Fields                 | Values              				|
		| imageName              | EmptyImage.png    			    |
	
	Scenario: When_ClickDownloadButtonBeforeClickGenerateButton_Expect_ImageWillNotDownload
		Given Open browser and open certificate application
		When I click download button
		Then The Image will not start to download
		| Fields                 | Values              				|
		| imagePath              | C:\\Download\\Download.png       |
	
	Scenario: When_ClickDownloadPDFButtonBeforeClickGenerateButton_Expect_PDFFileWillNotDownload
		Given Open browser and open certificate application
		When I click PDF download button
		Then The PDF file will not start to download
		| Fields                 | Values              					|
		| filePath               | C:\\Download\\SCRUM1603-33 陳泰迪.pdf   |

	Scenario: When_ClickDownloadButtonAfterClickGenerateButton_Expect_ImageWillDownload
		Given Open browser and open certificate application
		And I click Generate Button
		When I click download button
		Then The image will start to download
		| Fields                 | Values              					|
		| filePath               | C:\\Download\\Download.png   		|
	
	Scenario: When_ClickDownloadPDFButtonAfterClickGenerateButton_Expect_PDFFileWillDownload
		Given Open browser and open certificate application
		And I click Generate Button
		When I click PDF download button
		Then The PDF file will start to download
		| Fields                 | Values              					|
		| filePath               | C:\\Download\\SCRUM1603-33 陳泰迪.pdf   |

	