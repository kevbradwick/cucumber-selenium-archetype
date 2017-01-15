Cucumber Selenium Archetype
---

Maven archetype to create a Cucumber project ready for browser test automation. The project will
be set up with

- Cucumber
- Junit
- Selenium Webdriver
- Parallel plugin


### Creating a new project

    mvn archetype:generate -DarchetypeGroupId=com.github.kevbradwick -DarchetypeArtifactId=cucumber-selenium-archetype -DarchetypeVersion=1.0.0
    
### Running tests

    mvn clean verify

