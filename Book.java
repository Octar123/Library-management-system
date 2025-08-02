public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    //Constructor
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    //Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return isbn; }
    public Boolean getIsAvailable() { return isAvailable; }

    //Setter for Availability
    public void setIsAvailable(boolean available){
        isAvailable = available;
    }
}
