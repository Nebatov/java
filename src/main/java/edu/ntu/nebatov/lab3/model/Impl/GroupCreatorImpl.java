package edu.ntu.nebatov.lab3.model.Impl;

import edu.ntu.nebatov.lab3.controller.GroupCreator;
import edu.ntu.nebatov.lab3.controller.StudentCreator;
import edu.ntu.nebatov.lab3.model.Group;
import edu.ntu.nebatov.lab3.model.Human;

public class GroupCreatorImpl implements GroupCreator {
    private final StudentCreator studentCreator;

    public GroupCreatorImpl(StudentCreator studentCreator) {
        this.studentCreator = studentCreator;
    }

    @Override
    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }

    public StudentCreator getStudentCreator() {
        return studentCreator;
    }
}
