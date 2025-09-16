package org.example;

public class Veterinaria {
    private Consultorio consultorio;

    public Veterinaria(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    public void atender (Animal a) {
        System.out.println("atendido en el consultorio" + consultorio.getNumero(2));
        a.sonido();
    }
}
