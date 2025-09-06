class Car {   
    String brand;
    String color;

    Car() {
        brand = "Toyota";
        color = "Red";
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Create first object
        Car car1 = new Car();

        // Create second object
        Car car2 = new Car();

        // Print values of car1
        System.out.println("Car 1 Brand: " + car1.brand);
        System.out.println("Car 1 Color: " + car1.color);

        System.out.println();

        // Print values of car2
        System.out.println("Car 2 Brand: " + car2.brand);
        System.out.println("Car 2 Color: " + car2.color);
    }
}