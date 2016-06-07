package main;


import java.util.Scanner;

public class Food extends Animal implements IFood {

    public int foodWeight;

    public int getDozeWeight(){

        Scanner in = new Scanner(System.in);
        foodWeight = in.nextInt();
        return foodWeight;
    }

}
