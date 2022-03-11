package PRE_RESTassured;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        //filter, map

        //terminal method
        // forEach, min, max, sum, anyMatch, allMatch, nonMatch, count, collect

//        List<String> names = new ArrayList<>();
//        names.add("Fom");
//        names.add("Fan");
//        names.add("Fon");
//        names.add("Cay");
//        names.add("Ban");
//        names.add("Aan");


//       create stream and do the same
//        for (String name : names) {
//            if (name.startsWith("F")) {
//                System.out.println(name);
//            }
//        }
//        long numberOfFNames = names.stream()
//                .filter(name -> name.startsWith("F"))
//                .count();
//        System.out.println(numberOfFNames);
//
//        names.stream()
//                .filter(name -> name.startsWith("F"))
//                .forEach(System.out::println);
//        names.stream()
//                .map(name -> name.toUpperCase())
//                .forEach(System.out::println);
//
//        boolean namesShouldContainNOnEnd = names.stream()
//                .filter(name -> name.endsWith("n"))
//                .anyMatch(name -> name.endsWith("n"));
//        System.out.println(namesShouldContainNOnEnd);

//        List<String> namesFiltered = names.stream()
//                .filter(name -> name.startsWith("F"))
//                .filter(name -> name.endsWith("n"))
//                .collect(Collectors.toList());
//
//        System.out.println(namesFiltered);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "White", 2));
        cars.add(new Car("opel", "Blue", 2));
        cars.add(new Car("renault", "White", 2));
        cars.add(new Car("ford", "Blue", 2));

        cars.stream()
                .filter(car -> car.color.contains("White"))
                .forEach(System.out::println);
        cars.stream()
                .filter(car -> car.getColor().contains("Blue"))
                .forEach(System.out::println);
    }
}
