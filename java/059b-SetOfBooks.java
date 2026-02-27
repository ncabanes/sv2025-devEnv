import java.util.*;
import java.util.Objects;

class SetOfBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //List<Book> books = new ArrayList<>();
        //Map<String, Book> books = new HashMap<>();
        Set<Book> books = new HashSet<>();

        boolean finished = false;
        while (! finished) {
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
                    books.add( new Book( id, title, author ));
                    break;
                case "2":  // Display all
                    if (books.isEmpty()) {
                        System.out.println("No books to display");
                    }
                    else {
                        for (Book b : books) {
                            System.out.println( b );
                        }
                    }
                    break;
                case "3":  // Search
                    System.out.println("Enter the search string: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    Iterator<Book> it = books.iterator();
                    while(it.hasNext()) {
                        Book b = it.next();
                        if (b.toString().toUpperCase().contains(search.toUpperCase())) {
                            System.out.println( b );
                            found = true;
                        }
                    }
                    if (! found) {
                        System.out.println("Not found");
                    }
                    break;
                case "0":
                    finished = true;
                    break;
            }
        }
    }
}

// -----------------------------------

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
        return id +
                ": " + title +
                ", by " + author;
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
