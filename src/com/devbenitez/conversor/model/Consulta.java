package com.devbenitez.conversor.model;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {

    public Moneda buscaMoneda (String monedaBaseCode, String monedaTarget){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/072ca556f339e521d1815abe/latest/" + monedaBaseCode + "/" + monedaTarget);

        HttpClient client = HttpClient.newHttpClient(); //crea un cliente

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            /*System.out.println("desde el try");
            System.out.println(response);   //contiene un GET implicito y la url. En el cuerpo contiene un json
            System.out.println("----------------");*/

            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Ocurrio un error");
        }


    }




}
