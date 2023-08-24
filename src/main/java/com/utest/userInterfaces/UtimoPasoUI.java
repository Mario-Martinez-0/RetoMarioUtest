package com.utest.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtimoPasoUI {

    public static final Target TXT_CONTRASENA = Target.the("Ingresar contrasena").located(By.id("password"));
    public static final Target TXT_CONFIRMARCONTRASENA = Target.the("Confirmar contrasena").located(By.id("confirmPassword"));
    public static final Target CHK_TERMINOSYCONDICIONES = Target.the("Click en terminos y condiciones").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static final Target CHK_POLITICASDESEGURIDAD = Target.the("Click en politicas de seguridad").located(By.xpath("(//a[text()='Privacy & Security Policy']//following::span)[1]"));
    public static final Target BTN_COMPLETARREGISTRO = Target.the("Clic en completar registro").located(By.id("laddaBtn"));

}