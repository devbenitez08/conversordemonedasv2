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
        double cantidad;
        double recibeConversion;

        Consulta consultaMoneda = new Consulta();
        Moneda valorMoneda;
        Calculadora calcula = new Calculadora();

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

                    valorMoneda = consultaMoneda.buscaMoneda("USD", "ARS");

                    System.out.println("Ingrese el valor que desea convertir: ");
                    cantidad = leerTeclado.nextDouble();

                    calcula.calcularConversion(cantidad, valorMoneda);
                    recibeConversion = calcula.getConversion();

                    System.out.println("El valor de " + cantidad + " [USD]" + "corresponde al valor final de =>>> " +
                            (double)Math.round (recibeConversion * 100d) / 100 + " [ARS]");

                    break;

                case 2:

                    valorMoneda = consultaMoneda.buscaMoneda("ARS", "USD");

                    System.out.println("Ingrese el valor que desea convertir: ");
                    cantidad = leerTeclado.nextDouble();

                    calcula.calcularConversion(cantidad, valorMoneda);
                    recibeConversion = calcula.getConversion();

                    System.out.println("El valor de " + cantidad + " [ARS]" + "corresponde al valor final de =>>> " +
                            (double)Math.round (recibeConversion * 100d) / 100  + " [USD]");

                    break;

                case 3:

                    valorMoneda = consultaMoneda.buscaMoneda("USD", "BRL");

                    System.out.println("Ingrese el valor que desea convertir: ");
                    cantidad = leerTeclado.nextDouble();

                    calcula.calcularConversion(cantidad, valorMoneda);
                    recibeConversion = calcula.getConversion();

                    System.out.println("El valor de " + cantidad + " [USD]" + "corresponde al valor final de =>>> " +
                            (double)Math.round (recibeConversion * 100d) / 100 + " [BRL]");

                    break;
                case 4:
                    valorMoneda = consultaMoneda.buscaMoneda("BRL", "USD");

                    System.out.println("Ingrese el valor que desea convertir: ");
                    cantidad = leerTeclado.nextDouble();

                    calcula.calcularConversion(cantidad, valorMoneda);
                    recibeConversion = calcula.getConversion();

                    System.out.println("El valor de " + cantidad + " [BRL]" + "corresponde al valor final de =>>> " +
                            (double)Math.round (recibeConversion * 100d) / 100 + " [USD]");
                    break;
                case 5:

                    valorMoneda = consultaMoneda.buscaMoneda("USD", "COP");

                    System.out.println("Ingrese el valor que desea convertir: ");
                    cantidad = leerTeclado.nextDouble();

                    calcula.calcularConversion(cantidad, valorMoneda);
                    recibeConversion = calcula.getConversion();

                    System.out.println("El valor de " + cantidad + " [USD]" + "corresponde al valor final de =>>> " +
                            (double)Math.round (recibeConversion * 100d) / 100 + " [COP]");

                    break;
                case 6:

                    valorMoneda = consultaMoneda.buscaMoneda("COP", "USD");

                    System.out.println("Ingrese el valor que desea convertir: ");
                    cantidad = leerTeclado.nextDouble();

                    calcula.calcularConversion(cantidad, valorMoneda);
                    recibeConversion = calcula.getConversion();

                    System.out.println("El valor de " + cantidad + " [COP]" + "corresponde al valor final de =>>> " +
                            (double)Math.round (recibeConversion * 100d) / 100 + " [USD]");

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