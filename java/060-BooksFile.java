import java.util.*;
import java.io.*;   // Necesario para leer y escribir ficheros
import java.util.Objects;

class BooksFile {

    // Nombre del fichero donde guardaremos los datos
    private static final String FILE_NAME = "books.txt";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Book> books = new HashSet<>();

        // Cargar datos del fichero (si existe)
        loadBooksFromFile(books);

        boolean finished = false;
        while (!finished) {
            System.out.println("1 - Add a new book");
            System.out.println("2 - Display all books");
            System.out.println("3 - Search in books");
            System.out.println("0 - Exit");

            String option = sc.nextLine();
            switch(option) {
                case "1": // Add
                    System.out.println("Enter the id: ");
                    String id = sc.nextLine();
                    System.out.println("Enter the title: ");
                    String title = sc.nextLine();
                    System.out.println("Enter the author: ");
                    String author = sc.nextLine();
                    books.add(new Book(id, title, author));
                    break;

                case "2":  // Display all
                    if (books.isEmpty()) {
                        System.out.println("No books to display");
                    } else {
                        for (Book b : books) {
                            System.out.println(b);
                        }
                    }
                    break;

                case "3":  // Search
                    System.out.println("Enter the search string: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (Book b : books) {
                        if (b.toString().toUpperCase().contains(search.toUpperCase())) {
                            System.out.println(b);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Not found");
                    }
                    break;

                case "0":
                    finished = true;
                    break;
            }
        }

        // Guardar los datos al salir
        saveBooksToFile(books);
        System.out.println("Books saved. Goodbye!");
    }

    // ---------------------------------------------------------
    // Cargar libros desde el fichero
    // ---------------------------------------------------------
    private static void loadBooksFromFile(Set<Book> books) {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            // Si no existe, no hacemos nada
            return;
        }

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                // Formato esperado: id;title;author
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    books.add(new Book(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // ---------------------------------------------------------
    // Guardar libros en el fichero
    // ---------------------------------------------------------
    private static void saveBooksToFile(Set<Book> books) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Book b : books) {
                pw.println(b.id + ";" + b.title + ";" + b.author);
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}

// ---------------------------------------------------------

class Book {
    protected String id;
    protected String title;
    protected String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return id + ": " + title + ", by " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return Objects.equals(title, book.title)
                && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
