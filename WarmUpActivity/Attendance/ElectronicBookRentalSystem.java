import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

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
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("System Analysis and Design", "Gary B. Shelly", 2015, 2));
        books.add(new Book("Android Application", "Corinne Hoisington", 2018, 3));
        books.add(new Book("Programming Concepts and Logic Formulation", "Rosauro E. Manuel", 2020, 4));

        Scanner scanner = new Scanner(System.in);

        boolean continueRenting = true;

        while (continueRenting) {
            System.out.println("ELECTRONIC BOOK RENTAL SYSTEM");
            System.out.println("*****************************");

            System.out.println();
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i+1) + " " + books.get(i).getTitle() + ", " + books.get(i).getAuthor());
            }

            System.out.println("*****************************");
            System.out.print("CHOOSE A NUMBER TO RENT YOUR FAVORITE BOOK: ");
            try {
                int index = scanner.nextInt() - 1;

                if (index < 0 || index >= books.size()) {
                    System.out.println("INDEX DOES NOT EXIST, Try Again!");
                } 
                else if (books.get(index).getCopies() == 0) {
                    System.out.println("SORRY, THIS BOOK IS OUT OF STOCK!");
                } 
                else {
                    books.get(index).setCopies(books.get(index).getCopies() - 1);
                    System.out.printf("You Rented %s. Rent Again? Y/N\n", books.get(index).getTitle());
                    String input = scanner.next();
                    if (!input.equalsIgnoreCase("Y")) {
                        continueRenting = false;
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("INDEX DOES NOT EXIST, Try Again!");
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("INVALID INPUT");
                scanner.nextLine();
            }
        }
        System.out.println("\nPROGRAM ENDS");
    }
}
