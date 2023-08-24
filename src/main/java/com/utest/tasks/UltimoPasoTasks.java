package com.utest.tasks;
import com.utest.models.FormularioModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.utest.userInterfaces.UtimoPasoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class UltimoPasoTasks implements Task {

    private FormularioModels formularioModels ;

    public UltimoPasoTasks(FormularioModels formularioModels) {
        this.formularioModels = formularioModels;
    }

    public static UltimoPasoTasks ultimoPasoTasks(FormularioModels formularioModels) {
        return Tasks.instrumented(UltimoPasoTasks.class, formularioModels);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formularioModels.getContrasena()).into(TXT_CONTRASENA),
                Enter.theValue(formularioModels.getContrasen()).into(TXT_CONFIRMARCONTRASENA),
                Click.on(CHK_TERMINOSYCONDICIONES),
                WaitUntil.the(CHK_POLITICASDESEGURIDAD, isVisible()),
                Click.on(CHK_POLITICASDESEGURIDAD),
                Click.on(BTN_COMPLETARREGISTRO)
        );
    }
}
