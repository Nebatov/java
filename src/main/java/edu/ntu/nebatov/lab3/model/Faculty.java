package edu.ntu.nebatov.lab3.model;

import java.util.List;

public interface Faculty {
    String getName();
    Human getHead();
    List<Department> getDepartments();
    void addDepartment(Department department);
}
