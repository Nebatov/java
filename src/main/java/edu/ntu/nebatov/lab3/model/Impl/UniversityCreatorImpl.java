package edu.ntu.nebatov.lab3.model.Impl;

import edu.ntu.nebatov.lab3.controller.FacultyCreator;
import edu.ntu.nebatov.lab3.controller.UniversityCreator;
import edu.ntu.nebatov.lab3.model.Human;
import edu.ntu.nebatov.lab3.model.University;

public class UniversityCreatorImpl implements UniversityCreator {
    private final FacultyCreator facultyCreator;

    public UniversityCreatorImpl(FacultyCreator facultyCreator) {
        this.facultyCreator = facultyCreator;
    }

    @Override
    public University createUniversity(String name, Human head) {
        return new University(name, head);
    }

    public FacultyCreator getFacultyCreator() {
        return facultyCreator;
    }
}
