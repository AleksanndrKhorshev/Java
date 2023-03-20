package Less_6;

public class Cat {

    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = 0;

        Thread satietyManagementThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (satiety > 0) {
                    satiety=-1;
                } else {
                    System.out.println(name + " оголодал и ушел из дома");
                    System.exit(0);
                }
            }
        });
        satietyManagementThread.setDaemon(true);
        satietyManagementThread.start();
    }

    public void eat(Plate plate) {
        int foodEaten = plate.decreaseFood(appetite - satiety) ? appetite :0 ;
        satiety += foodEaten;
    }

    public boolean isSatiety() {
        return satiety >= appetite;
    }

    @Override
    public String toString() {
        return name + " {appetite=" + appetite + ", satiety=" + satiety + "}";
    }
}