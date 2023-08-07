package main;

import estacion.Centralizador;
import estacion.Estacion;
import persona.Person;

public class Main {
    public static void main(String[] args) {
        Estacion c1 = new Estacion("c1");
        c1.add(new Person("Juan", 1252, 18));
        c1.add(new Person("Raul", 2252, 18));
        c1.add(new Person("Janeth", 1587, 18));
        c1.add(new Person("Janeth", 1587, 18));

        Estacion c2 = new Estacion("c2");
        c2.add(new Person("Juan", 1252, 18));
        c2.add(new Person("Mery", 3225, 21));
        c2.add(new Person("Jenny", 2557, 18));
        c2.add(new Person("Janeth", 1587, 18));

        Estacion c3 = new Estacion("c3");
        c3.add(new Person("Julio", 2222, 18));
        c3.add(new Person("Alex", 2558, 18));
        c3.add(new Person("Janeth", 1587, 18));

        Centralizador cent = new Centralizador();
        cent.add(c1);
        cent.add(c2);
        cent.add(c3);
        cent.iterate();
    }
}