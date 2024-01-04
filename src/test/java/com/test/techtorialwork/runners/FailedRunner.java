package com.test.techtorialwork.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/uiFailedTests.txt" ,//this is the location of failed feature we have to put @ before it
        glue="com/test/techtorialwork/stepdefinitions" , // this is the location of step definition classes but we provide folder stepdefinition
        tags = "@regression" ,// it is a way to filter your test cases base on your request @smoke or @regression
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}


)
public class FailedRunner {
}
