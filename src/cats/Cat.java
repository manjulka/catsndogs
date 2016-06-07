package cats;

import java.util.Scanner;
import main.Animal;

public class Cat extends Animal implements ICat {

    public String catName;


    public void doMeow(){

        Scanner inc = new Scanner(System.in);
        catName = inc.nextLine();
        System.out.println("My name is " + catName + ". Meow meow");
    }

}
