package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.Human;
import edu.ntu.nebatov.lab3.model.Sex;

public interface HumanCreator {
    Human createHuman(String firstName, String lastName, String patronymic, Sex sex);
}
