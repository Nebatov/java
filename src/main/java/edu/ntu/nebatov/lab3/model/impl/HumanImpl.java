package edu.ntu.nebatov.lab3.model.impl;

import edu.ntu.nebatov.lab3.model.Human;
import edu.ntu.nebatov.lab3.model.Sex;

public class HumanImpl implements Human {

    private final String name;
    private final String surname;
    private final String patronymic;
    private final Sex sex;

    public HumanImpl(String name, String surname, String patronymic, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getSurname() { return surname; }

    @Override
    public String getPatronymic() { return patronymic; }

    @Override
    public Sex getSex() { return sex; }

    @Override
    public String getFullName() {
        return surname + " " + name + " " + patronymic;
    }
}
