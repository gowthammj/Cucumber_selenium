package cucumberProject.Cucumber_Project;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/Features/luma.feature"},
		glue="definitions",
		dryRun=false,
		snippets = SnippetType.CAMELCASE,
		publish=true, //to generate console link report but for this need github account
		plugin= {"pretty","html:target/html_reports/samplereport.html"}
		
		
		)



public class Runner {

}

