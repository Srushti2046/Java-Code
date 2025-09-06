// Parent class
class Person {
    String name;
    int age;
}

// First child class
class Student extends Person {
    String course;
}

// Second child class
class Teacher extends Person {
    String subject;
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        // Initialize Student object normally
        Student s1 = new Student();
        s1.name = "Srushti";
        s1.age = 19;
        s1.course = "Computer Science";

        // Initialize Teacher object normally
        Teacher t1 = new Teacher();
        t1.name = "Mrs.Pranali";
        t1.age = 30;
        t1.subject = "Java";

        // Print Student details
        System.out.println("Student Details:");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Course: " + s1.course);
        System.out.println();

        // Print Teacher details
        System.out.println("Teacher Details:");
        System.out.println("Name: " + t1.name);
        System.out.println("Age: " + t1.age);
        System.out.println("Subject: " + t1.subject);
    }
}