package OOP_1;

public class Archmage extends Player {
    private double healFraction;
    private double healthPoint;
    private double damage;

public Archmage(String name) {
    super(name);
    this.healFraction = 0.2;
}

@Override
public void attack(Player player) {
    super.attack(player);
    this.healthPoint += this.damage * this.healFraction;
    }
}