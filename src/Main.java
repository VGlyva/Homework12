
public class Main {
    public static void main(String[] args) {
        Author scaryAuthor = new Author("Стивен", "Кинг");
        Book scaryBook = new Book("Кладбище домашних животных", scaryAuthor, 1983);
        Author fantasyAuthor = new Author("Роберт", "Сальваторэ");
        Book fantasyBook = new Book("Темный Эльф", fantasyAuthor, 1990);
        System.out.println("Книга: " + scaryBook.getNameBook());
        System.out.println("Автор: " + scaryAuthor.getNameAuthor() + " " + scaryAuthor.getSurNameAuthor());
        System.out.println("Год выпуска: " + scaryBook.getYearRelease());
        System.out.println("=================");
        System.out.println("Книга: " + fantasyBook.getNameBook());
        System.out.println("Автор: " + fantasyAuthor.getNameAuthor() + " " + fantasyAuthor.getSurNameAuthor());
        System.out.println("Год выпуска: " + fantasyBook.getYearRelease());
        fantasyBook.setYearRelease(1991);
        System.out.println("Год выпуска: " + fantasyBook.getYearRelease());




    }
}