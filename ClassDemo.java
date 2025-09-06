class Car {
    String brand="Toyota";
    String color="Red";
    int year=2022;
}

public class ClassDemo {
    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println("Brand: " + car1.brand);
        System.out.println("Color: " + car1.color);
        System.out.println("Year: " + car1.year);
    }
}