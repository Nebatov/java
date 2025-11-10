package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.*;
import edu.ntu.nebatov.lab3.controller.impl.DepartmentImpl;

public class DepartmentCreator {
    private final GroupCreator groupCreator = new GroupCreator();

    public Department createDepartment(String name, Human head) {
        return new DepartmentImpl(name, head);
    }

    public GroupCreator getGroupCreator() {
        return groupCreator;
    }
}
