$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("zadanie2.feature");
formatter.feature({
  "line": 1,
  "name": "Zadanie2",
  "description": "",
  "id": "zadanie2",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "dokonywanie zakupu w sklepie",
  "description": "",
  "id": "zadanie2;dokonywanie-zakupu-w-sklepie",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "jako zarejestrowany użytkownik loguję się na stronę sklepu",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "jestem na stronie z produktami",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "wybiorę Hummingbird Printed Sweater",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "wybiorę 5 sztuk w rozmiarze M",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "przejdę do opcji checkout",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "potwierdzę adres",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "wybiorę metodę płatności Pay by Check",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "kliknę na “order with an obligation pay”",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "zrobię screenshot z potwierdzeniem zamówienia",
  "keyword": "Then "
});
formatter.match({
  "location": "Zadanie2Steps.openWebSite()"
});
formatter.result({
  "duration": 3541336900,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie2Steps.returnToMainPage()"
});
formatter.result({
  "duration": 346485600,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie2Steps.chooseHummigbirdPrintedSweater()"
});
formatter.result({
  "duration": 302156000,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie2Steps.chooseMSize()"
});
formatter.result({
  "duration": 446091700,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie2Steps.proceedToCheckout()"
});
formatter.result({
  "duration": 1024745700,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie2Steps.confirmAddress()"
});
formatter.result({
  "duration": 462167000,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie2Steps.payByCheck()"
});
formatter.result({
  "duration": 516903400,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie2Steps.cklickOrderWithAnObligationToPay()"
});
formatter.result({
  "duration": 572094300,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie2Steps.takeScreenshot()"
});
formatter.result({
  "duration": 840753800,
  "status": "passed"
});
});