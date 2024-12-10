# Web UI Automation: Google Search for Cars in London
This project automates the process of performing a Google search for "Cars in London," identifying Gumtree links on the first page of results, and validating these links.

## Setup Instructions

### Cloning the Repository
```bash
git clone https://github.com/nehadhobale/searchCarsInLondon.git
cd searchCarsInLondon
```

### Updating ChromeDriver Path
Ensure the ChromeDriver version with chrome version. 
- Chrome Driver version:- 131.0.6778.108
- Chrome version :- Version 131.0.6778.109 (Official Build) (64-bit)



## How to Run Tests

 1. Using TestNG XML File:- Right click on TestNG.xml file and then click on run.
 2. Running Specific Test Class :- Execute individual test classes.
 3. Command Line :- To execute tests directly via Maven, run:
    ````
    mvn test
    ```` 
    
## Approach to Automation Pipeline
This project adopts a modular and scalable approach for Web Testing.

1. Folder Structure:- Clear separation between test cases and page objects.
2. Execution Options:- Tests can be executed through TestNG XML, Java classes, or Maven.
3. Validation:- Validates web functionality using assertions.
4. CI/CD Integration:- Can be included in any run via maven
5. Test Execution :- Regression Tests

## Future Enhancements
1. Parallel Execution:- Leverage TestNG's parallel execution features for faster testing.
2. Cross-Browser Testing:- Add support for browsers like Firefox and Edge.
3. Report Generation

## Reporting
 TestNG generates reports in the target/surefire-reports directory after execution.

## References
1. [Selenium WebDriver Documentation](https://www.selenium.dev/documentation/)
2. [TestNG Documentation](https://testng.org/doc/)
3. [Maven Surefire Plugin Documentation](https://maven.apache.org/surefire/maven-surefire-plugin/)
4. [Page Object Model Design Pattern](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/)
5. [Chrome Driver Version Reference](https://googlechromelabs.github.io/chrome-for-testing/)
