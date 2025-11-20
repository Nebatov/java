package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.Department;
import edu.ntu.nebatov.lab3.model.Human;


public interface DepartmentCreator {
    Department createDepartment(String name, Human head);
}
