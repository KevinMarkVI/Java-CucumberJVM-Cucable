package com.yourcompany.parallel;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    monochrome = false,
    glue = {"com.yourcompany"},
    features = {"classpath:parallel/features/CommentText_scenario002_run001_IT.feature"},
    format = {"json:target/cucumber-report/CommentText_scenario002_run001_IT.json"}
)
public class CommentText_scenario002_run001_IT {
}
// Generated by Cucable

