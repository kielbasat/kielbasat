package PRE_RESTassured;

import java.util.ArrayList;
import java.util.List;

public class NameList {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<String>();
        namesList.add("Bartek");
        namesList.add("Tomek");
        namesList.add("Janek");
        namesList.add("Rysiek");

        System.out.println(namesList.size());
        System.out.println(namesList.get(0));

        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }
        for (String name : namesList
        ) {
            System.out.println(name);

        }
    }
}
