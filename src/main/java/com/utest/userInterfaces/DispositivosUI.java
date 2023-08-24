package com.utest.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DispositivosUI {

    public static final Target TXT_SISTEMAOPERATIVO = Target.the("Seleccionar sistema operativo").located(By.xpath("(//span[@aria-label='Select OS'])[1]"));
    public static final Target TXT_SISTEMAOPERATIVO1 = Target.the("Seleccionar sistema operativo").located(By.xpath("(//input[@placeholder='Select OS'])[1]"));
    public static final Target TXT_VERSIONSISTEMA = Target.the("Seleccionar la version del sistema operativo").located(By.xpath("//span[@aria-label='Select a Version']"));
    public static final Target TXT_VERSIONSISTEMA1 = Target.the("Seleccionar la version del sistema operativo").located(By.xpath("//input[@placeholder='Select a Version']"));
    public static final Target TXT_LENGUAJE = Target.the("Seleccionar el lenguaje del sistema operativo").located(By.xpath("//span[@aria-label='Select OS language']"));
    public static final Target TXT_LENGUAJE1 = Target.the("Seleccionar el lenguaje del sistema operativo").located(By.xpath("//input[@placeholder='Select OS language']"));
    public static final Target BTN_SIGUIENTE = Target.the("Click en siguiente").located(By.xpath("//a[@class='btn btn-blue pull-right']"));


}
