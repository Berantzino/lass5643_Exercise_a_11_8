import java.util.HashSet;
import java.util.Set;

public class a_11_8 {

    /*
    8. Write a method minLength that accepts a set of strings as a parameter and that returns the length of the shortest
    string in the list. If your method is passed an empty set, it should return 0.
     */

    public static void main(String[] args) {

        Set<String> testSet1 = new HashSet<>();
        Set<String> testSet2 = new HashSet<>();

        testSet1.add("Jeg");
        testSet1.add("hedder");
        testSet1.add("Lasse");
        testSet1.add("Berantzino");

        System.out.println("Should return 3 ('Jeg'): " + minLength(testSet1));
        System.out.println("Should return 0, since the set is empty: " + minLength(testSet2));

    }

    public static int minLength(Set<String> set) {

        int minLength = 10000;

        for (String string : set) {

            if (string.length() < minLength) {

                minLength = string.length();
            }
        }

        if (set.isEmpty()) {

            minLength = 0;
        }

        return minLength;
    }
}
