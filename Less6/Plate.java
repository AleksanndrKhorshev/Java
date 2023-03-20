package Less6;

public class Plate {

    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int foodToDecrease) {
        if (food >= foodToDecrease) {
            food -= foodToDecrease;
            return true;
        }
        return false;
    }

    public void increaseFood(int amount) {
        food += amount;
    }

    public boolean isEmpty() {
        return food == 0;
    }

    @Override
    public String toString() {
        return "Plate[" + food + "]";
    }
}