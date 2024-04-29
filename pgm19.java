import java.util.Scanner;

abstract class Publisher {
    String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}

class Book extends Publisher {
    String title;
    String author;
    float price;

    public Book(String name, String title, String author, float price) {
        super(name);
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Publisher: " + getName());
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Literature extends Book {
    String genre;

    public Literature(String name, String title, String author, float price, String genre) {
        super(name, title, author, price);
        this.genre = genre;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Genre: " + genre);
    }
}

class Fiction extends Book {
    String subgenre;

    public Fiction(String name, String title, String author, float price, String subgenre) {
        super(name, title, author, price);
        this.subgenre = subgenre;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subgenre: " + subgenre);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter publisher name: ");
        String publisherName = scanner.nextLine();

        System.out.print("Enter number of books: ");
        int numBooks = scanner.nextInt();

        Publisher[] books = new Publisher[numBooks];

        for (int i = 0; i < numBooks; i++) {
            System.out.println("\nEnter details for book " + (i + 1) + ":");
            scanner.nextLine(); 
            System.out.print("Type (Literature/Fiction): ");
            String type = scanner.nextLine();
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            float price = scanner.nextFloat();
            scanner.nextLine(); 

            if (type.equalsIgnoreCase("Literature")) {
                System.out.print("Genre: ");
                String genre = scanner.nextLine();
                books[i] = new Literature(publisherName, title, author, price, genre);
            } else if (type.equalsIgnoreCase("Fiction")) {
                System.out.print("Subgenre: ");
                String subgenre = scanner.nextLine();
                books[i] = new Fiction(publisherName, title, author, price, subgenre);
            }
        }

        System.out.println("\nDetails of all books:");
        for (Publisher book : books) {
            book.display();
        }

        scanner.close();
    }
}
