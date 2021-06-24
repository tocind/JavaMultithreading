package org.example.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestClass {
    public static void main(String[] args) {
        Map<Actor, Director> map = new HashMap<>();
        Actor actor = new Actor();
        Director director = new Director(10, 20);
        Director director2 = new Director(10, 22);
        Director director3 = new Director(10, 33);
        Director director4 = new Director(10, 44);
        Director director5 = new Director(10, 55);
        Director director6 = new Director(10, 66);
        map.put(actor, director);
        map.put(actor, director2);
        map.put(actor, director3);
        map.put(actor, director4);
        map.put(actor, director5);
        map.put(actor, director6);

        System.out.println(map.size());

        Set<Map.Entry<Actor, Director>> iterator = map.entrySet();
        int c = 1;
        for(Map.Entry e : iterator){
            System.out.println(c);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            ++c;
        }

    }
}
