package com.company.car;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Set<Car> cars = new HashSet<>();
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add new car");
            System.out.println("2. See existing cars");
            System.out.println("3. Exit");
            Integer option = new Scanner(System.in).nextInt();

            if (option.equals(1)) {
                boolean isNewCar = cars.add(inputCar());
                if (isNewCar) {
                    System.out.println("Car has been successfully added");
                } else {
                    System.out.println("Car already exists! Try again..");
                }

            } else if (option.equals(2)) {
                for (Car car : cars) {
                    System.out.println(car);
                }

                Iterator<Car> iterator = cars.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                    iterator.remove();
                }

            } else if (option.equals(3)) {
                System.exit(777);
            }
        }
    }


    private static Car inputCar() {
        System.out.println("Brand:");
        String brand = new Scanner(System.in).nextLine();
        System.out.println("Model:");
        String model = new Scanner(System.in).nextLine();
        System.out.println("Year of manufacturing:");
        Integer year = new Scanner(System.in).nextInt();

        return new Car(brand, model, year);
    }
}
