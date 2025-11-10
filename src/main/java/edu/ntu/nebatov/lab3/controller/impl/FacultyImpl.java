package edu.ntu.nebatov.lab3.controller.impl;

import edu.ntu.nebatov.lab3.model.*;
import java.util.ArrayList;
import java.util.List;

public class FacultyImpl implements Faculty {
    private final String name;
    private final Human head;
    private final List<Department> departments = new ArrayList<>();

    public FacultyImpl(String name, Human head) {
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
    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        return "Faculty: " + name + ", head: " + head + ", departments: " + departments.size();
    }
}
