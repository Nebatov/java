package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.Faculty;
import edu.ntu.nebatov.lab3.model.Human;
import edu.ntu.nebatov.lab3.model.impl.FacultyImpl;

public class FacultyCreator {

    public Faculty createFaculty(String name, Human head) {
        return new FacultyImpl(name, head);
    }
}
