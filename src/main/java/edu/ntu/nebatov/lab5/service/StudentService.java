package edu.ntu.nebatov.lab5.service;

import edu.ntu.nebatov.lab3.model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private final StudentDAO studentDAO;

    public StudentService() {
        this.studentDAO = new StudentDAO();
    }

    public List<Student> getStudentsByBirthMonth(int month) {
        return studentDAO.getAllStudents().stream()
                .filter(s -> {
                    try {
                        LocalDate d = LocalDate.parse(s.getBirthDate());
                        return d.getMonthValue() == month;
                    } catch (DateTimeParseException e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }


    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }
}