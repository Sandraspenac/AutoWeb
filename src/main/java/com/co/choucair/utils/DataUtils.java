package com.co.choucair.utils;

import java.util.Random;

public class DataUtils {

    private static final String[] NOMBRES = {"Sandra", "Felipe", "Martha", "Raul", "Pena", "Castellanos"};
    private static final String[] APELLIDOS = {"Ojeda", "Pena", "Roa", "Lopez", "jimenez"};


    public static String generaNombre() {
        return NOMBRES[new Random().nextInt(NOMBRES.length)];
    }

    public static String generaApellido() {
        return APELLIDOS[new Random().nextInt(APELLIDOS.length)];
    }

    public static String generaCodigoPostal() {
        int codigo = 10000 + new Random().nextInt(90000);
        return String.valueOf(codigo);
    }
}