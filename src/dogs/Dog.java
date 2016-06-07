package dogs;

import main.Animal;
import java.util.Scanner;

public class Dog extends Animal implements IDog{
    public String dogName;

    public void doBark(){
        Scanner ind = new Scanner(System.in);
        dogName = ind.nextLine();
        System.out.println("My name is " + dogName + ". Bark bark");
    }
}
