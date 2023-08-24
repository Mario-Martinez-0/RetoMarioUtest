package com.utest.tasks;

import com.utest.models.FormularioModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static com.utest.userInterfaces.PersonalUI.*;

public class PersonalTasks implements Task {

    private FormularioModels formularioModels ;

    public PersonalTasks(FormularioModels formularioModels) {
        this.formularioModels = formularioModels;
    }

    public static PersonalTasks diligenciarFormularioTasks(FormularioModels formularioModels) {
        return Tasks.instrumented(PersonalTasks.class, formularioModels);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formularioModels.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(formularioModels.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(formularioModels.getCorreo()).into(TXT_CORREO),
                SelectFromOptions.byVisibleText(formularioModels.getMes()).from(TXT_MES),
                SelectFromOptions.byVisibleText(formularioModels.getDia()).from(TXT_DIA),
                SelectFromOptions.byVisibleText(formularioModels.getAno()).from(TXT_ANO),
                Click.on(TXT_SIGUIENTEALOCALIZACION)
        );
    }
}