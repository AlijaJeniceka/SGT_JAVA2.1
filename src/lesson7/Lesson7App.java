package lesson7;

import lv.aliya.rocketscience.Engine;

import java.util.ArrayList;

public class Lesson7App {
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip(new Engine(), "Escape Plan", 100  );
        //If you would like to add people already in constructor
        ArrayList<String> people = new ArrayList<>();
        people.add("Bezos");
        people.add("Musk");
        people.add("Brenson");

        PeopleSpaceShip peopleSpaceShip= new PeopleSpaceShip(new Engine(),"Elon", 100, 3, new ArrayList<>());

        peopleSpaceShip.getNamesOfPeople().add("Bezos");
        peopleSpaceShip.getNamesOfPeople().add("Musk");
        peopleSpaceShip.getNamesOfPeople().add("Brenson");

        //Add some Cargo.
        peopleSpaceShip.addCargo();
        //Should return Integer.
        peopleSpaceShip.addCargo(200);

        //Examples of overloading the methods
        System.out.println(100);
        System.out.println("String");
        System.out.println(peopleSpaceShip);


     //   System.out.println(peopleSpaceShip);
        printInfoAboutSpaceShip(spaceShip);
        printInfoAboutSpaceShip(peopleSpaceShip);
        // print just "Cargo Added
        SpaceShip spaceShip1 = new SpaceShip();
        spaceShip1.addCargo();

        //Will print
        SpaceShip spaceShip2 = new PeopleSpaceShip();
        spaceShip2.addCargo();
        //Upcasting
        SpaceShip castedSpacehip = (SpaceShip) peopleSpaceShip;


        //DownCasting
        PeopleSpaceShip castedPeopleSpaceShip = (PeopleSpaceShip) spaceShip;
        castedPeopleSpaceShip.getNamesOfPeople();
    }
    public static void printInfoAboutSpaceShip( SpaceShip spaceShip) {
        System.out.println("I have a SpaceShip: " + spaceShip);
    }
}
