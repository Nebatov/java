package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.Faculty;
import edu.ntu.nebatov.lab3.model.Human;

public interface FacultyCreator {
    Faculty createFaculty(String name, Human head);
}
