package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.*;
import edu.ntu.nebatov.lab3.model.impl.HumanImpl;

public class UniversityBuilder {

    public University createTypicalUniversity() {

        UniversityCreator universityCreator = new UniversityCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Human rector = new HumanImpl("Oleksandr", "Azukovkiy", "Oleksandrovich", Sex.MALE);

        University uni = universityCreator.createUniversity("NTU", rector);

        Human facHead = new HumanImpl("Maksym", "Shevchenko", "Yuriovych", Sex.MALE);
        Faculty faculty = facultyCreator.createFaculty("FIT", facHead);
        uni.addFaculty(faculty);

        Human depHead = new HumanImpl("Olena", "Vasylkiv", "Serhiyovych", Sex.FEMALE);
        Department dep = departmentCreator.createDepartment("CS Department", depHead);
        faculty.addDepartment(dep);

        Human groupHead = new HumanImpl("Andriy", "Koval", "Olehovych", Sex.MALE);
        Group group = groupCreator.createGroup("124-22-2", groupHead);
        dep.addGroup(group);

        group.addStudent(studentCreator.createStudent("Dmytro", "Lysenko", "Volodymyrovych", Sex.MALE));
        group.addStudent(studentCreator.createStudent("Sofia", "Kravets", "Olehovych", Sex.FEMALE));

        printUniversity(uni);

        return uni;
    }

    private void printUniversity(University uni) {
        System.out.println("University: " + uni.getName() + " | Head: " + uni.getHead().getFullName());
        for (Faculty f : uni.getFaculties()) {
            System.out.println("  Faculty: " + f.getName() + " | Head: " + f.getHead().getFullName());
            for (Department d : f.getDepartments()) {
                System.out.println("    Department: " + d.getName() + " | Head: " + d.getHead().getFullName());
                for (Group g : d.getGroups()) {
                    System.out.println("      Group: " + g.getName() + " | Head: " + g.getHead().getFullName());
                    for (Student s : g.getStudents()) {
                        System.out.println("        Student: " + s.getFullName());
                    }
                }
            }
        }
    }
}
