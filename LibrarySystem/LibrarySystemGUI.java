package librarysystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LibrarySystemGUI extends JFrame implements ActionListener {

    private final ArrayList<Book> books;
    private final JLabel titleLabel;
    private final JLabel authorLabel;
    private final JLabel yearLabel;
    private final JLabel copiesLabel;
    private final JComboBox<String> bookComboBox;
    private final JButton rentButton;
    private final JButton exitButton;
    private final JButton loginButton;
    private final JTextField usernameField;
    private final JPasswordField passwordField;
    private User currentUser;

    public LibrarySystemGUI() {
        super("Electronic Book Rental System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        books = new ArrayList<>();
        books.add(new Book("System Analysis and Design", "Gary B. Shelly", 2015, 2));
        books.add(new Book("Android Application", "Corinne Hoisington", 2018, 3));
        books.add(new Book("Programming Concepts and Logic Formulation", "Rosauro E. Manuel", 2020, 4));

        JPanel titlePanel = new JPanel();
        titleLabel = new JLabel("Choose a Book to Rent");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 18));
        titlePanel.add(titleLabel);

        JPanel bookPanel = new JPanel(new GridLayout(4, 1));
        authorLabel = new JLabel("Author: ");
        yearLabel = new JLabel("Year: ");
        copiesLabel = new JLabel("Copies: ");
        bookComboBox = new JComboBox<>();
        for (Book book : books) {
            bookComboBox.addItem(book.getTitle());
        }
        bookComboBox.addActionListener(this);
        bookPanel.add(bookComboBox);
        bookPanel.add(authorLabel);
        bookPanel.add(yearLabel);
        bookPanel.add(copiesLabel);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        rentButton = new JButton("Rent");
        rentButton.addActionListener(this);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        buttonPanel.add(rentButton);
        buttonPanel.add(exitButton);

        JPanel loginPanel = new JPanel(new GridLayout(3, 2));
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(new JLabel(""));
        loginPanel.add(loginButton);

        add(titlePanel, BorderLayout.NORTH);
        add(bookPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(loginPanel, BorderLayout.WEST);

        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bookComboBox) {
            int index = bookComboBox.getSelectedIndex();
            Book book = books.get(index);
            authorLabel.setText("Author: " + book.getAuthor());
            yearLabel.setText("Year: " + book.getYear());
            copiesLabel.setText("Copies: " + book.getCopies());
        } else if (e.getSource() == rentButton) {
            int index = bookComboBox.getSelectedIndex();
            Book book = books.get(index);
            if (book.getCopies() > 0) {
                book.setCopies(book.getCopies() - 1);
                books.set(index, book); // update the list of books
                JOptionPane.showMessageDialog(this, "You rented " + book.getTitle() + ".", "Success", JOptionPane.INFORMATION_MESSAGE);
                copiesLabel.setText("Copies: " + book.getCopies()); // update the GUI
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, this book is out of stock!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == exitButton) {
            dispose();
        }
    }

        public static void main(String[] args) {
        new LibrarySystemGUI();
    }
}

    
