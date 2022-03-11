package PRE_RESTassured;

public class SportsCar extends Car {

    private String carType;

    public SportsCar(String name, String color, int engineSize, String carType) {
        super(name, color, engineSize);
        this.carType = carType;
    }
}
