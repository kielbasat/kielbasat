package PRE_RESTassured;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> namesSet = new HashSet<String>();
        namesSet.add("Rysio");
        namesSet.add("Zdzisio");
        namesSet.add("Patryś");

        System.out.println(namesSet.size());
        for (String set : namesSet) {
            System.out.println(set);
        }
    }
}