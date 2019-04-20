package YandexTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Мария\\Documents\\GitHub\\LearningFiels_Java\\src\\YandexTest\\res\\Numbers.txt");
        Scanner scanner = new Scanner(file);
        List<TNumbers> inputNums = new ArrayList<>();

        while (scanner.hasNextLine()){
            TNumbers newNum = new TNumbers();
            newNum.setInputNum(scanner.nextLine());
            inputNums.add(newNum);
        }

        File file2 = new File("C:\\Users\\Мария\\Documents\\GitHub\\LearningFiels_Java\\src\\YandexTest\\res\\Templates.txt");
        Scanner scanner2 = new Scanner(file2);
        List<Templates> inputTemps = new ArrayList<>();

        while (scanner2.hasNextLine()){
            String[] parse = scanner2.nextLine().split("-");
            Templates newTemp = new Templates();
            newTemp.setInputNum(parse[0]);
            newTemp.setOperator(parse[1]);
            inputTemps.add(newTemp);
        }

        check(inputNums, inputTemps);

        for(TNumbers curr: inputNums){
            System.out.println(curr);
        }
    }


    static void check (List<TNumbers> nums, List<Templates> temps){

        for (Templates currTemp: temps){
            currTemp.setIndexOfSpace(currTemp.getInputNum().indexOf(" ") - 1);
            currTemp.setIndexOfFirstBkt(currTemp.getInputNum().indexOf("(") - 2);
            currTemp.setIndexOfSecondBkt(currTemp.getInputNum().indexOf(")") - 3);
        }

        for (TNumbers currNum: nums){
            for (Templates currTemp: temps){
                if (currNum.getInputNum().replaceAll("[^\\d]", "").startsWith(currTemp.getInputNum().replaceAll("[^\\d]", ""))) {
                    currNum.setOperator(currTemp.getOperator());
                    currNum.setIndexOfSpace(currTemp.getIndexOfSpace());
                    currNum.setIndexOfFirstBkt(currTemp.getIndexOfFirstBkt());
                    currNum.setIndexOfSecondBkt(currTemp.getIndexOfSecondBkt());
                }
            }
        }
    }
}
