package com.utest.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class FormularioModels {

    private String nombre;
    private String apellido;
    private String correo;
    private String mes;
    private String dia;
    private String ano;

    private String ciudad;
    private String codigoPostal;
    private String pais;
    private String contrasena;
    private String contrasen;

    private String sistemaoPerativo;
    private String versionSistema;
    private String lenguaje;

    public static List<FormularioModels> setData(DataTable dataTable) {
        List<FormularioModels> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, FormularioModels.class));
        }
        return dates;
    }

}
