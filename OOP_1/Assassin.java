package OOP_1;
public class Assassin extends Player {
    private double dodgeChance;

    public Assassin(String name) {
        super(name);
        this.dodgeChance = 0.2;
    }
    
    @Override
    public void attack(Player player) {
        if (Math.random() >= this.dodgeChance) {
            super.attack(player);
        }
    }
}
