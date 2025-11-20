package edu.ntu.nebatov.lab3.model.Impl;

import edu.ntu.nebatov.lab3.controller.StudentCreator;
import edu.ntu.nebatov.lab3.model.Sex;
import edu.ntu.nebatov.lab3.model.Student;

public class StudentCreatorImpl implements StudentCreator {
    
    @Override
    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex, String studentId) {
        return new Student(firstName, lastName, patronymic, sex, studentId);
    }
}
