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
  "name": "Open browser and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter the data into the invoice form",
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
        "���}�n���ަ������q"
      ],
      "line": 9
    },
    {
      "cells": [
        "taxRate",
        "6"
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
        "2016 �~ 12 �� 10 ��"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click preview button and see the result",
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
        "�@ O �� �~ �Q�@�B�Q�G �� ��"
      ],
      "line": 19
    },
    {
      "cells": [
        "companyName",
        "���}�n���ަ������q"
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
        "���s�s�s��"
      ],
      "line": 32
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "InvoiceStep.StartApplication()"
});
formatter.result({
  "duration": 2901207068,
  "status": "passed"
});
formatter.match({
  "location": "InvoiceStep.EnterData(String,String\u003e)"
});
formatter.result({
  "duration": 4077799807,
  "status": "passed"
});
formatter.match({
  "location": "InvoiceStep.ClickPreviewButton(String,String\u003e)"
});
formatter.result({
  "duration": 4319613627,
  "status": "passed"
});
});