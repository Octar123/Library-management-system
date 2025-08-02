import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner  = new Scanner(System.in);

        while(true){
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add a new Book");
            System.out.println("2. Add a new Member");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String isbn = scanner.nextLine();

                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    System.out.println("Book Added Successfully!");
                    break;
            
                case 2:
                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    Member newMember = new Member(id, name);
                    library.addMember(newMember);
                    System.out.println("Member Added Successfully!");
                    break;

                case 3:
                    System.out.print("Enter ISBN of book to issue: ");
                    String issueIsbn = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    int issueMemberId = scanner.nextInt();
                    scanner.nextLine();

                    library.issueBook(issueIsbn, issueMemberId);
                    break;

                case 4:
                    System.out.print("Enter ISBN of book to return: ");
                    String returnIsbn = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    int returnMemberId = scanner.nextInt();
                    scanner.nextLine();

                    library.returnBook(returnIsbn, returnMemberId);
                    break;

                case 5:
                    System.out.println("Exiting the Application, Thank you for using the sevice, GoodBye.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Please enter a number between 1 to 5.");
                    break;
            }
        }
    }
}
