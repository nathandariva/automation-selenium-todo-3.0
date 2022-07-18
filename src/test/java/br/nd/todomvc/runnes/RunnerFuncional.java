package br.nd.todomvc.runnes;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/AddNaLista.feature",
		glue = "br.nd.todomvc.steps" ,
		//tags = "@funcionais",
		plugin = {"pretty", "html:target/report.html", },
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		stepNotifications = false)
public class RunnerFuncional {

}
