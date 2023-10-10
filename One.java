package org.example.firstlink;

import java.util.ArrayList;
import java.util.List;

public class One {

    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Go");
        languages.add("HTML");
        System.out.println(languages.size());
        System.out.println(languages.indexOf("Python"));
        System.out.println(languages.get(2));
        languages.remove(4);

       // Object[] langsArray = languages.toArray();
        String[] langsArray = languages.toArray(new String[0]);
        List<String> someLangs = languages.subList(0, 3);
        someLangs.set(2, "Groovy");

        for(String language : languages){
            System.out.println(language);
        }

    }



}
