package containers;


import java.util.*;

abstract class Animals{
    static ArrayList<Animals> getAnimals(int count){
       Random random = new Random();
       ArrayList<Animals> animals = new ArrayList<>();

       for(int i = 0; i < count; i++){
           switch (random.nextInt(5)){
               case 0: animals.add(new Cat()); break;
               case 1: animals.add(new Dog()); break;
               case 2: animals.add(new Rabbit()); break;
               case 3: animals.add(new Bird()); break;
               case 4: animals.add(new Fish()); break;
           }
       }
       return animals;
   }
}

class Cat extends Animals{
    @Override
    public String toString() {
        return "Cat";
    }
}

class Dog extends Animals{
    @Override
    public String toString() {
        return "Dog";
    }
}

class Rabbit extends Animals{
    @Override
    public String toString() {
        return "Rabbit";
    }
}

class Bird extends Animals{
    @Override
    public String toString() {
        return "Bird";
    }
}

class Fish extends Animals{
    @Override
    public String toString() {
        return "Fish";
    }
}



public class Containers {

    public static void main(String[] args) {
        Random random = new Random();
        List<Animals> animals = Animals.getAnimals(5);
        System.out.println("1. Generate list of animals: \n" + animals);

        Bird bird1 = new Bird();
        animals.add(bird1);
        System.out.println("2. Add a Bird1 to list: \n" + animals);
        System.out.println("3. Check that list includes Bird1: \n" + animals.contains(bird1));

        animals.remove(bird1);
        System.out.println("4. Remove Bird1: \n" + animals);
        System.out.println("5. Check that list includes Bird1 now: \n" + animals.contains(bird1));
        Animals one = animals.get(1);

        System.out.println("6. Get animal by index 0, show index: \n" + animals.get(0) + " = " + animals.indexOf(animals.get(0)));
        Animals cat = new Cat();
        System.out.println("7. Show index of another object not included in list: \n" + animals.indexOf(cat));
        System.out.println("8. Try to remove it: \n" + animals.remove(cat));
        System.out.println("9. Try to remove first animal: \n" + animals.remove(animals.get(0)));
        System.out.println("10. List now: \n" + animals);

        animals.add(0, new Dog());
        System.out.println("11. Add by index 0 new Dog: \n" + animals);

        List<Animals> subList = animals.subList(1,3);
        System.out.println("12. Generate second list from a part of list 1-3: \n" + subList);
        System.out.println("13. Check that first list includes second list: \n" + animals.containsAll(subList));

        animals.removeAll(subList);
        System.out.println("14. After remove second list: \n" + animals);
        animals.set(0, new Fish());
        System.out.println("15. After set in first position a Fish: \n" + animals);
        List<Animals> second = new ArrayList<>();
        second.add(new Dog());
        second.add(new Fish());
        animals.addAll(1, second);
        System.out.println("15. After add in first position new elems: \n" + animals);
    }
}
