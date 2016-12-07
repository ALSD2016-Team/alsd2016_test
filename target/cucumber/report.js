$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/certificate.feature");
formatter.feature({
  "line": 1,
  "name": "Certificate",
  "description": "",
  "id": "certificate",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Generate Certificates",
  "description": "",
  "id": "certificate;generate-certificates",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I prepare courseInfo and \"studentsInfo\" for generate certificates",
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
        "courseName",
        "\u0027ALSD\u0027"
      ],
      "line": 8
    },
    {
      "cells": [
        "courseDate",
        "\u00272016-01-01\u0027"
      ],
      "line": 9
    },
    {
      "cells": [
        "certificareDate",
        "\u00272016-01-01\u0027"
      ],
      "line": 10
    },
    {
      "cells": [
        "hours",
        "40"
      ],
      "line": 11
    }
  ],
  "keyword": "Given ",
  "doc_string": {
    "content_type": "",
    "line": 14,
    "value": "{\r\n\u0027courseName\u0027 : \u0027ALSD\u0027,\r\n\u0027courseDate\u0027 : \u00272016-01-01\u0027,\r\n\u0027certificareDate\u0027 : \u00272016-01-01\u0027,\r\n\u0027hours\u0027 : 40,\r\n\u0027students\u0027 : \r\n[\r\n{\r\n\u0027studentName\u0027 : \u0027student1\u0027,\r\n\u0027cateficateID\u0027 : \u0027#1\u0027\r\n},\r\n{\r\n\u0027studentName\u0027 : \u0027student2\u0027,\r\n\u0027cateficateID\u0027 : \u0027#2\u0027\r\n}\r\n]\r\n}"
  }
});
formatter.step({
  "line": 34,
  "name": "I send data to backend",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "I get \"certificates\"",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 36,
    "value": "{\r\n\t\u0027certificates\u0027 : \r\n\t[\r\n\t\t{\r\n\t\t\t\u0027image\u0027 : \"base64Image1\"\r\n \t},\r\n \t{\r\n \t\t\u0027image\u0027 : \"base64Image2\"\r\n \t}\r\n\t\t\r\n\t]\r\n}"
  }
});
formatter.match({
  "arguments": [
    {
      "val": "studentsInfo",
      "offset": 26
    }
  ],
  "location": "CertificateStep.PrepareData(String,DataTable)"
});
formatter.result({
  "duration": 72814948,
  "error_message": "java.lang.NullPointerException\r\n\tat ALSD.CucumberTest.CertificateStep.PrepareData(CertificateStep.java:49)\r\n\tat ✽.Given I prepare courseInfo and \"studentsInfo\" for generate certificates(resources/certificate.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CertificateStep.SendData()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "certificates",
      "offset": 7
    }
  ],
  "location": "CertificateStep.GetCertificates(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 51,
  "name": "Upload background",
  "description": "",
  "id": "certificate;upload-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 52,
  "name": "I prepare \"image\" for upload backgound",
  "keyword": "Given ",
  "doc_string": {
    "content_type": "",
    "line": 53,
    "value": "{\r\n\u0027image\u0027 : \u0027base64Image\u0027\r\n}"
  }
});
formatter.step({
  "line": 58,
  "name": "I send the image to backend",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "I receive \"response\"",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 60,
    "value": "{\r\n\u0027status\u0027 : \u0027200\u0027\r\n}"
  }
});
formatter.match({
  "arguments": [
    {
      "val": "image",
      "offset": 11
    }
  ],
  "location": "CertificateStep.PrepareImage(String,String)"
});
formatter.result({
  "duration": 861588508,
  "status": "passed"
});
formatter.match({
  "location": "CertificateStep.SendImage()"
});
formatter.result({
  "duration": 14188,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "response",
      "offset": 11
    }
  ],
  "location": "CertificateStep.ReceiveResponse(String,String)"
});
formatter.result({
  "duration": 1441447,
  "status": "passed"
});
});