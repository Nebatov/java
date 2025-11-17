package edu.ntu.nebatov.lab3.model.impl;

import edu.ntu.nebatov.lab3.model.Group;
import edu.ntu.nebatov.lab3.model.Human;
import edu.ntu.nebatov.lab3.model.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupImpl extends BaseUnitImpl implements Group {

    private final List<Student> students = new ArrayList<>();

    public GroupImpl(String name, Human head) {
        super(name, head);
    }

    @Override
    public List<Student> getStudents() { return students; }

    @Override
    public void addStudent(Student student) { students.add(student); }
}
