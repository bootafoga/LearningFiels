package TestTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Short> countOfCards = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 10000; i++) {
            short numOfT = 0;
            short numOfCards = 0;
            Set<Integer> cards = Generate.randArray(35, 35);

            for (Integer num: cards){
                numOfCards++;
                if (num == 8 || num == 17 || num == 26) numOfT++;
                if (numOfT == 2){
                    countOfCards.add(numOfCards);
                    break;
                }
            }
        }

        for (Short num: countOfCards){
            sum+= num;
        }

        System.out.println("Average value: " + sum / countOfCards.size());
    }
}