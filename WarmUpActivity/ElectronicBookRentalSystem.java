package warmup;

import java.util.Scanner;

class Book {
    
    private String title;
    private String author;
    private int year;
    private int copies;

    public Book(String title, String author, int year, int copies) {
        setTitle(title);
        setAuthor(author);
        setYear(year);
        setCopies(copies);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getCopies() {
        return copies;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}

public class ElectronicBookRentalSystem {
    public static void main(String[] args) {
        Book[] books = {
            new Book("System Analysis and Design", "Gary B. Shelly", 2007, 2),
            new Book("Android Application", "Corinne Hoisington", 2012, 3),
            new Book("Programming Concepts and Logic Formulation", "Rosauro E. Manuel", 2017, 4)
        };

        Scanner scanner = new Scanner(System.in);

        boolean continueRenting = true;

        while (continueRenting) {
            System.out.println("ELECTRONIC BOOK RENTAL SYSTEM");
            System.out.println("*****************************");
            
            System.out.println();
            for (int i = 0; i < books.length; i++) {

//                System.out.printf("%d %s, %s\n", i+1, books[i].getTitle(), books[i].getAuthor());
                System.out.println((i+1) + " " + books[i].getTitle() + ", " + books[i].getAuthor());
            }

            System.out.println("*****************************");
            System.out.print("CHOOSE A NUMBER TO RENT YOUR FAVORITE BOOK: ");
            int index = scanner.nextInt() - 1;

            if (index < 0 || index >= books.length) {
                System.out.println("INDEX DOES NOT EXIST, Try Again!");
            } 
            else if (books[index].getCopies() == 0) {
                System.out.println("SORRY, THIS BOOK IS OUT OF STOCK!");
            } 
            else {
                books[index].setCopies(books[index].getCopies() - 1);
                System.out.printf("You Rented %s. Rent Again? Y/N\n", books[index].getTitle());
                String input = scanner.next();
                if (!input.equalsIgnoreCase("Y")) {
                    continueRenting = false;
                }
            }
        }
        System.out.println("\nPROGRAM ENDS");
    }
}
