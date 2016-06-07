package main;

import cats.Cat;
import dogs.Dog;

abstract class Animal {

    private String name;
    private int weight;

       public void eatCat(Food food) {

        weight = +food.foodWeight;
        Cat out1 = new Cat();
        out1.doMeow();
    }

    public void eatDog(Food food) {

        weight = +food.foodWeight;
        Dog out2 = new Dog();
        out2.doBark();
    }

    public static void main(String[] args) { 

        Food doze = new Food(); 
        doze.getDozeWeight(); 
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

