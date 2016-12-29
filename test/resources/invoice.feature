Feature: Test invoice preview

	Scenario: Triplicate Uniform Invoice
		Given Open browser and open the application of triplicate uniform invoice
		When I enter the data into the form of triplicate uniform invoice
		
		| Fields                 | Values              |
		| componyId              | 53909614            |
		| companyName            | 泰迪軟體科技有限公司    	   |
		| taxRate                | 5                   |
		| itemName               | Education           |
		| itemNumber             | 1                   |
		| itemDollar             | 9527                |
		| date                   | 2016 年 12 月 10 日                        |

		Then I click preview button and see the result of triplicate uniform invoice
		
		| Fields                 | Values              |
		| date             		 | 一 O 五 年 十一、十二 月 份             |
		| companyName            | 泰迪軟體科技有限公司                         |
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
		| numberWord             | 壹零零零參	           |
		
	
	Scenario: Duplicate Uniform Invoice
		Given Open browser and open the application of duplicate uniform invoice
		When I enter the data into the form of duplicate uniform invoice
		
		| Fields                 | Values              |
		| companyName            | TeddySoft    	   |
		| itemName               | Education           |
		| itemNumber             | 2                   |
		| itemDollar             | 9527                |
		| date                   | 2016 年 12 月 10 日                        |

		Then I click preview button and see the result of duplicate uniform invoice
		
		| Fields                 | Values              |
		| date             		 | 一 O 五 年 十一、十二 月 份             |
		| companyName            | TeddySoft           |
		| year                   | 105                 |
		| month                  | 12                  |
		| day                    | 10                  |
		| itemName               | Education           |
		| itemNumber             | 2                   |
		| itemDollar             | 9,527               |
		| itemTotalDollar        | 19,054	           |
		| totalDollar            | 19,054              |
		| numberWord             | 壹玖零伍肆	           |

		
	Scenario: Enter Wrong componyId format
		Given Open browser and open the application of Enter Wrong componyId format
		When I enter the wrong format Data into componyId input
		| Fields                 | Values              |
		| componyId              | asdfasdf            |
		
		Then isCompanyIdError message show
		
		| displayShow            | inline              |
		
		