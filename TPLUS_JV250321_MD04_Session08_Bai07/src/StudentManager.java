import entity.Student;

import java.util.Scanner;

public class StudentManager {
    public static Student[] studentList = new Student[100];
    public static int currentIndex = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Find Student by Name");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String studentName = input.nextLine();
                    System.out.print("Enter Student Age: ");
                    int studentAge = Integer.parseInt(input.nextLine());
                    System.out.print("Enter Student GPA: ");
                    double studentGPA = Double.parseDouble(input.nextLine());

                    Student newStudent = new Student(studentName, studentAge, studentGPA);
                    addStudent(newStudent);
                    break;

                case 2:
                    showAllStudents(studentList);
                    break;

                case 3:
                    System.out.print("Enter student Name to find: ");
                    String findName = input.nextLine();
                    findStudentByName(findName);
                    break;

                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please enter a choice from 1 to 4 😁");
            }
        } while (true);
    }

    public static void addStudent(Student student) {
        studentList[currentIndex] = student;
        currentIndex++;
    }

    public static void showAllStudents(Student[] students) {
        for (int i = 0; i < currentIndex; i++) {
            students[i].display();
        }
    }

    public static void findStudentByName(String name) {
        boolean found = false;
        for (int i = 0; i < currentIndex; i++) {
            if (studentList[i].getName().toLowerCase().contains(name.trim().toLowerCase())) {
                System.out.println("Student found:");
                studentList[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }

    }

}
