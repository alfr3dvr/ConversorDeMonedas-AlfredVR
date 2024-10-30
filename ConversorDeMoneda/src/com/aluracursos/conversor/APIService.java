package com.aluracursos.conversor;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIService {

    private String urlBase = "https://v6.exchangerate-api.com/v6/";
    private String claveDeAPI = "28876b3571f8531bff48f366";

    public double tasaApi;

    public void obtenerInformacionApi(String monedaDeOrigen, String monedaDeDestino) throws IOException, InterruptedException {
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(urlBase+claveDeAPI+"/pair"+"/"+monedaDeOrigen+"/"+monedaDeDestino))
                .build();

        HttpResponse<String> respuesta = cliente
                .send(solicitud, HttpResponse.BodyHandlers.ofString());
        String json = respuesta.body();
//        System.out.println(json);

        Gson gson = new Gson();
        SepararJson miConversion = gson.fromJson(json, SepararJson.class);
        System.out.println(miConversion);
        tasaApi = miConversion.getTasaDeConversion();


    }
}
