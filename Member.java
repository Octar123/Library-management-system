import java.util.*;

public class Member {
    private int memberId;
    private String name;
    private List<Book> borrowedBooks;

    // Constructor
    public Member(int memberId, String name){
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book){
        this.borrowedBooks.add(book);
    }

    //Getters
    public int getMemberId() { return memberId; }
    public String getName() { return name; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }
}
