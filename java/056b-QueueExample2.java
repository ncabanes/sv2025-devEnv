import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample2 {
    public static void main(String[] args) {
        Queue<Person> attendants = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean finished = false;

        do {
            System.out.print("Enter the name of an attendant: ");
            String name = sc.nextLine();
            if (name == "") {
                finished = true;
            }
            else {
                System.out.print("Enter their age: ");
                int age = Integer.parseInt(sc.nextLine());
                attendants.add(new Person(name, age));
            }
        }
        while (! finished);

        while( ! attendants.isEmpty() ) {
            Person person = attendants.remove();
            if (person.getAge() >= 18) {
                System.out.println(person);
            }
        }
    }
}

// ------------------

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (Age:  " + age + ')';
    }
}
