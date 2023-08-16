public class Book {
    private String nameBook;
    private Author createAuthor;
    private int yearRelease;

    public Book (String nameBook, Author createAuthor, int yearRelease) {
        this.nameBook = nameBook;
        this.createAuthor = createAuthor;
        this.yearRelease = yearRelease;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getCreateAuthor() {
        return this.createAuthor;
    }

    public int getYearRelease() {
        return this.yearRelease;
    }
    public void setYearRelease(int year) {
        this.yearRelease = year;
    }

}

