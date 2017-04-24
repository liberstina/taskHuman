package taskHuman;

/**
 * Created by Marinka on 25.04.2017.
 */
public class Man {
    private int age;
    private String name;
    private int height;
    private String militaryRank;
    private int screwdriversAmount;

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

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public String getMilitaryRank(){
        return militaryRank;
    }
    public void setMilitaryRank(String militaryRank){
        this.militaryRank = militaryRank;
    }

    public int getScrewdriversAmount(){
        return screwdriversAmount;
    }
    public void setScrewdriversAmount(int screwdriversAmount){
        this.screwdriversAmount = screwdriversAmount;
    }

    public void eat(){

    }

    public void sleep(){

    }

    public void hammerShelf(){

    }

    public void becomeSoldier(){

    }

    public Man (String name, int height, String militaryRank){
        this.name = name;
        this.height = height;
        this.militaryRank = militaryRank;
        eat();
        sleep();
        becomeSoldier();
    }

    public Man (String name, int age, int screwdriversAmount){
        this.name = name;
        this.age = age;
        this.screwdriversAmount = screwdriversAmount;
        eat();
        sleep();
        hammerShelf();
    }


}
