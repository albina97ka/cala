public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("корм", "дом", "корги");
        Cat cat = new Cat("корм", "квартира", 9);
        Horse horse = new Horse("корм", "стойло", "коричневый");

        Veterinarian vet = new Veterinarian();
        vet.treatAnimal(dog);
        vet.treatAnimal(cat);
        vet.treatAnimal(horse);
    }
}
