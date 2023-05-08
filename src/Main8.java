public class Main8 {
    public static void main(String[] args) {
        reader[] readers = new reader[5];
        readers[0] = new reader("Никитин М. Р.", 1234, "ФМиИТ", "01.03.2000", "89645363756");
        readers[1] = new reader("Кузнецов Л. Д.", 5678, "ФНБ", "03.08.2002", "89654321305");
        readers[2] = new reader("Макеев Е. А.", 91011, "ФЭиУ", "03.12.2005", "89645738546");
        readers[3] = new reader("Цветкова Д. Д.", 12131, "ФК", "11.02.2000", "89681439054");
        readers[4] = new reader("Шапошников С. Д.", 15161, "ФД", "16.05.2004", "89626674521");

        readers[1].takeBook(3);
        readers[1].takeBook("Заир", "Маска", "Ревизор");

        readers[3].returnBook(4);
        readers[3].returnBook("Ромео и Джульетта", "Гамлет", "Ход королевы", "Обитель");
    }
}
