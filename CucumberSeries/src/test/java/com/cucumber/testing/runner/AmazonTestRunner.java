package com.cucumber.testing.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\jagad\\eclipse-workspace\\CucumberSeries\\src\\test\\java\\com\\cucumber\\testing\\search.feature"},
		glue = {"com.cucumber.testing.steps"},
	plugin = {"pretty"}
		
		)
public class AmazonTestRunner {

}
