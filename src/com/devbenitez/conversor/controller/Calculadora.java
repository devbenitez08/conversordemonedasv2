package com.devbenitez.conversor.controller;

import com.devbenitez.conversor.model.Moneda;

public class Calculadora {

    private double conversion;

    public double getConversion (){
        return conversion;
    }

    public void calcularConversion (double cantidad, Moneda valorMoneda){

        conversion = cantidad * valorMoneda.conversion_rate();

    }

}
