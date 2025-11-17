package edu.ntu.nebatov.lab3.model.impl;

import edu.ntu.nebatov.lab3.model.Faculty;
import edu.ntu.nebatov.lab3.model.Human;
import edu.ntu.nebatov.lab3.model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityImpl extends BaseUnitImpl implements University {

    private final List<Faculty> faculties = new ArrayList<>();

    public UniversityImpl(String name, Human head) {
        super(name, head);
    }

    @Override
    public List<Faculty> getFaculties() { return faculties; }

    @Override
    public void addFaculty(Faculty faculty) { faculties.add(faculty); }
}
