package baseOnArray;

import java.io.FileNotFoundException;

public class Start {
    public static void main(String[] args) throws FileNotFoundException {

        Animals base = new Animals();
        base.getBase();

        base.add(7, "Big Cat", "Russia", 15, 666666, 32, "11.12.04");

        base.printBase();
    }
}
