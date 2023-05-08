public class reader {
    private String fullName;
    private int ticketNumber;
    private String faculty;
    private String birthDate;
    private String phoneNumber;

    public reader(String fullName, int ticketNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int booksCount) {
        System.out.println(fullName + " взял " + booksCount + " книги.");
    }

    public void takeBook(String... bookNames) {
        String booksStr = String.join(", ", bookNames);
        System.out.println(fullName + " взял книги: " + booksStr);
    }

    public void returnBook(int booksCount) {
        System.out.println(fullName + " вернул " + booksCount + " книги.");
    }

    public void returnBook(String... bookNames) {
        String booksStr = String.join(", ", bookNames);
        System.out.println(fullName + " вернул книги: " + booksStr);
    }
}