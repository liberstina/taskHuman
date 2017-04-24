package taskHuman;

/**
 * Created by Marinka on 25.04.2017.
 */
public class Woman {
    private int age;
    private String name;
    private int weight;
    private String favouriteBrand;
    private int amountLipstick;
    private boolean gaveBirth;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
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

    public void eat(){

    }

    public void sleep(){

    }

    public void makingUp(){

    }

    public void epilateLegs(){

    }

    public Woman (String name, int age, int amountLipstick){
        this.name = name;
        this.age = age;
        this.amountLipstick = amountLipstick;
        sleep();
        makingUp();
        epilateLegs();
    }

    public Woman (String name, int weight, String favouriteBrand, boolean gaveBirth){
        this.name = name;
        this.weight = weight;
        this.favouriteBrand = favouriteBrand;
        this.gaveBirth = gaveBirth;
        eat();
        sleep();
        makingUp();
    }

}

