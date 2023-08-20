public class Author {
    private String nameAuthor;
    private String surNameAuthor;

    public Author (String nameAuthor, String surNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surNameAuthor = surNameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurNameAuthor() {
        return this.surNameAuthor;
    }
    @Override
    public String toString () {
        return nameAuthor + " " + surNameAuthor;
    }
    public boolean equals(Object oneObject) {
        if (this == oneObject) {
            return true;
        }
        if (oneObject == null || getClass() != oneObject.getClass()) {
            return false;
        }
        Author author = (Author) oneObject;
        return nameAuthor == author.nameAuthor && java.util.Objects.equals(surNameAuthor, author.surNameAuthor);
    }
    public int hashCode () {
        return java.util.Objects.hash(nameAuthor, surNameAuthor);
    }



}
