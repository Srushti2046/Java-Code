// Parent class
class Person {
    String name;
    int age;
}

// Child class
class Student extends Person {
    String course;
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create object of Student
        Student s1 = new Student();

        // Assign values
        s1.name = "Srushti";
        s1.age = 19;
        s1.course = "Computer Science";

        // Print values
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Course: " + s1.course);
    }
}