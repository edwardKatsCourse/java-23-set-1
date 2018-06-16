package com.company.person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Main {

    /**
     * Collection
     *
     * List
     * Set
     *
     *
     * Set
     * Sets have no indexes
     * Set does not contain duplicates
     *
     * HashSet
     * TreeSet
     * LinkedHashSet
     */

    public static void main(String[] args) {
        //HashSet

        Set<String> stringSet = new HashSet<>();
        stringSet.add("abc");
        stringSet.add("cba");
        stringSet.add("bac");

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("cba");
        list.add("bac");
        list.add("zyx");


//        System.out.println(stringSet);

//        for (String s : stringSet) {
//        }
        stringSet.addAll(list);
        System.out.println(stringSet);
        stringSet.remove("zyx");

        System.out.println(stringSet);

        stringSet.removeIf(x -> "bac".equals(x));
        System.out.println(stringSet);
        stringSet.clear();
        System.out.println(stringSet);



    }

    private static void intro() {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("e");
        set.add("rrr");
        set.add("rrr");
        set.add("r");
        //7
        System.out.println(set.size());
        //5

//        ArrayList<String> objects = new ArrayList<>();
//        objects.add("a");
//        objects.add("a");
//        objects.add("b");
//        objects.add("c");
//
//        objects.remove("a");
    }
}
