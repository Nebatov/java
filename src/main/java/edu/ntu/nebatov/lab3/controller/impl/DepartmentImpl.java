package edu.ntu.nebatov.lab3.controller.impl;

import edu.ntu.nebatov.lab3.model.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentImpl implements Department {
    private final String name;
    private final Human head;
    private final List<Group> groups = new ArrayList<>();

    public DepartmentImpl(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Human getHead() {
        return head;
    }

    @Override
    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public void addGroup(Group group) {
        groups.add(group);
    }

    @Override
    public String toString() {
        return "Department: " + name + ", head: " + head + ", groups: " + groups.size();
    }
}
