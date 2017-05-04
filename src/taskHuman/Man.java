package taskHuman;

/**
 * Created by Marinka on 25.04.2017.
 */
public class Man {
    private int age;
    private String name;
    private static int handsQty;
    private static int legsQty;
    private String militaryRank;
    private int screwdriversAmount;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getHandsQty() {
        return handsQty;
    }

    public static void setHandsQty(int handsQty) {
        Man.handsQty = handsQty;
    }

    public static int getLegsQty() {
        return legsQty;
    }

    public static void setLegsQty(int legsQty) {
        Man.legsQty = legsQty;
    }

    public String getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(String militaryRank) {
        this.militaryRank = militaryRank;
    }

    public int getScrewdriversAmount() {
        return screwdriversAmount;
    }

    public void setScrewdriversAmount(int screwdriversAmount) {
        this.screwdriversAmount = screwdriversAmount;
    }

    public static void eat() {
        System.out.println("I am eating. Yammy-yammy!");
    }

    public static void sleep() {
        System.out.println("I am sleeping. Zzzzzzz");
    }

    public void hammerShelf() {
        System.out.println("Knock Knock. I am the master of the house");
    }

    public void becomeSoldier() {
        System.out.println("I'm in the army now");
    }

    public Man(int age, String name, String militaryRank) {
        this.age = age;
        this.name = name;
        this.militaryRank = militaryRank;
    }

    public Man(int age, String name, String militaryRank, int screwdriversAmount) {
        this.age = age;
        this.name = name;
        this.militaryRank = militaryRank;
        this.screwdriversAmount = screwdriversAmount;
    }


}
