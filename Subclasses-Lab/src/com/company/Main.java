package com.company;


/* Create an Animal class with the following properties set in the constructor: mNumLegs, mTopSpeed, mIsEndangered, mName.
Create subclasses of Animal called Mammal and Reptile
Create at least one subclass of Mammal, and one subclass of Reptile
Each subclass must have something that makes it unique from its parent class.
Create a main method that instantiates each class and prints out its details. */

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal(4, 15, false, "Flying Squirrel");
        Animal animal2 = new Animal(2, 40, true, "Velociraptor");
        Animal animal3 = new Animal(4, 8, true, "Triceratops");
        Animal animal4 = new Animal(4, 3, false, "Turtle");
        Animal animal5 = new Animal(2, 19, true, "Manatee");

        FlyingSquirrel flyingSquirrel1 = new FlyingSquirrel(true, 4, 15, false, "Flying Squirrel");
        Velociraptor velociraptor1 = new Velociraptor(true, 2, 40, true, "Velociraptor");
        Triceratops triceratops1 = new Triceratops(true, 4, 8, true, "Triceratops");
        Turtle turtle1 = new Turtle(true, 4, 3, false, "Turtle");
        Manatee manatee1 = new Manatee(false, 2, 19, true, "Manatee");


        System.out.println(flyingSquirrel1.getFlyingSquirrel());
        System.out.println(velociraptor1.getVelociraptor());
        System.out.println(triceratops1.getTriceratops());
        System.out.println(turtle1.getTurtle());
        System.out.println(manatee1.getManatee());
    }
}
