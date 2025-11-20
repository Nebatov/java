package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.Sex;
import edu.ntu.nebatov.lab3.model.Student;

public interface StudentCreator {
    Student createStudent(String firstName, String lastName, String patronymic, Sex sex, String studentId);
}
