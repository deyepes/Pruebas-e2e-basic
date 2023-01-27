package co.com.bancolombia.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;

public class ValidateLoginErrorMessage implements Question<String> {

    public static Question<String> withMessage() {
        return new ValidateLoginErrorMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]/h3")).answeredBy(actor);
    }
}
