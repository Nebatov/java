package edu.ntu.nebatov.lab3.controller.impl;

import edu.ntu.nebatov.lab3.model.*;
import java.util.ArrayList;
import java.util.List;

public class UniversityImpl implements University {
    private final String name;
    private final Human head;
    private final List<Faculty> faculties = new ArrayList<>();

    public UniversityImpl(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Human getHead() {
        return head;
    }

    @Override
    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    @Override
    public String toString() {
        return "University: " + name + ", head: " + head + ", faculties: " + faculties.size();
    }
}
