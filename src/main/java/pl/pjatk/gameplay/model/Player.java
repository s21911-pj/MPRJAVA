package pl.pjatk.gameplay.model;

public class Player {
    private int id;
    private String name;
    private int damage;
    private int health;

    public Player(int id, String name, int attack, int health) {
        this.id = id;
        this.name = name;
        this.damage = attack;
        this.health = health;
    }

    public Player(String name, int attack, int health) {
        this.name = name;
        this.damage = attack;
        this.health = health;
    }

    public Player() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return damage;
    }

    public void setAttack(int attack) {
        this.damage = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
