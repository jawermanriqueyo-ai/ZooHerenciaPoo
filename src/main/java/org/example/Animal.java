package org.example;

public class Animal {
    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

   public void sonido() {
        System.out.println(nombre + "sonido generico");
    }
}
