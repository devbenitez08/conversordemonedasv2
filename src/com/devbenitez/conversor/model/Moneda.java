package com.devbenitez.conversor.model;

public record Moneda(String result,
                     int time_last_update_utc,
                     double conversion_rates
                     ) {

    //Conversion_Rates conversion_rates

    /*,
    ArrayList<String> conversion_rates
    */
}
