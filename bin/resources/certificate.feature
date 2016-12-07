Feature: Certificate
  

  Scenario: Generate Certificates
    Given I prepare courseInfo and studentsInfo for generate certificates
    
    | Fields                 | Values              |
	| courseName             | 'ALSD'              |
	| courseDate             | '2016-01-01'        |
	| certificareDate        | '2016-01-01'        |
	| hours                  | 40                  |
	| studentsInfo			 |"[{'studentName' : 'student1','cateficateID' : '#1'},{'studentName' : 'student2','cateficateID' : '#2'}]"|
	
    
    When I send data to backend
    Then I get "certificates"
    """
    {
    	'certificates' : 
    	[
    		{
    			'image' : "base64Image1"
	    	},
	    	{
	    		'image' : "base64Image2"
	    	}
    		
    	]
    }
    """
    
  Scenario: Upload background
    Given I prepare "image" for upload backgound
    """
    {
		'image' : 'base64Image'
	}
    """
    When I send the image to backend
    Then I receive "response"
    """
    {
		'status' : '200'
	}
    """