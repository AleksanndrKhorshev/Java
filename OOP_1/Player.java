package OOP_1;

public class Player {
    private long id;
    private String name;
    private double damage;
    private double healthPoint;

    public Player(String name) {
        this.id = System.currentTimeMillis();
        this.name = name;
        this.damage = 10.0;
        this.healthPoint = 100.0;
    }

    public void attack(Player player) {
        player.takeDamage(this.damage);
    }

    public void takeDamage(double damage) {
        this.healthPoint -= damage;
    }

    public double getHealthPoint() {
        return this.healthPoint;
    }

    public String getName() {
        return this.name;
    }
}
