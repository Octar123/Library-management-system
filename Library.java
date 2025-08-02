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
}
