package estacion;

import persona.Person;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Estacion {
    private String name;
    private Set<Person> registeredPersons;

    public Estacion(String name) {
        this.name = name;
        this.registeredPersons = new HashSet<>();
    }

    public void add(Person person) {
        registeredPersons.add(person);
    }

    public List<Person> getRegisteredPersons() {
        return new LinkedList<>(registeredPersons);
    }

    public String getName() {
        return name;
    }
}