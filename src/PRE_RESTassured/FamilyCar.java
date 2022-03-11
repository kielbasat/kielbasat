package PRE_RESTassured;

public class FamilyCar extends Car {

    private String carType;

    public FamilyCar(String name, String color, int engineSize, String carType) {
        super(name, color, engineSize);
        this.carType = carType;
    }
}
