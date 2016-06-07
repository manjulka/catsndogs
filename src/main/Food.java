package main;


import java.util.Scanner;

public class Food extends Animal implements IFood {

    public static int foodWeight;

    public static int getDozeWeight(){

        Scanner in = new Scanner(System.in);
        foodWeight = in.nextInt();
        return foodWeight;
    }

}
