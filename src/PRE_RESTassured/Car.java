package PRE_RESTassured;

public class Car {

    protected String name;
    protected String color;
    protected int engineSize;

    public Car(String name, String color, int engineSize) {
        this.name = name;
        this.color = color;
        this.engineSize = engineSize;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String name) {
        this.color = name;
    }

    public void setEngineSize(int name) {
        this.engineSize = name;
    }

    public void hiMyBrandIs() {
        System.out.println("Hi my brand is: " + name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engineSize=" + engineSize +
                '}';
    }
}
