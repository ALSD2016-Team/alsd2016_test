Feature: Test invoice preview

	Scenario: When_EnterTheCorrectDataInTriplicateUniform_Expect_GetAnCorrectInvicePreview
		Given Open browser and open the application of triplicate uniform invoice
		When I enter the CorrectData into the form of triplicate uniform invoice
		
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
		
		
	Scenario: When_EnterTheWrongComponyIdFormatInTriplicateUniform_Expect_ShowErrorMessage
		Given Open browser and open the application of triplicate uniform invoice
		When I enter the wrong format Data into componyId input
		| Fields                 | Values              |
		| componyId              | asdfasdf            |
		
		Then isCompanyIdError message show
		
		| displayShow            | inline              |
		
	Scenario: When_HasNotEnterComponyIdInTriplicateUniform_Expect_InvoicePreviewDontShow
		Given Open browser and open the application of triplicate uniform invoice
		When I Has not enter componyId into componyId input
		| Fields                 | Values              |
		| componyId              |                     |
		| companyName            |               	   |
		| taxRate                | 5                   |
		| itemName               | Education           |
		| itemNumber             | 1                   |
		| itemDollar             | 9527                |
		| date                   | 2016 年 12 月 10 日                        |
		
		Then Invoice Preview don't show and componyId,companyName input color to red
		
		| visibility            | hidden              |
		| componyIdColor        |        rgb(241, 67, 66)             |
		| companyNameColor      |        rgb(241, 67, 66)        	 |
		
	Scenario: When_HasNotEnterItemDollarInTriplicateUniform_Expect_InvoicePreviewDontShow
		Given Open browser and open the application of triplicate uniform invoice
		When I Has not enter ItemDollar into componyId input
		| Fields                 | Values              |
		| componyId              | 53909614                    |
		| companyName            | 泰迪軟體科技有限公司              	   |
		| taxRate                | 5                   |
		| itemName               | Education           |
		| itemNumber             | 1                   |
		| itemDollar             |                     |
		| date                   | 2016 年 12 月 10 日                        |
		
		Then Invoice Preview don't show and TUI_itemDollar,totalDollar,salesDollar input color to red
		
		| visibility            |        hidden                       |
		| TUI_itemDollarColor   |        rgb(241, 67, 66)             |
		| totalDollarColor      |        rgb(241, 67, 66)        	  |
		| salesDollarColor      |        rgb(241, 67, 66)        	  |
		
	
	Scenario: When_EnterTheCorrectInput_Expect_GetAnCorrectInvoice
		Given Open browser and open the application of duplicate uniform invoice
		When I enter the data into the form of duplicate uniform invoice and I click preview button

		| Fields                 | Values              |
		| companyName            | TeddySoft    	   |
		| itemName               | Education           |
		| itemNumber             | 2                   |
		| itemDollar             | 9527                |
		| date                   | 2016 年 12 月 10 日   |

		Then I will see the result of duplicate uniform invoice

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

	Scenario: When_EnterTheCorrectInputButCompanyNameIsEmpty_Expect_GetAnCorrectInvoiceButCompanyNameIsEmpty
		Given Open browser and open the application of duplicate uniform invoice
		When I enter the data into the form of duplicate uniform invoice but company name field is empty and I click preview button

		| Fields                 | Values              |
		| itemName               | Education           |
		| itemNumber             | 2                   |
		| itemDollar             | 9527                |
		| date                   | 2016 年 12 月 10 日  |

		Then I will see the result of duplicate uniform invoice and company name is empty

		| Fields                 | Values              		|
		| date             		 | 一 O 五 年 十一、十二 月 份  |
		| companyName            | 			           		|
		| year                   | 105                 		|
		| month                  | 12                  		|
		| day                    | 10                  		|
		| itemName               | Education          		|
		| itemNumber             | 2                  		|
		| itemDollar             | 9,527              		|
		| itemTotalDollar        | 19,054	          		|
		| totalDollar            | 19,054             		|
		| numberWord             | 壹玖零伍肆	          		|

	Scenario: When_EnterTheCorrectInputButItemDollarIsEmpty_Expect_ErrorNotificationOfItemDollarFieldAndTotalDollarField
		Given Open browser and open the application of duplicate uniform invoice
		When I enter the data into the form of duplicate uniform invoice but item dollar field is empty and I click preview button

		| Fields                 | Values              |
		| companyName            | TeddySoft    	   |
		| itemName               | Education           |
		| itemNumber             | 2                   |
		| date                   | 2016 年 12 月 10 日  |

		Then I will see error notification of item dollar field and total dollar field
		| Fields			|	Values				|
		| itemDollarColor	|	rgb(241, 67, 66)	|
		| totalDollarColor	|	rgb(241, 67, 66)	|

	Scenario: When_EnterTheCorrectInputButItemNameIsEmpty_Expect_ErrorNotificationOfItemNameField
		Given Open browser and open the application of duplicate uniform invoice
		When I enter the data into the form of duplicate uniform invoice but item name field is empty and I click preview button

		| Fields                 | Values              |
		| companyName            | TeddySoft    	   |
		| itemNumber             | 2                   |
		| itemDollar             | 9527                |
		| date                   | 2016 年 12 月 10 日  |

		Then I will see error notification of item name field
		| Fields			|	Values				|
		| itemNameColor		|	rgb(241, 67, 66)	|

	Scenario: When_EnterTheCorrectInputButItemNumberIsEmpty_Expect_ErrorNotificationOfItemNumberField
		Given Open browser and open the application of duplicate uniform invoice
		When I enter the data into the form of duplicate uniform invoice but item number field is empty and I click preview button

		| Fields                 | Values              |
		| companyName            | TeddySoft    	   |
		| itemName               | Education           |
		| itemDollar             | 9527                |
		| date                   | 2016 年 12 月 10 日  |

		Then I will see error notification of item number field and total dollar field
		| Fields				|	Values				|
		| itemNumberColor		|	rgb(241, 67, 66)	|
		| totalDollarColor		|	rgb(241, 67, 66)	|
		