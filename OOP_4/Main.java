package OOP_4;

public class Main {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<GoldenApple> goldenAppleBox = new Box<>();

        appleBox.add(new Apple(1));
        //appleBox.add(new Orange(1)); // ошибка компиляции
        appleBox.add(new GoldenApple(4));
        System.out.println(appleBox.getWeight()); // 5.0

        //goldenAppleBox.add(new Apple(2)); // ошибка компиляции
        goldenAppleBox.add(new GoldenApple(2));
        System.out.println(goldenAppleBox.getWeight()); // 2.0

        goldenAppleBox.moveTo(appleBox);
        System.out.println(goldenAppleBox.getWeight()); // 0.0
        System.out.println(appleBox.getWeight()); // 7.0

        for (GoldenApple apple : goldenAppleBox) {
            System.out.println(apple.getWeight()); // выводит вес золотых яблок
        }
    }
}
