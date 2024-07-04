package com.devbenitez.conversor.controller;

import com.devbenitez.conversor.model.Moneda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {

    public Moneda buscaMoneda (String monedaBaseCode, String monedaTargetCode){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/072ca556f339e521d1815abe/pair/" + monedaBaseCode + "/" + monedaTargetCode);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Ocurrio un error");
        }


    }




}
