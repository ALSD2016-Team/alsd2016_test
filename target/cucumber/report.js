$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/invoice.feature");
formatter.feature({
  "line": 1,
  "name": "Test invoice preview",
  "description": "",
  "id": "test-invoice-preview",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Triplicate Uniform Invoice",
  "description": "",
  "id": "test-invoice-preview;triplicate-uniform-invoice",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open browser and open the application of triplicate uniform invoice",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter the data into the form of triplicate uniform invoice",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 7
    },
    {
      "cells": [
        "componyId",
        "53909614"
      ],
      "line": 8
    },
    {
      "cells": [
        "companyName",
        "泰迪軟體科技有限公司"
      ],
      "line": 9
    },
    {
      "cells": [
        "taxRate",
        "5"
      ],
      "line": 10
    },
    {
      "cells": [
        "itemName",
        "Education"
      ],
      "line": 11
    },
    {
      "cells": [
        "itemNumber",
        "1"
      ],
      "line": 12
    },
    {
      "cells": [
        "itemDollar",
        "9527"
      ],
      "line": 13
    },
    {
      "cells": [
        "date",
        "2016 年 12 月 10 日"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click preview button and see the result of triplicate uniform invoice",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 18
    },
    {
      "cells": [
        "date",
        "一 O 五 年 十一、十二 月 份"
      ],
      "line": 19
    },
    {
      "cells": [
        "companyName",
        "泰迪軟體科技有限公司"
      ],
      "line": 20
    },
    {
      "cells": [
        "companyId",
        "53909614"
      ],
      "line": 21
    },
    {
      "cells": [
        "year",
        "105"
      ],
      "line": 22
    },
    {
      "cells": [
        "month",
        "12"
      ],
      "line": 23
    },
    {
      "cells": [
        "day",
        "10"
      ],
      "line": 24
    },
    {
      "cells": [
        "itemName",
        "Education"
      ],
      "line": 25
    },
    {
      "cells": [
        "itemCount",
        "1"
      ],
      "line": 26
    },
    {
      "cells": [
        "itemDollar",
        "9,527"
      ],
      "line": 27
    },
    {
      "cells": [
        "itemTotalDollar",
        "9,527"
      ],
      "line": 28
    },
    {
      "cells": [
        "salesDollar",
        "9,527"
      ],
      "line": 29
    },
    {
      "cells": [
        "businessTax",
        "476"
      ],
      "line": 30
    },
    {
      "cells": [
        "totalDollar",
        "10003"
      ],
      "line": 31
    },
    {
      "cells": [
        "numberWord",
        "壹零零零參"
      ],
      "line": 32
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "InvoiceStep.StartTUIApplication()"
});
formatter.result({
  "duration": 3000446866,
  "status": "passed"
});
formatter.match({
  "location": "InvoiceStep.EnterDataToTUI(String,String\u003e)"
});
formatter.result({
  "duration": 4297435378,
  "status": "passed"
});
formatter.match({
  "location": "InvoiceStep.ClickTUIPreviewButton(String,String\u003e)"
});
formatter.result({
  "duration": 3058123217,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Duplicate Uniform Invoice",
  "description": "",
  "id": "test-invoice-preview;duplicate-uniform-invoice",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "Open browser and open the application of duplicate uniform invoice",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I enter the data into the form of duplicate uniform invoice",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 39
    },
    {
      "cells": [
        "companyName",
        "TeddySoft"
      ],
      "line": 40
    },
    {
      "cells": [
        "itemName",
        "Education"
      ],
      "line": 41
    },
    {
      "cells": [
        "itemNumber",
        "2"
      ],
      "line": 42
    },
    {
      "cells": [
        "itemDollar",
        "9527"
      ],
      "line": 43
    },
    {
      "cells": [
        "date",
        "2016 年 12 月 10 日"
      ],
      "line": 44
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "I click preview button and see the result of duplicate uniform invoice",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 48
    },
    {
      "cells": [
        "date",
        "一 O 五 年 十一、十二 月 份"
      ],
      "line": 49
    },
    {
      "cells": [
        "companyName",
        "TeddySoft"
      ],
      "line": 50
    },
    {
      "cells": [
        "year",
        "105"
      ],
      "line": 51
    },
    {
      "cells": [
        "month",
        "12"
      ],
      "line": 52
    },
    {
      "cells": [
        "day",
        "10"
      ],
      "line": 53
    },
    {
      "cells": [
        "itemName",
        "Education"
      ],
      "line": 54
    },
    {
      "cells": [
        "itemNumber",
        "2"
      ],
      "line": 55
    },
    {
      "cells": [
        "itemDollar",
        "9,527"
      ],
      "line": 56
    },
    {
      "cells": [
        "itemTotalDollar",
        "19,054"
      ],
      "line": 57
    },
    {
      "cells": [
        "totalDollar",
        "19,054"
      ],
      "line": 58
    },
    {
      "cells": [
        "numberWord",
        "壹玖零伍肆"
      ],
      "line": 59
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "InvoiceStep.StartDUIApplication()"
});
formatter.result({
  "duration": 2929118620,
  "status": "passed"
});
formatter.match({
  "location": "InvoiceStep.EnterDataToDUI(String,String\u003e)"
});
formatter.result({
  "duration": 2787717002,
  "status": "passed"
});
formatter.match({
  "location": "InvoiceStep.ClickDUIPreviewButton(String,String\u003e)"
});
formatter.result({
  "duration": 2685256963,
  "status": "passed"
});
});