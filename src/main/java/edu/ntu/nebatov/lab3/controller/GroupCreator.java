package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.Group;
import edu.ntu.nebatov.lab3.model.Human;
import edu.ntu.nebatov.lab3.model.impl.GroupImpl;

public class GroupCreator {

    public Group createGroup(String name, Human head) {
        return new GroupImpl(name, head);
    }
}
