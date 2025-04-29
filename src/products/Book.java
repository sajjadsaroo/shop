package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;
    private static int counter = 1;


    public Book(Double price, String title, String author, String publication, String genre) {
        super(title, price);

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        String baseString = super.toString();
        return baseString + " ,Author=" + getAuthor() + " ,Publication=" + getPublication() + " ,Genre=" + getGenre();
    }

    @Override
    protected String generateId() {
        if (counter > 999)
            throw new IllegalStateException("Book ID limit reached");
        return "1" + String.format("%03d", counter++);
    }

}
