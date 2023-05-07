public class reader {
    private String fullName;
    private int cardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public reader(String fullName, int cardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(this.fullName + " взял " + numberOfBooks + " книги.");
    }

    public void takeBook(String... bookTitles) {
        String bookList = String.join(", ", bookTitles);
        System.out.println(this.fullName + " взял книги: " + bookList);
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(this.fullName + " вернул " + numberOfBooks + " книги.");
    }

    public void returnBook(String... bookTitles) {
        String bookList = String.join(", ", bookTitles);
        System.out.println(this.fullName + " вернул книги: " + bookList);
    }
}
