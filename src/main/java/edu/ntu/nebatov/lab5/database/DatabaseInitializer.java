package edu.ntu.nebatov.lab5.database;

import edu.ntu.nebatov.lab3.model.Sex;
import edu.ntu.nebatov.lab3.model.Student;
import edu.ntu.nebatov.lab5.service.StudentDAO;

import java.util.Arrays;
import java.util.List;

public class DatabaseInitializer {
    private final StudentDAO studentDAO;

    public DatabaseInitializer() {
        this.studentDAO = new StudentDAO();
    }

    public void initializeDatabase() {
        List<Student> students = createStudentList();

        for (Student student : students) {
            studentDAO.insertStudent(student);
        }

        System.out.println("База даних ініціалізована. Додано " + students.size() + " студентів.");
    }

    private List<Student> createStudentList() {
        return Arrays.asList(
                new Student("Андрій", "Ткаченко", "Іванович", Sex.MALE, "ST2024001", "2005-01-15"),
                new Student("Анна", "Бондаренко", "Сергіївна", Sex.FEMALE, "ST2024002", "2005-02-20"),
                new Student("Дмитро", "Лисенко", "Володимирович", Sex.MALE, "ST2024003", "2005-03-10"),
                new Student("Олена", "Коваленко", "Петрівна", Sex.FEMALE, "ST2024004", "2005-04-05"),
                new Student("Сергій", "Мельник", "Олександрович", Sex.MALE, "ST2024005", "2005-05-25"),
                new Student("Марія", "Шевченко", "Василівна", Sex.FEMALE, "ST2024006", "2005-07-12"),
                new Student("Іван", "Петренко", "Миколайович", Sex.MALE, "ST2024007", "2005-08-18"),
                new Student("Ольга", "Сидоренко", "Андріївна", Sex.FEMALE, "ST2024008", "2005-09-22"),
                new Student("Максим", "Павленко", "Сергійович", Sex.MALE, "ST2024009", "2005-10-30"),
                new Student("Катерина", "Іваненко", "Олегівна", Sex.FEMALE, "ST2024010", "2005-11-08"),
                new Student("Віктор", "Романенко", "Васильович", Sex.MALE, "ST2024011", "2005-12-14"),
                new Student("Тетяна", "Кравченко", "Ігорівна", Sex.FEMALE, "ST2024012", "2006-01-28"),
                new Student("Олексій", "Гончаренко", "Павлович", Sex.MALE, "ST2024013", "2006-02-17"),
                new Student("Наталія", "Марченко", "Дмитрівна", Sex.FEMALE, "ST2024014", "2006-03-21"),
                new Student("Юрій", "Савченко", "Віталійович", Sex.MALE, "ST2024015", "2006-04-09"),
                new Student("Ірина", "Білоус", "Миколаївна", Sex.FEMALE, "ST2024016", "2006-05-16"),
                new Student("Артем", "Яценко", "Олександрович", Sex.MALE, "ST2024017", "2006-07-24"),
                new Student("Світлана", "Ковальчук", "Сергіївна", Sex.FEMALE, "ST2024018", "2006-08-11"),
                new Student("Богдан", "Мороз", "Андрійович", Sex.MALE, "ST2024019", "2006-09-19"),
                new Student("Юлія", "Литвиненко", "Петрівна", Sex.FEMALE, "ST2024020", "2006-10-27")
        );
    }

    public static void main(String[] args) {
        DatabaseInitializer initializer = new DatabaseInitializer();
        initializer.initializeDatabase();
    }
}