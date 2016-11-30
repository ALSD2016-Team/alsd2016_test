$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/certificate.feature");
formatter.feature({
  "line": 1,
  "name": "Certificate",
  "description": "",
  "id": "certificate",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Generate Certificates",
  "description": "",
  "id": "certificate;generate-certificates",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I prepare \"data\" for generate certificates",
  "keyword": "Given ",
  "doc_string": {
    "content_type": "",
    "line": 5,
    "value": "{\r\n\u0027courseName\u0027 : \u0027ALSD\u0027,\r\n\u0027courseDate\u0027 : \u00272016-01-01\u0027,\r\n\u0027certificareDate\u0027 : \u00272016-01-01\u0027,\r\n\u0027hours\u0027 : 40,\r\n\u0027students\u0027 : \r\n[\r\n{\r\n\u0027studentName\u0027 : \u0027student1\u0027,\r\n\u0027cateficateID\u0027 : \u0027#1\u0027\r\n},\r\n{\r\n\u0027studentName\u0027 : \u0027student2\u0027,\r\n\u0027cateficateID\u0027 : \u0027#2\u0027\r\n}\r\n]\r\n}"
  }
});
formatter.step({
  "line": 25,
  "name": "I send data to backend",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I get \"certificates\"",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 27,
    "value": "{\r\n\t\u0027certificates\u0027 : \r\n\t[\r\n\t\t{\r\n\t\t\t\u0027image\u0027 : \"base64Image1\"\r\n \t},\r\n \t{\r\n \t\t\u0027image\u0027 : \"base64Image2\"\r\n \t}\r\n\t\t\r\n\t]\r\n}"
  }
});
formatter.match({
  "arguments": [
    {
      "val": "data",
      "offset": 11
    }
  ],
  "location": "CertificateStep.PrepareData(String,String)"
});
formatter.result({
  "duration": 54406691,
  "status": "passed"
});
formatter.match({
  "location": "CertificateStep.SendData()"
});
formatter.result({
  "duration": 8754,
  "status": "passed"
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
  "duration": 144295,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Upload background",
  "description": "",
  "id": "certificate;upload-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "I prepare \"image\" for upload backgound",
  "keyword": "Given ",
  "doc_string": {
    "content_type": "",
    "line": 44,
    "value": "{\r\n\u0027image\u0027 : \u0027base64Image\u0027\r\n}"
  }
});
formatter.step({
  "line": 49,
  "name": "I send the image to backend",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "I receive \"response\"",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 51,
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
  "duration": 841651865,
  "status": "passed"
});
formatter.match({
  "location": "CertificateStep.SendImage()"
});
formatter.result({
  "duration": 17509,
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
  "duration": 82713,
  "status": "passed"
});
});