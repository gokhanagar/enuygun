package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"pretty",
                    "html:target/reports/html/html_reports.html",
                    "json:target/reports/json/json-reports/cucumber.json",
                    "junit:target/reports/xml/xml-report/cucumber.xml",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
            },
            features = "src/test/resources/features",
            glue = "stepDefs",
            tags = "@Paralel",
            monochrome = true,
            publish = true
    )

    public class ParallelRunner {
    }

