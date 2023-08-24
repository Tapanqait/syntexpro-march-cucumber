package com.syntexpro.cucumber.testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/syntexpro/cucumber/features/costcopharmacy.feature"},
        glue = {"com.syntexpro.cucumber.stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber.html"}
)
public class TestRunner {

}


















