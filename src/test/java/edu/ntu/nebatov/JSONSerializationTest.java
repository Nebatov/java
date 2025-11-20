package edu.ntu.nebatov;

import edu.ntu.nebatov.lab4.JSONController;
import edu.ntu.nebatov.lab3.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JSONSerializationTest {

    @Test
    public void testUniversityJsonSerialization() throws IOException {
        University oldUniversity = buildUniversity();

        JSONController jsonController = new JSONController();
        String filePath = "testLab4.json";

        jsonController.writeToFile(oldUniversity, filePath);
        University newUniversity = jsonController.readFromFile(filePath);

        assertEquals(oldUniversity, newUniversity);
    }

    private University buildUniversity() {
        Human rector = new Human("John", "Peterson", "Michael", Sex.MALE);
        University university = new University("Test University", rector);

        for (int i = 1; i <= 2; i++) {
            Faculty faculty = new Faculty(
                    "Faculty " + i,
                    new Human("Dean", "F" + i, "P", Sex.MALE)
            );

            for (int j = 1; j <= 2; j++) {
                Department department = new Department(
                        "Department " + i + "." + j,
                        new Human("Head", "D" + i + j, "P", Sex.FEMALE)
                );

                for (int g = 1; g <= 2; g++) {
                    Group group = new Group(
                            "Group " + i + "." + j + "." + g,
                            new Human("Curator", "G" + i + j + g, "P", Sex.FEMALE)
                    );

                    group.addStudent(new Student(
                            "Student", "S" + g + "1", "P", Sex.MALE,
                            "ID" + i + j + g + "1"
                    ));

                    group.addStudent(new Student(
                            "Student", "S" + g + "2", "P", Sex.FEMALE,
                            "ID" + i + j + g + "2"
                    ));

                    department.addGroup(group);
                }

                faculty.addDepartment(department);
            }

            university.addFaculty(faculty);
        }

        return university;
    }
}
