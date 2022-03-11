package PRE_RESTassured;

import java.util.ArrayList;
import java.util.List;

public class Person extends Car {

    public Person(String name, String color, int engineSize) {
        super(name, color, engineSize);
    }

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("opel", "white", 2));
        cars.add(new Car("opel2", "white2", 2));
        cars.add(new Car("opel3", "white2", 2));

        for (Car car :
                cars) {
            car.hiMyBrandIs();
        }
    }
}
