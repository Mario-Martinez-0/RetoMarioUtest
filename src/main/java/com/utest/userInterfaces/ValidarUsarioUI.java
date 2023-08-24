package com.utest.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarUsarioUI {

    public static final Target TXT_VALIDARUSUARIO = Target.the("Ver mensaje de bienvenida").located(By.xpath("//h1"));

}
