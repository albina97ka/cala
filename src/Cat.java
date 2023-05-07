public class Cat extends Animal {
    private int livesLeft;

    public Cat(String food, String location, int livesLeft) {
        super(food, location);
        this.livesLeft = livesLeft;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу");
    }
}
