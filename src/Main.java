import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>();

        // without stream
        for (Integer i : intList) {
            if (i > 0 && i % 2 == 0) {
                resultList.add(i);
                Collections.sort(resultList);
            }
        }

        // here we remove braces and comas from our list
        String formattedString = resultList.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
        System.out.println(formattedString);
    }
}