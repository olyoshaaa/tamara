package Logic;

public class Animal {

    private String race;
    private String name;

    private int eat;
    private int toilet;
    private int health;

    public Animal() {



    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getRace() {return race;}
    public void setRace(String race) {this.race = race;}

    public int getEat() {return eat;}
    public int getToilet() {return toilet;}

    public int getHealth() {return health;}
    public void setEat(int eat) {this.eat = eat;}

    public void setToilet(int toilet) {this.toilet = toilet;}
    public void setHealth(int health) {this.health = health;}

}
