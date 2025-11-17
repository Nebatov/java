package edu.ntu.nebatov.lab3.model.impl;

import edu.ntu.nebatov.lab3.model.Sex;
import edu.ntu.nebatov.lab3.model.Student;

public class StudentImpl extends HumanImpl implements Student {

    public StudentImpl(String name, String surname, String patronymic, Sex sex) {
        super(name, surname, patronymic, sex);
    }
}
