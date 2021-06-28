package org.example.oops.immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MainClass {
    public static void main(String[] args) {

        Employee e1 = new Employee("111", "aaa", getDob("04/02/1986"));
        Employee e2 = new Employee("222", "eee", getDob("04/06/1986"));
        Employee e3 = new Employee("333", "bbb", getDob("23/02/1986"));
        Employee e4 = new Employee("555", "ccc", getDob("04/11/1992"));

        ConcurrentMap<Employee, String> map = new ConcurrentHashMap<>();
        map.put(e1, "first");
        map.put(e2, "second");
        map.put(e3, "third");
        map.put(e4, "fourth");

        Set<Map.Entry<Employee, String>> entries = map.entrySet();
        for(Map.Entry<Employee, String> e : entries){
            Employee key = e.getKey();
            String value = e.getValue();
        }

        e1.getDob().setTime(8988878787L);
        System.out.println(map.get(e1));

    }

    private static Date getDob(String dob){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.parse(dob);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
