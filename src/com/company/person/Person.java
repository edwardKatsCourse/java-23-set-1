package com.company.person;

import java.util.Objects;

public class Person {
    private String name;
    private Integer age;
    private Address address;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(address, person.address);
        //address.equals(person.address)
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, address);
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Age: %s | Address: %s",
                this.name,
                this.age,
                this.address);
    }
}
