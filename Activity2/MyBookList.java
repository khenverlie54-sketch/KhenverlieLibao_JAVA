// Define the Book class to store book details.
class Book {
    String title;
    String author;
    int yearPublished;
    int currentPage;

    public Book(String title, String author, int yearPublished, int currentPage) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.currentPage = currentPage;
    }
}

public class MyBookList {
    public static Book[] books = new Book[5];

    // Method to display details of all books
    public static void displayDetails() {
        System.out.println("\n_____________________");
        System.out.println("|                   |");
        System.out.println("|    Books Lists    |");
        System.out.println("|                   |");
        System.out.println("_____________________\n");
        for (int i = 0; i < books.length; i++) {
            System.out.println("\nTitle: " + books[i].title
                    + ", Author: " + books[i].author
                    + ", Year: " + books[i].yearPublished
                    + ", Current Page: " + books[i].currentPage);
        }
    }

    // Method to change the current page of specific books
    public static void changePage() { 
        books[0].currentPage = 50;  // "Rich Dad Poor Dad" page set to 50
        books[2].currentPage = 100; // "Atomic Habits" page set to 100
        System.out.println("\n_____________________");
        System.out.println("|                   |");
        System.out.println("|    Updated Books  |");
        System.out.println("|                   |");
        System.out.println("_____________________\n");
        System.out.println("\nPage has been Updated for: \n");
        System.out.println("\nTitle: " + books[0].title
                + ", Author: " + books[0].author
                + ", Year: " + books[0].yearPublished
                + ", Current Page: " + books[0].currentPage);

        System.out.println("\nTitle: " + books[2].title
                + ", Author: " + books[2].author
                + ", Year: " + books[2].yearPublished
                + ", Current Page: " + books[2].currentPage);
    }

    // Method to update my favorite book's current page
    public static void updatemyFavoriteBookPage() {
        books[4].currentPage = 1; 
        System.out.println("\n_____________________");
        System.out.println("|                   |");
        System.out.println("|   Updated Books   |");
        System.out.println("|                   |");
        System.out.println("_____________________\n");
        System.out.println("\nPage has been Updated for: \n");
        System.out.println("\nTitle: " + books[4].title
                + ", Author: " + books[4].author
                + ", Year: " + books[4].yearPublished
                + ", Current Page: " + books[4].currentPage);
    }

    public static void main(String[] args) {
        // Creating an array of Book objects with different book details
        books[0] = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997, 0);
        books[1] = new Book("The Power of Habit", "Charles Duhigg", 2012, 0);
        books[2] = new Book("Atomic Habits", "James Clear", 2018, 0);
        books[3] = new Book("Java Programming", "John Doe", 2020, 0);
        books[4] = new Book("Monster", "Shogakukan", 2002, 0);

        // Displaying initial details of all books
        displayDetails();
        changePage(); // Changing page numbers for specific books
        updatemyFavoriteBookPage(); // Update and display favorite book page

        // Change author of "Java Programming" book and display updated details
        books[3].author = "Jane Smith";
       System.out.println("\n_____________________");
        System.out.println("|                   |");
        System.out.println("|   Updated Books   |");
        System.out.println("|                   |");
        System.out.println("_____________________\n");
        System.out.println("\nPage has been Updated for: \n");
        System.out.println("\nTitle: " + books[3].title
                + ", Author: " + books[3].author
                + ", Year: " + books[3].yearPublished
                + ", Current Page: " + books[3].currentPage);

        // Loop through the array and display titles of books published after 2010
        System.out.println("\n__________________________________________");
        System.out.println("|   Books that are published after 2010: |");
        System.out.println("__________________________________________\n");
        for (int i = 0; i < books.length; i++) {
            if (books[i].yearPublished > 2010) {
                System.out.println((i) + ".) " + books[i].title + "\n");
            }
        }
    }
}
