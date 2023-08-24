package com.utest.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalUI {

    public static final Target TXT_NOMBRE = Target.the("Ingresar nombre").located(By.id("firstName"));
    public static final Target TXT_APELLIDO = Target.the("Ingresar apellido").located(By.id("lastName"));
    public static final Target TXT_CORREO = Target.the("Ingresar correo").located(By.id("email"));
    public static final Target TXT_MES = Target.the("Seleccionar mes").located(By.id("birthMonth"));
    public static final Target TXT_DIA = Target.the("Seleccionar dia").located(By.id("birthDay"));
    public static final Target TXT_ANO = Target.the("Seleccionar ano").located(By.id("birthYear"));
    public static final Target TXT_SIGUIENTEALOCALIZACION = Target.the("Click en siguiente").located(By.xpath("//a[@class='btn btn-blue']"));
}
