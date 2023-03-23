package OOP_1;
public class Tank extends Player {
    private double armor;
    private double damage;


public Tank(String name) {
    super(name);
    this.armor = 0.3;
}

@Override
public void attack(Player player) {
    double damage = this.damage * (1 - this.armor);
    player.takeDamage(damage);
}
}
