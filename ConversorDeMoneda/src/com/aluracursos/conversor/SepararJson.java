package com.aluracursos.conversor;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class SepararJson {

    @SerializedName("time_last_update_utc")
    private String fechaActualizacion;
    @SerializedName("conversion_rate")
    private double tasaDeConversion;

    public SepararJson(String fechaActualizacion, double tasaDeConversion){
        this.fechaActualizacion = fechaActualizacion;
        this.tasaDeConversion = tasaDeConversion;
    }

    public SepararJson() {

    }


    public double getTasaDeConversion() {
        return tasaDeConversion;
    }


    @Override
    public String toString() {
        return
                "La última actualización es del: '" + fechaActualizacion + '\'' +
                "  Tasa de Conversión: $ " + tasaDeConversion +
                '}';
    }
}
