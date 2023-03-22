package Java_OOP_Advanced.Exercise30_ObjectClass_OverrideDelMetodo_equals_toString;

import java.util.Objects;

public class Persona {
    String name;
    int age;
    String address;

    public Persona(String name, int age ,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\n" + "Età: " + age + "\n" + "Indirizzo: " + address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return age == persona.age && Objects.equals(name, persona.name) && Objects.equals(address, persona.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }
}

