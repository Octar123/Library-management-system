import java.util.*;

public class Library {
    private List<Book> books;
    private Map<Integer, Member> members;

    public Library(){
        this.books = new ArrayList<>();
        this.members = new HashMap<>();
    }

    /// Method to add Books
    public void addBook(Book book){
        this.books.add(book);
    }


    /// Method to Add Members
    public void addMember(Member member){
        this.members.put(member.getMemberId(), member);
    }

    /// Method to find member
    public Member findMemberBYId(int memberId){
        return this.members.get(memberId);
    }

    /// Method to find book
    public Book findBookByISBN(String isbn){
        for(Book book : this.books){
            if(book.getISBN().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    // issue book logic
    public void issueBook(String isbn, int memberId){
        Book book = findBookByISBN(isbn);
        Member member = findMemberBYId(memberId);

        if(book == null){
            System.out.println("Error: Book with ISBN " + isbn + " not found.");
            return;
        }
        if(member == null){
            System.out.println("Error: Member with ID " + memberId + " not found.");
            return;
        }

        if(!book.getIsAvailable()){
            System.out.println("Error: Book '" + book.getTitle() + "' is already cheackd out.");
            return;
        }

        book.setIsAvailable(false);
        member.borrowBook(book);
        System.out.println("Success: '" + book.getTitle() + "' has been issued to " + member.getName() + ".");
    }

    public void returnBook(String isbn, int memberId){
        Book book = findBookByISBN(isbn);
        Member member = findMemberBYId(memberId);

        if(book == null || member == null){
            System.out.println("Invalid Book or Member details.");
            return;
        }

        if(!member.getBorrowedBooks().contains(book)){
            System.out.println("Error: " + member.getName() + " did not borrow this book.");
            return;
        }

        book.setIsAvailable(true);
        member.returnBook(book);
        System.out.println("Success: '" + book.getTitle() + "' has been returned by " + member.getName() + ".");
    }
}
