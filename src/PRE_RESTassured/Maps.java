package PRE_RESTassured;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map<Integer, String> nameMap = new HashMap<Integer, String>();
        nameMap.put(1, "Tomek");
        nameMap.put(2, "Marcin");
        nameMap.put(3, "Stefan");

        System.out.println(nameMap.get(2));

        for (Map.Entry<Integer, String> entry : nameMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
