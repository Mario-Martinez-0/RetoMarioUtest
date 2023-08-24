package com.utest.tasks;

import com.utest.models.AbrirData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirUtestTasks implements Task{

    private AbrirData abrirData ;

    public AbrirUtestTasks(AbrirData abrirData) {
        this.abrirData = abrirData;
    }
    public static AbrirUtestTasks abrirUtestTasks(AbrirData url) {
        return Tasks.instrumented(AbrirUtestTasks.class, url);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(abrirData.getUrl()));
    }
}