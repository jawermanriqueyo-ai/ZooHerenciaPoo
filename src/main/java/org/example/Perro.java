package org.example;

public class Perro extends Animal {
    private Collar collar;

    public Perro(String nombre, Collar collar) {
        super(nombre);
        this.collar = collar;
    }

    @Override
    public void sonido() {
        System.out.println(nombre + " ladra: guau guauuuu");
    }
    public void mostrarCollar(){
        System.out.println(nombre + "El collar es de: " + collar.getMaterial());
    }
}

