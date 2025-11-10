package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.*;
import edu.ntu.nebatov.lab3.controller.impl.GroupImpl;

public class GroupCreator {
    private final StudentCreator studentCreator = new StudentCreator();

    public Group createGroup(String name, Human head) {
        return new GroupImpl(name, head);
    }

    public void addStudentToGroup(Group group, String name, String surname, String patronymic, Sex sex) {
        group.addStudent(studentCreator.createStudent(name, surname, patronymic, sex));
    }
}
