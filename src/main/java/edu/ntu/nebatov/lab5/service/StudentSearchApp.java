package edu.ntu.nebatov.lab5.service;

import edu.ntu.nebatov.lab3.model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentSearchApp {
    private final StudentService studentService;
    private final Scanner scanner;

    public StudentSearchApp() {
        this.studentService = new StudentService();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== Пошук студентів за місяцем народження ===");
        System.out.print("Введіть номер місяця (1-12): ");

        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Невірний номер місяця!");
            return;
        }

        List<Student> students = studentService.getStudentsByBirthMonth(month);

        if (students.isEmpty()) {
            System.out.println("Студентів, народжених у цьому місяці, не знайдено.");
        } else {
            System.out.println("\nСтуденти, народжені у місяці " + month + ":");
            for (Student student : students) {
                displayStudent(student);
            }
        }
    }

    private void displayStudent(Student student) {
        System.out.println("----------------------------------------");
        System.out.println("ПІБ: " + student.getFullName());
        System.out.println("Номер залікової книжки: " + student.getStudentId());
        System.out.println("Дата народження: " + student.getBirthDate());
        System.out.println("Стать: " + student.getSex());
    }

    public static void main(String[] args) {
        StudentSearchApp app = new StudentSearchApp();
        app.run();
    }
}