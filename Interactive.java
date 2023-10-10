package org.example.firstlink;

import java.util.*;

public class Interactive {
    public static void main(String[] args) {
//        Set<String> languages = new HashSet<>();
//        languages.add("HTML");
//        languages.add("CSS");
//        languages.add("JavaScript");
//
//        System.out.println(languages.size());

//        Set<String> languages = new HashSet<>(Arrays.asList("HTML", "CSS", "JS"));
//        languages.add("HTML");
//        languages.add("CSS");
//        System.out.println(languages.size());
//
//        for (String language : languages){
//            System.out.println(language);
//        }

        Set<String> frontEnd = new HashSet<>(Arrays.asList("HTML", "JS", "CSS"));
        Set<String> backEnd = new HashSet<>(Arrays.asList("Java", "C#", "Ruby", "JS"));


//        Set<String> intersection = new HashSet<>(backEnd);
//        intersection.retainAll(frontEnd);
//
//        for (String language : intersection){
//            System.out.println(language);
//        }
//
//        Set<String> union = new HashSet<>(backEnd);
//        union.addAll(frontEnd);
//
//        for (String language : union){
//            System.out.println(language);
//        }


       // frontEnd.remove("JS");

//        Set<String> intersection = new HashSet<>(backEnd);
//        intersection.addAll(frontEnd);
//        intersection.removeAll(backEnd);
//
//
//        for (String language : intersection){
//            System.out.println(language);
//        }

        Set<String> languages = new TreeSet<>();
        languages.add("HTML");
        languages.add("Ruby");
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("CSS");

        Set<String> intersection = new TreeSet<>(languages);


//        for (String language : intersection){
//            System.out.println(language);
//        }

        String[] languagess = {"Java", "C#", "Go"};
        String[] moreLanguages = {"Java", "C#", "JavaScript", "Python"};

//        List<String> combined = new ArrayList<>(Arrays.asList(languagess));
//        for (String language : moreLanguages){
//            if (!combined.contains(languagess)){
//                combined.add(language);
//            }
//        }
//
//        Set<String> combinedSet = new HashSet<>(Arrays.asList(languagess));
//        combinedSet.addAll(Arrays.asList(moreLanguages));

        List<String> combined = new ArrayList<>(Arrays.asList(languagess));
        for (String language : moreLanguages){
            if (!combined.contains(languagess)){
                combined.add(language);
                combined.sort(String:: compareTo);
            }
        }

        Set<String> combinedSet = new TreeSet<>(Arrays.asList(languagess));
        combinedSet.addAll(Arrays.asList(moreLanguages));

    }
}
