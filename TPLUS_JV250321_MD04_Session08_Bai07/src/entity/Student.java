package entity;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.printf("Name: %s - Age: %d - GPA: %.2f\n", this.name, this.age, this.gpa);
    }
}
