package baseOnArray;

import java.io.FileNotFoundException;

public class Start {
    public static void main(String[] args) throws FileNotFoundException {

        Animals base = new Animals();
        base.getBase();

        base.add("Big Cat", Size.BIG,"Russia", 15, 666666, 32, "11.12.04");

        base.printBase();
        System.out.println();
        base.find("cat");

//        base.remove(5);
//        base.printBase();
    }
}
