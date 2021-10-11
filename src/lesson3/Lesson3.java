package lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        Rocketship ship = new Rocketship();
        ship.fly(10);

        bird Bird = new bird();
        Bird.fly(1);

        Penguin penguin = new Penguin();
        penguin.fly(10);
        penguin.walk(5);
        if (penguin instanceof Penguin){
            System.out.println("Penguin is a Penguin");
        }
        if (penguin instanceof bird) {
            System.out.println("Penguin is a bird");
        }
        //  if (penguin instanceof Rocketship){
        //      System.out.println("Penguin cannot be a rocketship");
        // }
        Statics statics = new Statics();
        System.out.println(statics.getName());
        System.out.println("Surname: " + statics.getSurname());

    }

//    public static String boop(){
//        return WorldLibrary.getName();
//    }



}
enum RocketTypes{
    BEZOS,
    MUSK,
    BRANSON

}

interface CanFlyInterface{
    boolean fly(int speed);
}

class Rocketship implements CanFlyInterface{

    @Override
    public boolean fly(int speed) {
        System.out.println("Whoooosh, I am flyuing!");
        return false;
    }
}

class bird implements CanFlyInterface{

    @Override
    public boolean fly(int speed) {
        System.out.println("Chirp, chirp!");
        return false;
    }
}
class Penguin extends bird {
    public boolean walk(int speed) {
        System.out.println("Quack, Quack!");
        return true;
    }
}
