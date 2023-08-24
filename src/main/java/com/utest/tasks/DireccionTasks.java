package com.utest.tasks;

import com.utest.models.FormularioModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import static com.utest.userInterfaces.DireccionUI.*;

public class DireccionTasks implements Task {

    private FormularioModels formularioModels ;

    public DireccionTasks(FormularioModels formularioModels) {
        this.formularioModels = formularioModels;
    }

    public static DireccionTasks dreccionTasks(FormularioModels formularioModels) {
        return Tasks.instrumented(DireccionTasks.class, formularioModels);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Enter.theValue(formularioModels.getCiudad()).into(TXT_CIUDAD),
                Click.on(TXT_CIUDAD),
                Enter.theValue(formularioModels.getCiudad()).into(TXT_CIUDAD).thenHit(Keys.ARROW_DOWN),
                Clear.field(TXT_CODIGOPOSTAL),
                Enter.theValue(formularioModels.getCodigoPostal()).into(TXT_CODIGOPOSTAL),
                Click.on(TXT_PAIS),
                Enter.theValue(formularioModels.getPais()).into(TXT_PAIS1),
                Enter.keyValues(Keys.ENTER).into(TXT_PAIS1),
                Click.on(BTN_DIRECCION)
        );
    }
}