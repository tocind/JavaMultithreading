package org.example.interview;

import java.util.Objects;

public class Actor{
    int id;
    int age;

    Actor(){}

    @Override
    public boolean equals(Object o) {
        return true;
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Actor actor = (Actor) o;
//        return id == actor.id && age == actor.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(10);
//        return Objects.hash(id, age);
    }
}