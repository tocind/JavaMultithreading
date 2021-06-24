package org.example.coll;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        System.out.println(findString("hi"));
    }

    private static Optional<String> findString(String str){
        String s = new String();
        s = null;
        return Optional.ofNullable(s);
    }
}
