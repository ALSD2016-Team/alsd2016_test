Feature: Test invoice preview

	Scenario: Triplicate Uniform Invoice
		Given Open browser and open the application of triplicate uniform invoice
		When I enter the data into the form of triplicate uniform invoice
		
		| Fields                 | Values              |
		| componyId              | 53909614            |
		| companyName            | ���}�n���ަ������q    	   |
		| taxRate                | 5                   |
		| itemName               | Education           |
		| itemNumber             | 1                   |
		| itemDollar             | 9527                |
		| date                   | 2016 �~ 12 �� 10 ��                       |

		Then I click preview button and see the result of triplicate uniform invoice
		
		| Fields                 | Values              |
		| date             		 | �@ O �� �~ �Q�@�B�Q�G �� ��             |
		| companyName            | ���}�n���ަ������q                         |
		| companyId              | 53909614            |
		| year                   | 105                 |
		| month                  | 12                  |
		| day                    | 10                  |
		| itemName               | Education           |
		| itemCount              | 1                   |
		| itemDollar             | 9,527               |
		| itemTotalDollar        | 9,527               |
		| salesDollar            | 9,527               |
		| businessTax            | 476                 |
		| totalDollar            | 10003               |
		| numberWord             | ���s�s�s��	           |
		
	
	Scenario: Duplicate Uniform Invoice
		Given Open browser and open the application of duplicate uniform invoice
		When I enter the data into the form of duplicate uniform invoice
		
		| Fields                 | Values              |
		| companyName            | TeddySoft    	   |
		| itemName               | Education           |
		| itemNumber             | 2                   |
		| itemDollar             | 9527                |
		| date                   | 2016 �~ 12 �� 10 ��                       |

		Then I click preview button and see the result of duplicate uniform invoice
		
		| Fields                 | Values              |
		| date             		 | �@ O �� �~ �Q�@�B�Q�G �� ��             |
		| companyName            | TeddySoft           |
		| year                   | 105                 |
		| month                  | 12                  |
		| day                    | 10                  |
		| itemName               | Education           |
		| itemNumber             | 2                   |
		| itemDollar             | 9,527               |
		| itemTotalDollar        | 19,054	           |
		| totalDollar            | 19,054              |
		| numberWord             | ���h�s��v	           |
