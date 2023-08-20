public class Book {
    private String nameBook;
    private Author createAuthor;
    private int yearRelease;

    public Book(String nameBook, Author createAuthor, int yearRelease) {
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

    @Override
    public String toString() {
        return nameBook + " " + createAuthor + " " + yearRelease;
    }

    public boolean equals(Object oneObject) {
        if (this == oneObject) {
            return true;
        }
        if (oneObject == null || getClass() != oneObject.getClass()) {
            return false;
        }
        Book book = (Book) oneObject;
        return  yearRelease == book.yearRelease && java.util.Objects.equals(nameBook, book.nameBook) && java.util.Objects.equals(createAuthor, book.createAuthor);
    }

    public int hashCode() {
        return java.util.Objects.hash(nameBook, createAuthor, yearRelease);
    }


}

