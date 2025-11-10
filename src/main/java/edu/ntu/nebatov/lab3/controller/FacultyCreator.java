package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.*;
import edu.ntu.nebatov.lab3.controller.impl.FacultyImpl;

public class FacultyCreator {
    private final DepartmentCreator departmentCreator = new DepartmentCreator();

    public Faculty createFaculty(String name, Human head) {
        return new FacultyImpl(name, head);
    }

    public DepartmentCreator getDepartmentCreator() {
        return departmentCreator;
    }
}
