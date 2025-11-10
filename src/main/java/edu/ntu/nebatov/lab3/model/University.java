package edu.ntu.nebatov.lab3.model;

import java.util.List;

public interface University {
    String getName();
    Human getHead();
    List<Faculty> getFaculties();
    void addFaculty(Faculty faculty);
}
