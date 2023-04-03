package OOP_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T extends Fruit> implements Iterable<T> {

    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        if (fruits.isEmpty() || fruits.get(0).getClass() == fruit.getClass()) {
            fruits.add(fruit);
        } else {
            throw new IllegalArgumentException("Нельзя добавить фрукт другого типа в коробку");
        }
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void moveTo(Box<? super T> target) {
        if (fruits.isEmpty() || target.fruits.isEmpty()
                || fruits.get(0).getClass() == target.fruits.get(0).getClass()) {
            target.fruits.addAll(fruits);
            fruits.clear();
        } else {
            throw new IllegalArgumentException("Нельзя пересыпать фрукты разных типов");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return fruits.iterator();
    }
}
