Feature: Test invoice preview

	Scenario: Triplicate Uniform Invoice
		Given Open browser and start application
		When I enter the data into the invoice form
		
		| Fields                 | Values              |
		| courseName             | 'ALSD'              |
		| courseDate             | '2016-01-01'        |
		| certificareDate        | '2016-01-01'        |
		| hours                  | 40                  |

		Then I click preview button and see the result
		
