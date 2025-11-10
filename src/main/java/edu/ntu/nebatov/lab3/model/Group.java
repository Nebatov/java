package edu.ntu.nebatov.lab3.model;

import java.util.List;

public interface Group {
    String getName();
    Human getHead();
    List<Student> getStudents();
    void addStudent(Student student);
}
