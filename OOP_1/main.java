package OOP_1;

public class main {
    public static void main(String[] args) {
        Player player1 = new Player("Игрок 1");
        Tank tank = new Tank("Танк");
        Assassin assassin = new Assassin("Ассасин");
        Archmage archmage = new Archmage("Архимаг");

        System.out.println("Бой начинается!");
    System.out.println(player1.getName() + " атакует " + tank.getName() + "!");
    player1.attack(tank);
    System.out.println(tank.getName() + " имеет " + tank.getHealthPoint() + " здоровья.");

    System.out.println(assassin.getName() + " атакует " + tank.getName() + "!");
    assassin.attack(tank);
    System.out.println(tank.getName() + " имеет " + tank.getHealthPoint() + " здоровья.");

    System.out.println(archmage.getName() + " атакует " + assassin.getName() + "!");
    archmage.attack(assassin);
    System.out.println(assassin.getName() + " имеет " + assassin.getHealthPoint() + " здоровья.");
 }
}
