package taskHuman;

/**
 * Created by Marinka on 25.04.2017.
 */
public class Woman {
    private int age;
    private String name;
    private static int handsQty;
    private static int legsQty;
    private String favouriteBrand;
    private int amountLipstick;
    private boolean gaveBirth;

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
        Woman.handsQty = handsQty;
    }

    public static int getLegsQty() {
        return legsQty;
    }

    public static void setLegsQty(int legsQty) {
        Woman.legsQty = legsQty;
    }

    public boolean isGaveBirth() {
        return gaveBirth;
    }

    public void setGaveBirth(boolean gaveBirth) {
        this.gaveBirth = gaveBirth;
    }

    public String getFavouriteBrand(){
        return favouriteBrand;
    }
    public void setFavouriteBrand(String favouriteBrand){
        this.favouriteBrand = favouriteBrand;
    }

    public int getAmountLipstick(){
        return amountLipstick;
    }
    public void setAmountLipstick(int amountLipstick){
        this.amountLipstick = amountLipstick;
    }

    public static void eat(){
        System.out.println("I am eating. Yammy-yammy!");
    }

    public static void sleep(){
        System.out.println("I am sleeping. Zzzzzzz");
    }

    public void makingUp(){
        System.out.println("I become beautiful and young!");
    }

    public void epilateLegs(){
        System.out.println("My legs become smoothy");
    }

    public Woman (int age, String name, String favouriteBrand, int amountLipstick , boolean gaveBirth){
        this.age = age;
        this.name = name;
        this.favouriteBrand = favouriteBrand;
        this.gaveBirth = gaveBirth;
        this.amountLipstick = amountLipstick;
    }

    public Woman (int age, String name, String favouriteBrand, boolean gaveBirth){
        this.age = age;
        this.name = name;
        this.favouriteBrand = favouriteBrand;
        this.gaveBirth = gaveBirth;
    }

}

