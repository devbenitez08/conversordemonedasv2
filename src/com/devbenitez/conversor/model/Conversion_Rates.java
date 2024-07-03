package com.devbenitez.conversor.model;

public record Conversion_Rates(Float ARS,
                               Float BRL,
                               Float COP
) {

    //fuente del proceso para realizar deserializacion usando Gson
    //https://www.baeldung.com/java-json-deserialize-record-gson

}
