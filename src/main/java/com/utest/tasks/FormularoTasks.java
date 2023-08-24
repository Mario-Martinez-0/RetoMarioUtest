package com.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.utest.userInterfaces.AbrirFormularioUI.TXT_FORMULARIO;

public class FormularoTasks implements Task {

    public static FormularoTasks formularoTasks() {
        return Tasks.instrumented(FormularoTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_FORMULARIO)
        );
    }

}