package com.devbenitez.conversor.view;

import com.devbenitez.conversor.model.Consulta;
import com.devbenitez.conversor.model.Conversion_Rates;
import com.devbenitez.conversor.model.Moneda;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado = new Scanner(System.in);
        String moneda;
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
        // ------------- menu ---------------


        System.out.println("Sea bienvenido/a al Conversor de Monedas :)");

        while (true){

            System.out.println(decoracion);
            System.out.print(menu);
            System.out.println(decoracion);

            var opcionMenu = leerTeclado.nextInt();

            if (opcionMenu == 7){
                System.out.println("Gracias por utilizar nuestro servicio. Hasta luego.");
                break;
            } // if salir

            switch (opcionMenu){

                case 1:
                    moneda = "USD";

                    Moneda cambioMoneda = consultaMoneda.buscaMoneda(moneda);   // que moneda consultar
                    Conversion_Rates tipoMoneda = cambioMoneda.conversion_rates();  //entra al Sub JsonArray
                    System.out.println("1 dolar equivale a " + tipoMoneda.ARS() + " pesos argentinos");

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