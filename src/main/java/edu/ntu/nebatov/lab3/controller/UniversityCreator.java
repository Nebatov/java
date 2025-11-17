package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.Human;
import edu.ntu.nebatov.lab3.model.University;
import edu.ntu.nebatov.lab3.model.impl.UniversityImpl;

public class UniversityCreator {

    public University createUniversity(String name, Human head) {
        return new UniversityImpl(name, head);
    }
}
