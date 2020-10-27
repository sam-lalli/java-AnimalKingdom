package animalkingdom;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<Animal> animalList = new ArrayList<Animal>();

        animalList.add(new Mammals("Panda", 1869));
        animalList.add(new Mammals("Zebra", 1778));
        animalList.add(new Mammals("Koala", 1816));
        animalList.add(new Mammals("Sloth", 1804));
        animalList.add(new Mammals("Armadillo", 1758));
        animalList.add(new Mammals("Raccoon", 1758));
        animalList.add(new Mammals("Bigfoot", 2021));

        animalList.add(new Birds("Pigeon", 1837));
        animalList.add(new Birds("Peacock", 1821));
        animalList.add(new Birds("Toucan", 1758));
        animalList.add(new Birds("Parrot", 1824));
        animalList.add(new Birds("Swan", 1758));

        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Catfish", 1815));
        animalList.add(new Fish("Perch", 1758));

        
        //decending order by year
        animalList.sort((a1, a2) -> (a1.getYearNamed() < a2.getYearNamed() ? 1 : -1));
        System.out.println(animalList);
        // WORKS


        //alphabetically
        // Collections.sort(animalList);
        // animalList.sort((a1, a2) -> compare(a1.getName(), a2.getName(() ? 1 : -1));
        // animalList.forEach(a -> System.out.println(a.getName()));
        ////BROKENNNNNN BROKENNNN//


        //only breath with lungs
        printFilteredList(animalList, (a) -> a.breath() == "lungs");
        //WORKS

        //breaths with lungs and named in 1758
        printFilteredList(animalList, (a) -> a.breath() == "lungs" && a.getYearNamed() == 1758);
        //WORKS

        //animals named in year 1758
        printFilteredList(animalList, (a) -> a.getYearNamed() == 1758);
        //Works




    }


    public static void printFilteredList(List<Animal> animalList, AnimalTester animalTester) {
        for (Animal a : animalList) {
            if (animalTester.test(a)) {
                System.out.println(a);
            }
        }
    }
}