package Less6;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Cat[] cats = new Cat[] {
                new Cat("Barsik", 5),
                new Cat("Murzik", 8),
                new Cat("Vaska", 10),
                new Cat("Tom", 7),
                new Cat("Jerry", 6)
        };

        Plate plate = new Plate(150);

        while (!plate.isEmpty() && !allCatsAreSatiated(cats)) {
            for (Cat cat : cats) {
                if (!cat.isSatiety()) {
                    cat.eat(plate);
                    System.out.println(cat);
                }
            }
            Thread.sleep(1000);
            plate.increaseFood(15);
            System.out.println(plate);
        }
    }

    private static boolean allCatsAreSatiated(Cat[] cats) {
        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                return false;
            }
        }
        return true;
    }
}