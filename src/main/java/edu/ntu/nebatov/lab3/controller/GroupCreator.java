package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.Group;
import edu.ntu.nebatov.lab3.model.Human;

public interface GroupCreator {
    Group createGroup(String name, Human head);
}
