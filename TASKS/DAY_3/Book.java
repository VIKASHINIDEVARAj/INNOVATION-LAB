public class Book {
    String title;
    String author;
    public Book() {
        this.title = "LIFE";
        this.author = "VIKXX";
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String args[]) {
<<<<<<< HEAD
        Book book1 = new Book();  // Default Constructor
=======
        Book book1 = new Book(); 
>>>>>>> d4b784a1a2afeb66c2a26fd79cea05049f33afe4
        Book book2 = new Book("Little Women", "Louisa May Alcott");
        Book book3 = new Book("1984", "George Orwell");
        Book book4 = new Book("To Kill a Mockingbird", "Harper Lee");

    
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
    }
}
