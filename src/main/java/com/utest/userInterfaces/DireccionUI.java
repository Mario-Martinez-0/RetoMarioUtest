package com.utest.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DireccionUI {

    public static final Target TXT_CIUDAD = Target.the("Click en carga la ciudad").located(By.id("city"));
    public static final Target TXT_CODIGOPOSTAL = Target.the("Click en codigo postal").located(By.id("zip"));
    public static final Target TXT_PAIS = Target.the("Click ne pais").located(By.xpath("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required']"));
    public static final Target TXT_PAIS1 = Target.the("Ingresamos el pais").located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target BTN_DIRECCION = Target.the("Click en siguiente").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
