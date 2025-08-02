public class Main {
    public static void main(String[] args) {
        // Creating the Library object
        Library library = new Library();

        // Create some books and member objects

        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "123");

        Member member1 = new Member(101, "Aragorn");

        // add book and member to the library
        library.addBook(book1);
        library.addMember(member1);

        //Issue Book
        library.issueBook("123", 101);
        library.issueBook("123", 101);
        library.issueBook("456", 101);
        
        library.returnBook("123", 101);

    }
}
