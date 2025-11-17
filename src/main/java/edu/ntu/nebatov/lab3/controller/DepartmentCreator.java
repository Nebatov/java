package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.Department;
import edu.ntu.nebatov.lab3.model.Human;
import edu.ntu.nebatov.lab3.model.impl.DepartmentImpl;

public class DepartmentCreator {

    public Department createDepartment(String name, Human head) {
        return new DepartmentImpl(name, head);
    }
}
