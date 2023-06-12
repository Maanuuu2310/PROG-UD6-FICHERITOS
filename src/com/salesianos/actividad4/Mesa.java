package com.salesianos.actividad4;

public class Mesa {
    private String color;
    private int numPatas;
    
    public Mesa(String color, int numPatas) {
        this.color = color;
        this.numPatas = numPatas;
    }
    
    @Override
    public String toString() {
        return "La mesita uwu es de " + color + " y " + " tiene "+ numPatas + " patas.";
    }
    
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getNumPatas() {
        return numPatas;
    }
    
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
}

