import java.util.*;

public class Library {
    private List<Book> books;
    private Map<Integer, Member> members;

    public Library(){
        this.books = new ArrayList<>();
        this.members = new HashMap<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void addMember(Member member){
        this.members.put(member.getMemberId(), member);
    }
}
