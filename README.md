# Owasp
This is a project for Web Application Automation Project
Selenium Code - Java (Cucumber) with Chrome driver setup

Description. : This is a demo testcase on java tech with cucumber and selenium test. There are couple testcases ( 2 automation scripts ): which validates the business scenarios: Scenario 1: Validate user is able to view after log in Scenario 2: Validate new user is able to view after clicking on new Registration This simple tests are to validate on the sample application: (https://owasp.org/www-project-juice-shop/)

Table of Contents
Introduction
Features
Requirements
Quick Start
Introduction
This is a demo testcase on java tech with cucumber and selenium test. This simple test is to validate the product page is appearing post login on the sample application: (https://owasp.org/www-project-juice-shop/)

Features
Selenium Tests

Test Requirements
Test Scenario 1:

Launch the application: (https://owasp.org/www-project-juice-shop/)
continue the flow till the user get registered
Verify the pop-up displayed

Test Scenario 2:
Launch the application: (https://owasp.org/www-project-juice-shop/)
login using email and password
Verify the pop-up displayed

Local
Java 11 SDK
Maven
ChromeDriver

Execution modes 
command: mvn test or from Test Runner 


 This Pipeline Does
Manual trigger via GitHub UI
Scheduled runs daily at 3 AM UTC
Java setup using Temurin JDK
Maven caching for faster builds
Runs tests and generates reports
Uploads the HTML report as an artifact
