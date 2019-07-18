package TestTask;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;


public class Generate {
    public static Set<Integer> randArray(int countNums, int interval) {
        Random random = new Random();
        Set<Integer> generation = new LinkedHashSet<>();

        while (generation.size() != countNums){
            generation.add(random.nextInt(interval));
        }

        return generation;
    }
}