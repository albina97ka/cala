public class DepartmentHead extends Human {
    private String department;

    public DepartmentHead(String name, String surname, String patronymic, int birthYear, double salary, String department) {
        super(name, surname, patronymic, birthYear, salary);
        this.department = department;
    }

    public void talk() {
        System.out.println("I am the head of department " + department);
    }
}
