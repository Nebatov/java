package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.*;
import edu.ntu.nebatov.lab3.controller.impl.StudentImpl;

public class StudentCreator {
    public Student createStudent(String name, String surname, String patronymic, Sex sex) {
        return new StudentImpl(name, surname, patronymic, sex);
    }
}
