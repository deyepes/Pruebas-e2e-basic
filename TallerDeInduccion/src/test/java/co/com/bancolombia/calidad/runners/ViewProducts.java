package co.com.bancolombia.calidad.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/view_products.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "co.com.bancolombia.calidad.stepdefinitions")
public class ViewProducts {
}
