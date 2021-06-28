package org.example.oops.immutable;

import java.util.Date;
import java.util.Objects;

public final class Employee {

    private final String id;
    private final String name;
    private final Date dob;

    Employee(String id, String name, Date dob){
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
//        return dob;
        return new Date(dob.getTime());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id)
                && name.equals(employee.name)
                && dob.equals(employee.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dob);
    }
}
