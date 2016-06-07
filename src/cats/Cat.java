package cats;

import java.util.Scanner;

public class Cat implements ICat extends Animal {

    public static String catName;


    public static void doMeow(){

        Scanner inc = new Scanner(System.in);
        catName = inc.nextLine("Cat name: ");
        System.out.println("My name is " + catName + ". Meow meow");
    }

}