package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="features",
glue="stepdefenition",
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber_reports/report.html"})
public class testrunner {

}