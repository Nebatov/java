package edu.ntu.nebatov.lab3.model.Impl;


import edu.ntu.nebatov.lab3.controller.DepartmentCreator;
import edu.ntu.nebatov.lab3.controller.GroupCreator;
import edu.ntu.nebatov.lab3.model.Department;
import edu.ntu.nebatov.lab3.model.Human;

public class DepartmentCreatorImpl implements DepartmentCreator {
    private final GroupCreator groupCreator;

    public DepartmentCreatorImpl(GroupCreator groupCreator) {
        this.groupCreator = groupCreator;
    }

    @Override
    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }

    public GroupCreator getGroupCreator() {
        return groupCreator;
    }
}