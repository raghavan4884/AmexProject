package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue="com.test.stepdefinitions",monochrome=true,plugin={"pretty","html:target/report.html","rerun:traget/rerun.txt"})

public class TestRunner {



}
