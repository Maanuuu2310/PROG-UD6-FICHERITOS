package com.salesianos.actividad3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        File archivito;

        BufferedReader br = new BufferedReader(
        new FileReader("src/com/salesianos/ficheros/ejercicio1.txt"));

        BufferedReader br2 = new BufferedReader(
        new FileReader("src/com/salesianos/ficheros/actividad2.txt"));

        FileWriter fw = new FileWriter("src/com/salesianos/ficheros/ejercicio3.txt");

        try {
            archivito = new File("src/com/salesianos/ficheros/ejercicio3.txt/");
            if(archivito.createNewFile()) {
                System.out.println("Archivito created");
            }
        } catch (Exception e) {

        }

        fw.write("fichero1: " + br.readLine() + "\n");
        fw.write("fichero2: " + br2.readLine() + "\n");

        br.close();
        br2.close();
        fw.close();
    }
}

