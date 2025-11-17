package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.Sex;
import edu.ntu.nebatov.lab3.model.Student;
import edu.ntu.nebatov.lab3.model.impl.StudentImpl;

public class StudentCreator {

    public Student createStudent(String name, String surname, String patronymic, Sex sex) {
        return new StudentImpl(name, surname, patronymic, sex);
    }
}
