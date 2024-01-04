package com.test.techtorialwork.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)// it means run cucumber classes
@CucumberOptions(// it as an annotations has some special keywords
        features = "src/test/resources/features" ,//this is the location of feature files but we provide folder
        glue="com/test/techtorialwork/stepdefinitions" , // this is the location of step definition classes but we provide folder stepdefinition
        dryRun = false ,// it is a way to get snipps without running fetaures. start with true when you rin change it to false
        tags = "@regression" ,// it is a way to filter your test cases base on your request @smoke or @regression
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt","json:target/cucumber-reports/cucumber.json"}


)


public class Runner {

}
