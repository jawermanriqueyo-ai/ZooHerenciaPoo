package org.example;

public class Main {
    public static void main(String[] args) {
        Collar collar = new Collar("cuero");
        Perro perro = new Perro("tobi", collar);
        Gato gato = new Gato("lulu");

        Consultorio consultorio = new Consultorio(1);
        Veterinaria vet = new Veterinaria(consultorio);

        vet.atender(perro);
        vet.atender(gato);

        Caja<Animal> caja = new Caja<>();
        caja.guardar(gato);
        System.out.println("dentro de la caja esta el gato:" + caja.obtener().nombre);

        Animal a = new Perro("tobi", new Collar("cuero"));
        if (a instanceof Perro) {
            Perro p = (Perro) a;
            p.mostrarCollar();
        }
    }
}