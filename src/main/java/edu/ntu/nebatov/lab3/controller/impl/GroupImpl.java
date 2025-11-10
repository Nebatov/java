package edu.ntu.nebatov.lab3.controller.impl;

import edu.ntu.nebatov.lab3.model.*;
import java.util.ArrayList;
import java.util.List;

public class GroupImpl implements Group {
    private final String name;
    private final Human head;
    private final List<Student> students = new ArrayList<>();

    public GroupImpl(String name, Human head) {
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
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Group " + name + ", head: " + head + ", students: " + students.size();
    }
}