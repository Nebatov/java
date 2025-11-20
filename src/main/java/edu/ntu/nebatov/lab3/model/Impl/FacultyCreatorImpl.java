package edu.ntu.nebatov.lab3.model.Impl;

import edu.ntu.nebatov.lab3.controller.DepartmentCreator;
import edu.ntu.nebatov.lab3.controller.FacultyCreator;
import edu.ntu.nebatov.lab3.model.Faculty;
import edu.ntu.nebatov.lab3.model.Human;

public class FacultyCreatorImpl implements FacultyCreator {
    private final DepartmentCreator departmentCreator;

    public FacultyCreatorImpl(DepartmentCreator departmentCreator) {
        this.departmentCreator = departmentCreator;
    }

    @Override
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }

    public DepartmentCreator getDepartmentCreator() {
        return departmentCreator;
    }
}
