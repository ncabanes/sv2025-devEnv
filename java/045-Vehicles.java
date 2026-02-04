/*
Create an abstract class Vehicle with attributes: make, model, and 
numberOfWheels. Create a single constructor that assigns values ​​to the three 
attributes, and also create getters and setters. There will also be a 
`toString` method that returns the make, model, and number of wheels, separated 
by hyphens.

Create a class Car that inherits from Vehicle. Its only constructor will assign 
values ​​to make and model and prefix the number of wheels to 4. The `toString` 
method will return the make, model, and number of wheels, followed by "(Car)".

Create a class Motorcycle that inherits from Vehicle. Its only constructor will 
assign values ​​to make and model and prefix the number of wheels to 2. The 
`toString` method will return the make, model, and number of wheels, followed 
by "(Motorcycle)".

Create a class named VehicleTest, which will contain "main". It will create an 
array of three vehicles, containing two cars and one motorcycle, and then 
display them.
*/

// -------------------------

public abstract class Vehicle {
    private String make;
    private String model;
    private int numberOfWheels;

    public Vehicle(String make, String model, int numberOfWheels) {
        this.make = make;
        this.model = model;
        this.numberOfWheels = numberOfWheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return make + " - " + model + " - " + numberOfWheels;
    }
}

// -------------------------

public class Car extends Vehicle {

    public Car(String make, String model) {
        super(make, model, 4);
    }

    @Override
    public String toString() {
        return super.toString() + " (Car)";
    }
}


// -------------------------

public class Motorcycle extends Vehicle {

    public Motorcycle(String make, String model) {
        super(make, model, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " (Motorcycle)";
    }
}

// -------------------------

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("Toyota", "Corolla");
        vehicles[1] = new Car("Ford", "Focus");
        vehicles[2] = new Motorcycle("Honda", "CBR600");

        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}

