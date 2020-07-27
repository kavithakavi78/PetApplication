$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginPage.feature");
formatter.feature({
  "line": 2,
  "name": "User Test the Login Functionality",
  "description": "",
  "id": "user-test-the-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User Login the Jpet Application",
  "description": "",
  "id": "user-test-the-login-functionality;user-login-the-jpet-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launch the Pet Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User registered the details and login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User Search and add the product to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User place the order",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_Pet_Application()"
});
formatter.result({
  "duration": 30951950370,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_registered_the_details_and_login()"
});
formatter.result({
  "duration": 24267550195,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Search_and_add_the_product_to_the_cart()"
});
formatter.result({
  "duration": 14418557557,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_place_the_order()"
});
formatter.result({
  "duration": 16232699094,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User purchasing the pet in Jpet Application",
  "description": "",
  "id": "user-test-the-login-functionality;user-purchasing-the-pet-in-jpet-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Customer launching the JPet Application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Customer registered the details and login the application",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Customer Search the pet and added to the Cart",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Customer place the order",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.customer_launching_the_JPet_Application()"
});
formatter.result({
  "duration": 10693162072,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.customer_registered_the_details_and_login_the_application()"
});
formatter.result({
  "duration": 11312466279,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.customer_Search_the_pet_and_added_to_the_Cart()"
});
formatter.result({
  "duration": 449635092,
  "error_message": "java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:97)\r\n\tat sun.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat org.resources.BaseClass.type(BaseClass.java:137)\r\n\tat org.stepdefinition.StepDefinition.customer_Search_the_pet_and_added_to_the_Cart(StepDefinition.java:141)\r\n\tat ✽.And Customer Search the pet and added to the Cart(LoginPage.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.customer_place_the_order()"
});
formatter.result({
  "status": "skipped"
});
});