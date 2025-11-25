package edu.ntu.nebatov.lab5.service;

import edu.ntu.nebatov.lab3.model.Sex;
import edu.ntu.nebatov.lab3.model.Student;
import edu.ntu.nebatov.lab5.database.DatabaseConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                DatabaseConfig.getUrl(),
                DatabaseConfig.getUser(),
                DatabaseConfig.getPassword()
        );
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String query = "SELECT id, first_name, last_name, patronymic, sex, student_id, birth_date FROM students";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Student student = new Student(
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("patronymic"),
                        Sex.valueOf(rs.getString("sex")),
                        rs.getString("student_id"),
                        rs.getString("birth_date")
                );
                students.add(student);
            }
        } catch (SQLException e) {
            System.err.println("Error fetching students: " + e.getMessage());
        }

        return students;
    }

    public void insertStudent(Student student) {
        String query = "INSERT INTO students (first_name, last_name, patronymic, sex, student_id, birth_date) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, student.getFirstName());
            pstmt.setString(2, student.getLastName());
            pstmt.setString(3, student.getPatronymic());
            pstmt.setString(4, student.getSex().name());
            pstmt.setString(5, student.getStudentId());
            pstmt.setString(6, student.getBirthDate());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error inserting student: " + e.getMessage());
        }
    }
}