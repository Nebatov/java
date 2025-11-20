package edu.ntu.nebatov.lab3.model.Impl;

import edu.ntu.nebatov.lab3.controller.HumanCreator;
import edu.ntu.nebatov.lab3.model.Human;
import edu.ntu.nebatov.lab3.model.Sex;

public class HumanCreatorImpl implements HumanCreator {

    @Override
    public Human createHuman(String firstName, String lastName, String patronymic, Sex sex) {
        return new Human(firstName, lastName, patronymic, sex);
    }
}
