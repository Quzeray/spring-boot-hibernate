package com.example.springboothibernate.entity.id;

import java.io.Serializable;

public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonId personId = (PersonId) o;

        if (age != personId.age) return false;
        if (!name.equals(personId.name)) return false;
        return surname.equals(personId.surname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        return result;
    }
}