package com.utest.stepDefinitions;

import com.utest.models.AbrirData;
import com.utest.models.FormularioModels;
import com.utest.questions.ValidarUsuario;
import com.utest.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CrearNuevoUsuarioStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario abre la url en el navegador")
    public void queElUsuarioAbreLaUrlEnElNavegador(DataTable datos) {
        theActorCalled("Usuario").wasAbleTo(AbrirUtestTasks.abrirUtestTasks(AbrirData.setData(datos).get(0))
        );
    }

    @Cuando("da clic en la opcion de registro")
    public void daClicEnLaOpcionDeRegistro() {
        theActorInTheSpotlight().attemptsTo(FormularoTasks.formularoTasks());
    }

    @Cuando("diligencia el formulario de un nuevo usuario")
    public void diligenciaElFormularioDeUnNuevoUsuario(DataTable datos) {
        theActorInTheSpotlight().attemptsTo(PersonalTasks.diligenciarFormularioTasks(FormularioModels.setData(datos).get(0)));
        theActorInTheSpotlight().attemptsTo(DireccionTasks.dreccionTasks(FormularioModels.setData(datos).get(0)));
        theActorInTheSpotlight().attemptsTo(DispositivoTasks.dispositivoTasks(FormularioModels.setData(datos).get(0)));
        theActorInTheSpotlight().attemptsTo(UltimoPasoTasks.ultimoPasoTasks(FormularioModels.setData(datos).get(0)));
    }

    @Entonces("El usuario visualizara un mensaje de bienvenida")
    public void elUsuarioVisualizaraUnMensajeDeBienvenida() {
        theActorInTheSpotlight().should(seeThat(ValidarUsuario.verficarUsuario()));
    }
}