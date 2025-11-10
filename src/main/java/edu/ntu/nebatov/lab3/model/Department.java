package edu.ntu.nebatov.lab3.model;

import java.util.List;

public interface Department {
    String getName();
    Human getHead();
    List<Group> getGroups();
    void addGroup(Group group);
}
