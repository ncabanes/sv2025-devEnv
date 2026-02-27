import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ListOfBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        boolean finished = false;
        while (! finished) {
            System.out.println("1 - Add a new book");
            System.out.println("2 - Search in books");
            System.out.println("0 - Exit");

            String option = sc.nextLine();
            switch(option) {
                case "1":
                    System.out.println("Enter the id: ");
                    String id = sc.nextLine();
                    System.out.println("Enter the title: ");
                    String title = sc.nextLine();
                    System.out.println("Enter the author: ");
                    String author = sc.nextLine();
                    books.add( new Book( id, title, author ));
                    break;
                case "2":
                    System.out.println("Enter the search string: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (Book b: books) {
                        if (b.toString().toUpperCase().contains(search.toUpperCase())) {
                            System.out.println(b);
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

// -----------------------------

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
}
