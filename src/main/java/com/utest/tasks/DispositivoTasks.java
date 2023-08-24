package com.utest.tasks;

import com.utest.models.FormularioModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import static com.utest.userInterfaces.DispositivosUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DispositivoTasks implements Task {

    private FormularioModels formularioModels ;

    public DispositivoTasks(FormularioModels formularioModels) {this.formularioModels = formularioModels;}

    public static DispositivoTasks dispositivoTasks(FormularioModels formularioModels) {
        return Tasks.instrumented(DispositivoTasks.class, formularioModels);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_SISTEMAOPERATIVO, isVisible()),
                JavaScriptClick.on(TXT_SISTEMAOPERATIVO),
                Enter.theValue(formularioModels.getSistemaoPerativo()).into(TXT_SISTEMAOPERATIVO1),
                Enter.keyValues(Keys.ENTER).into(TXT_SISTEMAOPERATIVO1),
                Click.on(TXT_VERSIONSISTEMA),
                Enter.theValue(formularioModels.getVersionSistema()).into(TXT_VERSIONSISTEMA1),
                Enter.keyValues(Keys.ENTER).into(TXT_VERSIONSISTEMA1),
                Click.on(TXT_LENGUAJE),
                Enter.theValue(formularioModels.getLenguaje()).into(TXT_LENGUAJE1),
                Enter.keyValues(Keys.ENTER).into(TXT_LENGUAJE1),
                Click.on(BTN_SIGUIENTE)
        );
    }
}