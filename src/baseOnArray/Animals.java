package baseOnArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Animals{
    private final int value = 81;

    Animals(){
    }

    Animals(int id, String name, String country, int age, int code, float weight, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.age = age;
        this.code = code;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }

    public void getBase() throws FileNotFoundException {
        File file = new File("C:\\Users\\Мария\\IdeaProjects\\LearningFiels\\src\\baseOnArray\\resources\\input.txt");
        Scanner scanner = new Scanner(file);

        arrayOfAnimals = new ArrayList<>();

        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            String[] parseArr = str.split(";");

            arrayOfAnimals.add(new Animals(Integer.parseInt(parseArr[0]), parseArr[1], parseArr[2], Integer.parseInt(parseArr[3]),
                    Integer.parseInt(parseArr[4]),Float.parseFloat(parseArr[5]),parseArr[6] ));
        }
    }

   public void add(int id, String name, String country, int age, int code, float weight, String dateOfBirth){
       arrayOfAnimals.add(new Animals(id, name, country, age, code, weight, dateOfBirth));

   }

    public void printDel(){
        for (int i = 0; i < value; i++) System.out.print("=");
        System.out.println();
    }

    public void printTitle(){
        System.out.printf("%5s", "Age" );
        System.out.printf("%-20s", " || Name");
        System.out.printf("%-15s", " || Country");
        System.out.printf("%-6s", " || Age");
        System.out.printf("%-10s", " || Code");
        System.out.printf("%-8s", " || Weight");
        System.out.printf("%-10s", " || Birthday");
        System.out.println();
    }

    public void printItems(){
        for (int i = 0; i < arrayOfAnimals.size(); i++){
            System.out.printf("%5s", arrayOfAnimals.get(i).id);
            System.out.printf("%-20s", " || " + arrayOfAnimals.get(i).name);
            System.out.printf("%-15s", " || " + arrayOfAnimals.get(i).country);
            System.out.printf("%-7s", " || " + arrayOfAnimals.get(i).age);
            System.out.printf("%-10s", " || " + arrayOfAnimals.get(i).code);
            System.out.printf("%-10s", " || " + arrayOfAnimals.get(i).weight);
            System.out.printf("%-10s", " || " + arrayOfAnimals.get(i).dateOfBirth);
            System.out.println();
        }
    }

    public void printBase(){
        printDel();
        printTitle();
        printDel();
        printItems();
        printDel();
    }

    private ArrayList<Animals> arrayOfAnimals;
    private int id;
    private String name;
    private String country;
    private int age;
    private int code;
    private float weight;
    private String dateOfBirth;
}

