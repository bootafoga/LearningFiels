package baseOnArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Animals{
    public static final int DIVIDING = 95;

    Animals(){
    }

    Animals(String name, Size size, String country, int age, int code, float weight, String dateOfBirth) {
        id = count + 1;
        this.name = name;
        this.size = size;
        this.country = country;
        this.age = age;
        this.code = code;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }

    public void getBase() throws FileNotFoundException {
        File file = new File("C:\\Users\\Мария\\IdeaProjects\\LearningFiels\\src\\baseOnArray\\resources\\input.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            String[] parseArr = str.split(";");

            arrayOfAnimals.add(new Animals(parseArr[0], Size.valueOf(parseArr[1]), parseArr[2], Integer.parseInt(parseArr[3]),
                    Integer.parseInt(parseArr[4]),Float.parseFloat(parseArr[5]),parseArr[6] ));
            count++;
        }
    }

    public void add(String name, Size size, String country, int age, int code, float weight, String dateOfBirth){
       arrayOfAnimals.add(new Animals(name, size, country, age, code, weight, dateOfBirth));

    }

    public void remove(int id){
        for (int i = 0; i < count; i++){
            if (id == arrayOfAnimals.get(i).id) arrayOfAnimals.remove(i);
         }
    }

    public void find(int id){
       boolean flag = false;
       System.out.println("Result of search by id:");
       printDividing();
       printTitle();
       printDividing();
       for (int i = 0; i < count; i++){
           if (id == arrayOfAnimals.get(i).id) {
               printItems(i);
               flag = true;
           }
       }
       if (!flag) System.out.println("NO MATCHES");
       printDividing();
   }

    public void find(Size size){
        boolean flag = false;
        System.out.println("Result of search by size:");
        printDividing();
        printTitle();
        printDividing();
        for (int i = 0; i < count; i++){
            if (size == arrayOfAnimals.get(i).size) {
                printItems(i);
                flag = true;
            }
        }
        if (!flag) System.out.println("NO MATCHES");
        printDividing();
    }

    public void find(String name){
        boolean flag = false;
        System.out.println("Result of search by name:");
        printDividing();
        printTitle();
        printDividing();
        for (int i = 0; i < count; i++){
            if (name.equalsIgnoreCase(arrayOfAnimals.get(i).name) ) {
                printItems(i);
                flag = true;
            }
        }
        if (!flag) System.out.println("NO MATCHES");
        printDividing();
    }

    public void printDividing(){
        for (int i = 0; i < DIVIDING; i++) System.out.print("=");
        System.out.println();
    }

    public void printTitle(){
        System.out.printf("%5s", "id" );
        System.out.printf("%-20s", " || Name");
        System.out.printf("%-15s", " || Size");
        System.out.printf("%-15s", " || Country");
        System.out.printf("%-6s", " || Age");
        System.out.printf("%-10s", " || Code");
        System.out.printf("%-8s", " || Weight");
        System.out.printf("%-10s", " || Birthday");
        System.out.println();
    }

    public void printItems(int i){
            System.out.printf("%5s", arrayOfAnimals.get(i).id);
            System.out.printf("%-20s", " || " + arrayOfAnimals.get(i).name);
            System.out.printf("%-15s", " || " + arrayOfAnimals.get(i).size);
            System.out.printf("%-15s", " || " + arrayOfAnimals.get(i).country);
            System.out.printf("%-7s", " || " + arrayOfAnimals.get(i).age);
            System.out.printf("%-10s", " || " + arrayOfAnimals.get(i).code);
            System.out.printf("%-10s", " || " + arrayOfAnimals.get(i).weight);
            System.out.printf("%-10s", " || " + arrayOfAnimals.get(i).dateOfBirth);
        System.out.printf("%-10s", " || " + arrayOfAnimals.get(i).dateOfBirth);
            System.out.println();
    }

    public void printBase(){
        printDividing();
        printTitle();
        printDividing();
        for (int i = 0; i < arrayOfAnimals.size(); i++) printItems(i);
        printDividing();
    }

    private ArrayList<Animals> arrayOfAnimals = new ArrayList<>();
    private int id;
    private String name;
    private Size size;
    private String country;
    private int age;
    private int check;
    private int code;
    private float weight;
    private String dateOfBirth;
    private static int count;
}

