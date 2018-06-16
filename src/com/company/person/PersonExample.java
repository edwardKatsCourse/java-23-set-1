package com.company.person;

import java.util.HashSet;
import java.util.Set;

public class PersonExample {

    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person("Sarah", 30));
        personSet.add(new Person("Peter", 31));
        personSet.add(new Person("Jane", 32));


        Person ivanTelAviv = new Person("Ivan", 34);
        Address telAviv = new Address("Tel-Aviv", "Rotshild", 100);
        ivanTelAviv.setAddress(telAviv);
        personSet.add(ivanTelAviv);


        Person ivanHaifa = new Person("Ivan", 34);
        Address haifa = new Address("Haifa", "Karmelit", 11);
        ivanHaifa.setAddress(haifa);
        personSet.add(ivanHaifa);

        Person ivanKfarSaba = new Person("Ivan", 34);
        Address kfarSaba = new Address("Kfar Saba", "Weizman", 16);
        ivanKfarSaba.setAddress(kfarSaba);
        personSet.add(ivanKfarSaba);



        for (Person person : personSet) {
            System.out.println(person);
        }

        //1. Ivan, 33 yo, { Haifa }
        //2. Ivan, 33 yo, { Kfar Saba }

    }
}

