package PRE_RESTassured;

public class TestPerson {
    private String firstName;
    private String lastName;
    private int age;
    private boolean likeIceCreams;

    public TestPerson(String firstName, String lastName, int age, boolean likeIceCreams) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.likeIceCreams = likeIceCreams;
    }

    public void introduceYourself() {
        System.out.println("Hi my name is " + firstName + " " + lastName);
    }

    public boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public void methodWithParameter(String parameter){
        System.out.println("Parameter: " + parameter);
    }

    public void methodWithParameter(String parameter, int number){
        System.out.println("Parameter: " + parameter + " Number: " + number);
    }
}
