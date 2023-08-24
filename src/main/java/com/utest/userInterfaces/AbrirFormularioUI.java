package com.utest.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AbrirFormularioUI {

    public static final Target TXT_FORMULARIO = Target.the("Clic en formulario")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

}