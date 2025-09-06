class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
}

public class ParameterizedDemo {
    public static void main(String[] args) {
        // Create objects with parameterized constructor
        Student s1 = new Student("srushti", 19);
        Student s2 = new Student("Sita", 22);

        // Print object details
        System.out.println("Student 1: Name=" + s1.name + ", Age=" + s1.age);
        System.out.println("Student 2: Name=" + s2.name + ", Age=" + s2.age);
    }
}