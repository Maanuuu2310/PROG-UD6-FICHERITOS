package com.salesianos.actividad2;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/com/salesianos/ficheros/actividad2.txt");

        int texto2;
        while ((texto2 = fr.read()) != -1) {
            System.out.print((char)texto2 + "_" + texto2 + ", ");
        }
    }
}

