public class Director extends Human {
    public Director(String name, int birthYear, int salary) {
        super(name, birthYear, salary);
    }

    @Override
    public void printInfo() {
        System.out.println("Директор: " + getName() + " родилась в " + getBirthYear() + " году и имеет зарплату " + getSalary() + " рублей.");
    }
}
