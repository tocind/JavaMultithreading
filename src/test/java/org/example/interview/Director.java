package org.example.interview;

import java.util.Objects;

public class Director {

    int id;
    int age;

    Director(int i, int a){
        id = i;
        age = a;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(5);
    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}