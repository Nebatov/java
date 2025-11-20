package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.Human;
import edu.ntu.nebatov.lab3.model.University;

public interface UniversityCreator {
    University createUniversity(String name, Human head);
}
