public class Horse extends Animal {
    private String color;

    public Horse(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест сено");
    }

    @Override
    public void sleep() {System.out.println("Лошадь спит в стойло");}
}
