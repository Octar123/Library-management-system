public class Main {
    public static void main(String[] args) {
        // Creating the Library object
        Library library = new Library();

        // Create some books and member objects

        Book book1 = new Book();
        book1.setISBN("978-0321765723");
        book1.setTitle("The Lord of the Rings");
        book1.setAuthor("J.R.R. Tolkien");

        Member member1 = new Member();
        member1.setMemberId(101);
        member1.setName("Aragorn");

        // add book and member to the library
        library.addBook(book1);
        library.addMember(member1);

        //Print
        Book foundBook = library.findBookByISBN("978-0321765723");
        Member foundMember = library.findMemberBYId(101);

        System.out.println("Found Book: " + foundBook.getTitle());
        System.out.println("Found Member: " + foundMember.getName());
    }
}
