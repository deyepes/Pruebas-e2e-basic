package co.com.bancolombia.calidad.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class LoginWith implements Task {

    String username;
    String password;

    public LoginWith(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(username).into(By.id("user-name")),
                Enter.theValue(password).into(By.id("password")),
                Click.on(By.id("login-button")));
    }

    public static Performable credetials(String username, String password) {
        return Instrumented.instanceOf(LoginWith.class).withProperties(username,password);
    }

}
