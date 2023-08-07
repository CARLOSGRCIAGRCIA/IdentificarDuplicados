package estacion;

import persona.Person;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Centralizador {
    private List<Person> processedData;
    private List<Estacion> estaciones;

    public Centralizador() {
        this.processedData = new LinkedList<>();
        this.estaciones = new LinkedList<>();
    }

    public void add(Estacion estacion) {
        processedData.addAll(estacion.getRegisteredPersons());
        estaciones.add(estacion);
    }

    public void iterate() {
        for (Estacion estacion : estaciones) {
            System.out.println("\nDatos de " + estacion.getName());
            for (Person person : estacion.getRegisteredPersons()) {
                System.out.println(person.toString());
            }
        }

        System.out.println("\nDatos procesados:");
        Set<Integer> processedIds = new HashSet<>();
        for (Person person : processedData) {
            if (!processedIds.contains(person.getIdentification())) {
                processedIds.add(person.getIdentification());
                System.out.println(person.toString());
            }
        }
    }
}
