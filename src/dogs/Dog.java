package dogs;


import java.util.Scanner;

public class Dog implements IDog extends Animal{
    public static String dogName;

    public void doBark(dogName){
        Scanner ind = new Scanner(System.in);
        dogName = ind.nextLine("Dog name: ");
        System.out.println("My name is " + dogName + ". Bark bark");
    }
}
