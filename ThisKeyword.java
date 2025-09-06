class Book {
    String title;
    String author;

    // Method using 'this' to set details
    void setDetails(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        // First object
        Book b1 = new Book();
        b1.setDetails("Java Basics", "James Gosling");

        // Second object
        Book b2 = new Book();
        b2.setDetails("Python Fundamentals", "Guido van Rossum");

        // Print details of b1
        System.out.println("Book 1 Title: " + b1.title);
        System.out.println("Book 1 Author: " + b1.author);

        System.out.println();

        // Print details of b2
        System.out.println("Book 2 Title: " + b2.title);
        System.out.println("Book 2 Author: " + b2.author);
    }
}