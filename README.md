****Selenium Cucumber Page Object Model (POM) with Factory Design Pattern, Allure Reports, TestNG, REST Assured, Jackson Databind API, Maven, WebDriverManager****

**Overview**
This project demonstrates a robust test automation framework leveraging Selenium WebDriver with a collaboration tool Cucumber, Page Object Model (POM) design pattern, 
integrated with Allure Reports for comprehensive test reporting. 

It also incorporates TestNG for test execution and management, REST Assured for API testing, Jackson Databind API for JSON manipulation, Maven for build management, 
WebDriverManager for easy WebDriver setup and various other utilities for efficient test automation in Java. 
It supports the parallel test execution as well in addition to above features.

**Features**
Page Object Model (POM): Maintainable and scalable test automation architecture.
Factory Design Pattern: Centralized creation of Chromedriver and firefoxdriver instances by maintaining the Single Responsibility principle.
BDD Cucumber: Collaboration tool that supports Behavioral driven development.
Feature: Scenario, features present in gherkin syntax in the form of Given, When, Then, And, But, Scneario outline, Example, Scenario, Rule, BackGround.
Step Definitions: This connects the gherkin steps to the programming code.
Cucumber PicoContainer: Dependency injection container in cucumber is PicoContainer used for sharing the state of objects amongs steps in the scenario.
TESTNGRunner: Drive the execution of the test cases and uses DataProvider to run the scenarios in parallel.
CSVWriter: To create and write the execution data to the csv file.
Allure Reports: Detailed and interactive HTML reports with screenshots.
TestNG: Flexible test execution, grouping, parameterization capabilities and parallel execution using testng.xml file.
Jackson Databind API: JSON (de)serialization for handling API responses.
Maven: Dependency management and build automation.
WebDriverManager: Automated chromedriver or firefoxdriver setup and management accordingly to our systems browser version
Allure TestNG: Integration for enhanced reporting capabilities.
Singleton Design Pattern - To load or intialize the properties file only during the entire execution.
OOPs Concept - Inheritance, Interface, Encapsulation, Polymorphism.

**Requirements**
Java Development Kit (JDK) 8 or higher
Maven
Selenium WebDriver
Allure CLI (optional for generating and viewing Allure reports)


**Setup Instructions**
1. Clone the repository:
        git clone "https://github.com/zhunzargulhane/Veeva_SeleniumBDDCucumber.git"

2. Install dependencies:
        Install all the dependencies present in the POM.xml file.
   Majorly we are using => Selenium, JacksonDatabind, Cucumber Java, Cucumber TestNG, allure-report,lombok, apache log4j,opencsv, cucumber-picocontainer, webdriverManager.
   
4. Run tests using Maven:
    mvn clean test -Denv="CP/DP1/DP2"
    mvn clean test -Denv="CP/DP1/DP2"

5. Generate Allure reports:
        allure serve target/allure-reports


**Project Structure**
.
├── Drivers
├── src
│   ├── test
│   │   ├── java
│   │   │   └── com.selenium.pom
│   │   │           ├── base            # BasePage to handle the prerequisites for page object classes.
│   │   │           └── pages           # Reusable page components
|   |   │              ├── components   # Applied composition concept to store the reusable page object definitions and their methods.         
│   │   |           ├── context         # context package to share the state of driver object in different steps of same scenario supported for within same or different StepDefinitions class
│   │   |              ├── TestContext  # Test Context class which creates the context object only once for each scenario and the object is shared amongst the steps.
│   │   |           ├── utils           # Utility classes eg: JacksonUtil for deserialization,ConfigLoader,PropertyUtils,CSVWriterUtils.
│   │   |           ├── hooks           # This is to driver the browser initialization, to quite before and after the execution
│   │   │           ├── runners         # TestNG runner class file where glue code location and feature file location is present.
│   │   │           ├── stepDefinitions # These classes to represent the glue code for each feature statement.
│   │   │           ├── objects         # POJO classes for Slide title and its duration
│   │   │           ├── factory         # Implementation of factory design pattern using Interface, Factory method, implementing classes
│   │   │           ├── constants       # Enum constants for DriverName, Endpoints, EnvType
│   │   └── resources
│   │       ├── testng.xml               # TestNG suite configuration
│   │       └── allure-results           # Allure report directory (auto-generated)
│   │       └── allure.properties        # Holds the location of results directory and patterns for links
│   │       └── config_cp.properties     # Holds the baseURL of CP product 
│   │       └── config_dp1.properties    # Holds the baseURL of DP1 product 
│   │       └── config_dp2.properties    # Holds the baseURL of DP2 product 
│   │       └── DataFiles                # Generated during test execution
├── testng.xml                           # XML file which drives the cross browser execution in parallel mode
├── pom.xml                             # Maven build configuration
└── README.md                           # This file


**Generating Allure Reports**
Reports are generated in target/allure-results and can be viewed using Allure CLI.

This README.md provides comprehensive information about setting up, usage of test automation framework.
