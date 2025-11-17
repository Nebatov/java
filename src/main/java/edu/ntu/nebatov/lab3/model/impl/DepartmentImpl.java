package edu.ntu.nebatov.lab3.model.impl;

import edu.ntu.nebatov.lab3.model.Department;
import edu.ntu.nebatov.lab3.model.Group;
import edu.ntu.nebatov.lab3.model.Human;

import java.util.ArrayList;
import java.util.List;

public class DepartmentImpl extends BaseUnitImpl implements Department {

    private final List<Group> groups = new ArrayList<>();

    public DepartmentImpl(String name, Human head) {
        super(name, head);
    }

    @Override
    public List<Group> getGroups() { return groups; }

    @Override
    public void addGroup(Group group) { groups.add(group); }
}
