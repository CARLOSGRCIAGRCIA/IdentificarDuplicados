package persona;

public class Person {
    private String name;
    private int identification;
    private int age;

    public Person(String name, int identification, int age) {
        this.name = name;
        this.identification = identification;
        this.age = age;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person(" +
                "name='" + name + '\'' +
                ", identification=" + identification +
                ", age=" + age +
                ')';
    }
}
