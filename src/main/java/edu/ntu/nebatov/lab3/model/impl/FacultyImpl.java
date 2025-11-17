package edu.ntu.nebatov.lab3.model.impl;

import edu.ntu.nebatov.lab3.model.Department;
import edu.ntu.nebatov.lab3.model.Faculty;
import edu.ntu.nebatov.lab3.model.Human;

import java.util.ArrayList;
import java.util.List;

public class FacultyImpl extends BaseUnitImpl implements Faculty {

    private final List<Department> departments = new ArrayList<>();

    public FacultyImpl(String name, Human head) {
        super(name, head);
    }

    @Override
    public List<Department> getDepartments() { return departments; }

    @Override
    public void addDepartment(Department department) { departments.add(department); }
}
