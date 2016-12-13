Feature: Test invoice preview

	Scenario: Triplicate Uniform Invoice
		Given Open browser and start application
		When I enter the data into the invoice form
		
		| Fields                 | Values              |
		| componyId              | 53909614            |
		| companyName            | ���}�n���ަ������q    	   |
		| taxRate                | 6                   |
		| itemName               | Education           |
		| itemNumber             | 1                   |
		| itemDollar             | 9527                |
		| date                   | 2016 �~ 12 �� 10 ��                       |

		Then I click preview button and see the result
		
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
