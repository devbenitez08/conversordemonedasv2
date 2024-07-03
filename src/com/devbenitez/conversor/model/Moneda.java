package com.devbenitez.conversor.model;

import java.util.ArrayList;

public record Moneda(String result,
                     String documentation,
                     int time_last_update_unix,
                     Conversion_Rates conversion_rates
                     ) {

    /*,
    ArrayList<String> conversion_rates
    */
}
