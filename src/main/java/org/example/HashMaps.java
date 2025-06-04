package org.example;

import java.util.Map;
import java.util.HashMap;

public class HashMaps {

    public static void main(String[] arg) {
        Map<String, String> m = new HashMap<String, String>();

        // enter name/url pair
        m.put("Manick", ",manic.org");
        m.put("Practice", "practice.mani.org");
        m.put("Code", "code.mani.org");
        m.put("Quiz", "www.mani.org");

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String, String> i : m.entrySet())
            System.out.println("Key = " + i.getKey()  +
                    ", Value = " + i.getValue());
    }
}
