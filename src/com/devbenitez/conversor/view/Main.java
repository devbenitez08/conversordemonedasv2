package com.devbenitez.conversor.view;

import com.devbenitez.conversor.controller.Calculadora;
import com.devbenitez.conversor.controller.Consulta;
import com.devbenitez.conversor.model.Moneda;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado = new Scanner(System.in);
        int opcionMenu = 0;

        Consulta consultaMoneda = new Consulta();

        String decoracion = "**********************************";
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

        System.out.println("Sea bienvenido/a al Conversor de Monedas by devBenitez :)");

        while (opcionMenu != 7){

            System.out.println(decoracion);
            System.out.print(menu);
            System.out.println(decoracion);

            opcionMenu = leerTeclado.nextInt();

            switch (opcionMenu){

                case 1:

                    Moneda valorMoneda = consultaMoneda.buscaMoneda("USD", "ARS");

                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cantidad = leerTeclado.nextDouble();

                    Calculadora calcula = new Calculadora();
                    calcula.calcularConversion(cantidad, valorMoneda);
                    double recibeConversion = calcula.getConversion();

                    BigDecimal bd = new BigDecimal(recibeConversion);
                    bd = bd.setScale(2, RoundingMode.HALF_UP);

                    System.out.println("El valor de " + cantidad + " [USD]" + "corresponde al valor final de =>>> " +
                            bd.doubleValue() + " [ARS]");

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
                    System.out.println("Gracias por usar nuestro servicio. Hasta luego.");
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }

        }


    }
}