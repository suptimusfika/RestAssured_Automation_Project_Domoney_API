# RestAssured_Automation_Project_Domoney_API
I have created a Rest Assured Automation project for automating Dmoney API and asserting successfull activities.

## Scenario
Do following steps using the API's from this collection:
https://api.postman.com/collections/1844288-143eb923-423f-4c91-a198-fe6e56d20e35?access_key=PMAT-01GJ3CC22Q0066PJWP3T0XHQ8G

1. Do Login by admin
2. Create 2 new customers and a agent
3. Give 2000 tk from System account to the newly created agent
4. Deposit 1500 tk to a customer from the agent account
5. Withdraw 500 tk by the customer to the agent
6. Send money 500 tk to another customer
7. Payment 100 tk to a merchant (01686606905) by the recipient customer
8. Check balance of the recipient customer

## How to run this project
- clone this project
- open this project in intellij idea.
- hit this command in terminal ```gradle clean test```
- To generate allure report hit these command in terminal  
  ```allure generate allure-results --clean -output```  
  ```allure serve allure-results```

## Tools Used
- Intellij
- Jdk-11
- Allure
  
## Framework used:
- Rest Assured
- TestNG

## Video Recording of automation output:
https://github.com/suptimusfika/RestAssured_Automation_Project_Domoney_API/assets/48064134/cf25960c-17e3-4151-9a61-251c833e36ec

## Allure Report Image: 
![1](https://github.com/suptimusfika/RestAssured_Automation_Project_Domoney_API/assets/48064134/abaa5e79-7cf1-4e30-8034-383c8b08194d)

![2](https://github.com/suptimusfika/RestAssured_Automation_Project_Domoney_API/assets/48064134/1f7c4ae0-bcc5-41a8-ba94-664fa5a9e98e)
