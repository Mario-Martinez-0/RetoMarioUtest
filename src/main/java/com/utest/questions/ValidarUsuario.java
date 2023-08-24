package com.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.utest.userInterfaces.ValidarUsarioUI.TXT_VALIDARUSUARIO;

public class ValidarUsuario implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        return TXT_VALIDARUSUARIO.resolveFor(actor).isVisible();

    }

    public static Question verficarUsuario() {
        return new ValidarUsuario();
    }
}