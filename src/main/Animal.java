package main;

import cats.*;
import dogs.*;
import main.Food;

abstract class Animal {

    private String name;
    private int weight;

    public void eatCat(main.Food.foodWeight) {

         weight = +main.Food.foodWeight;
         Animal out1 = new Animal(); 
        out1.doMeow();  
    }

    public void eatDog(main.Food.foodWeight) {  

        weight = +main.Food.foodWeight; 
        Animal out2 = new Animal(); 
        out2.dogs.Dog.doBark();  
    }

    public static void main(String[] args) { 

        Animal doze = new Animal(); 
        doze.Food.getDozeWeight(); 
        Animal cat1 = new Animal(); 
        Animal dog1 = new Animal(); 
        cat1.name = cats.Cat.catName; 
        dog1.name = dogs.Dog.dogName; 
        cat1.weight = 3000; 
        dog1.weight = 6000; 
        cat1.eatCat(main.Food.foodWeight); 
        dog1.eatDog(main.Food.foodWeight); 
    }




}

