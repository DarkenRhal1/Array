package org.example.firstlink;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapLink {
    public static void main(String[] args) {

        Map<String, Integer> languagesCount = new HashMap<>();
        languagesCount.put("HTML", 5);
        languagesCount.put("CSS", 3);
        languagesCount.put("JavaScript", 20);
        System.out.println(languagesCount.size());
        System.out.println("Num of HTML: " + languagesCount.get("HTML"));

        if (languagesCount.containsKey("HTML")) {
            System.out.println("Yes, We do teach HTML");
        } else {
            System.out.println("We do not teach HTML");
        }

        for (Map.Entry<String, Integer> entry : languagesCount.entrySet()){
           System.out.println( entry);

        }

        System.out.println("The Languages that we teach are: " + languagesCount.keySet());

        int sumCourses = 0;
        for(Integer value : languagesCount.values()) {
            sumCourses += value;
        }

        System.out.println("Total number of Course: " + sumCourses);

        Map<String, Integer> languagesCountt = new TreeMap<>();
        languagesCountt.put("Python", 10);
        languagesCountt.put("HTML", 10);
        languagesCountt.put("CSS", 3);
        languagesCountt.put("JavaScript", 20);

        for (Map.Entry<String, Integer> languages : languagesCountt.entrySet()) {
            System.out.println( languages);
        }

        languagesCountt = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> languages : languagesCountt.entrySet()) {
            System.out.println( languages);
        }
        System.out.println(languagesCountt);

    }
    }




