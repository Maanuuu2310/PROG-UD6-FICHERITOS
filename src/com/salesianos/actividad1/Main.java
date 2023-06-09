package com.salesianos.actividad1;

import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String texto = "";
        final int MIN_TEXT = 30;
        FileWriter fw = new FileWriter("src/com/salesianos/ficheros/ejercicio1.txt");

        while (texto.length() < 30) {
            System.out.println("introduce un texto");
            texto = keyboard.nextLine();
            if (texto.length() < 30 ) {
                System.out.println("faltan: " + (MIN_TEXT - texto.length()) + " caracteres");
            }
        }
        String frasemayus = texto.toUpperCase().replace(" ", "_");
        System.out.println(frasemayus);
        fw.write(frasemayus);
        fw.close();
        keyboard.close();
    }
}


