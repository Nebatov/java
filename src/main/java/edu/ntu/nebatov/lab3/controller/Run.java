package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.University;

public class Run {

    public static void main(String[] args) {
        UniversityBuilder builder = new UniversityBuilder();
        University university = builder.createTypicalUniversity();

        UniversityDisplayer displayer = new UniversityDisplayer();
        displayer.display(university);
    }
}
