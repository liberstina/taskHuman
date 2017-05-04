package taskHuman;

/**
 * Created by Marinka on 25.04.2017.
 */
public class DemoClass {

    public static void main(String[] args) {
        Man.setHandsQty(2);
        Man.setLegsQty(2);
        Man.eat();
        Man.sleep();

        Woman.setHandsQty(2);
        Woman.setLegsQty(2);
        Woman.eat();
        Woman.sleep();

        Man johnny = new Man(23,"John", "lieutenant", 10);
        Man danny = new Man(27, "Dan","sergeant", 183);

            johnny.becomeSoldier();
            danny.becomeSoldier();
            danny.hammerShelf();

        Woman elly = new Woman(25, "Elly","Valentino", 23, false);
        Woman nelly = new Woman(25, "Nelly","Cavalli", 50, false);
        Woman pollianna = new Woman(25, "Polly","D&G", 53,  true);

            elly.epilateLegs();
            elly.makingUp();
            nelly.makingUp();
            pollianna.epilateLegs();
}
}
