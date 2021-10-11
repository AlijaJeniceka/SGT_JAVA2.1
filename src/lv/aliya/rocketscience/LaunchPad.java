package lv.aliya.rocketscience;

public class LaunchPad {
    public static void main(String[] args) {

        Rocket rocket1 = new Rocket();
        System.out.println("There are so many rockets: " + Rocket.countRockets());

        //rocket1 = null;
        System.out.println("Name of the rocket: "+ rocket1.getName());
        System.out.println("Weight of the rocket: "+ rocket1.getWeight());
        Rocket rocket2 = rocket1;
        rocket1.setName("Starship");
        System.out.println("Name of the rocket: "+ rocket2.getName());

        System.out.println(rocket1.id);
        renameRocket(rocket1, "MoonRover");
        System.out.println("Name of the rocket: "+ rocket1.getName());
        changeTheWeight(rocket1.getWeight(), 1000);
        System.out.println("The weight of the rocket stayed the same outside the method: "+ rocket1.getWeight());
        Rocket rocket3 = new Rocket("Enterprise", "red", 100, 200, new Engine());
        rocket3.printRocketData();

        rocket3 = null;

        System.gc();

        System.out.println("Waiting for rocket to be destroyed. ");

    }

    /**
     * rename the rocket, changes the original object
     * @param rocket
     * @param newName
     */
    private static void renameRocket(Rocket rocket, String newName){
        rocket.setName(newName);
    }

    /**
     * change the weight locally
     * @param weight
     * @param newWeight
     */
    private static void changeTheWeight(int weight, int newWeight){
        weight = newWeight;
        System.out.println("Weight was changed locally to: " + weight);
    }
    private static void changeTheWeightCorrectly(){

    }
}
