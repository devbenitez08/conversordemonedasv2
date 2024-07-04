package com.devbenitez.conversor.view;

import com.devbenitez.conversor.model.Consulta;
import com.devbenitez.conversor.model.Conversion_Rates;
import com.devbenitez.conversor.model.Moneda;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado = new Scanner(System.in);
        String monedaOrigen;
        Consulta consultaMoneda = new Consulta();   //crea una instancia de Consulta
                                                    // solicitud y procesamiento de una consulta solicitada
                                                    //por la opcion seleccionada del menu

        // ------------- menu ---------------
        String decoracion = "****************************";
        String menu = """
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción valida:
                """;
        String temporal = "menu";
        // ------------- menu ---------------


        System.out.println("Sea bienvenido/a al Conversor de Monedas :)");

        while (true){

            System.out.println(decoracion);
            System.out.print(temporal);
            System.out.println(decoracion);

            var opcionMenu = leerTeclado.nextInt();

            if (opcionMenu == 7){
                System.out.println("Gracias por utilizar nuestro servicio. Hasta luego.");
                break;
            } // if salir

            switch (opcionMenu){

                case 1:
                    monedaOrigen = "USD";

                    Moneda valorMoneda = consultaMoneda.buscaMoneda(monedaOrigen);   // que moneda consultar
                                                                                //devuelve el cotenido de Moneda
                    System.out.println("tipo moneda: " + valorMoneda);

                    //System.out.println(valorMoneda.conversion_rates().ARS());   //funciona
                    //String jsonValorMoneda = String.valueOf(valorMoneda);

                    //JsonParser parser = Json.createParser(new StringReader("[]"));




                    /*
                    System.out.println(valorMoneda.getClass().getSimpleName());
                    String jsonValorMoneda = String.valueOf(valorMoneda);
                    System.out.println("tipo string: " + json);
                    System.out.println(json.getClass().getSimpleName());

                    JsonObject objetoJson =  new JsonObject(json); */

                    //Tratando valorMoneda con JSONObject y JSON
                    // pasando json a array

                    /*Conversion_Rates tipoMoneda = valorMoneda.conversion_rates();  //entra al Sub JsonArray
                    System.out.println("1 dolar equivale a " + tipoMoneda.ARS() + " pesos argentinos");
                    */
                    break;

                case 2:

                    break;

                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }

        }


    }
}