package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.*;
import edu.ntu.nebatov.lab3.controller.impl.UniversityImpl;

public class UniversityCreator {
    private final FacultyCreator facultyCreator = new FacultyCreator();

    public University createUniversity(String name, Human head) {
        return new UniversityImpl(name, head);
    }

    public FacultyCreator getFacultyCreator() {
        return facultyCreator;
    }
}
