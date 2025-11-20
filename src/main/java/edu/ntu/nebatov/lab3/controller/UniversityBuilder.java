package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.*;
import edu.ntu.nebatov.lab3.model.Impl.*;

public class UniversityBuilder {

    private final HumanCreator humanCreator;
    private final StudentCreator studentCreator;
    private final GroupCreator groupCreator;
    private final DepartmentCreator departmentCreator;
    private final FacultyCreator facultyCreator;
    private final UniversityCreator universityCreator;

    public UniversityBuilder() {
        this.humanCreator = new HumanCreatorImpl();
        this.studentCreator = new StudentCreatorImpl();
        this.groupCreator = new GroupCreatorImpl(studentCreator);
        this.departmentCreator = new DepartmentCreatorImpl(groupCreator);
        this.facultyCreator = new FacultyCreatorImpl(departmentCreator);
        this.universityCreator = new UniversityCreatorImpl(facultyCreator);
    }

    public University createTypicalUniversity() {
        Human rector = humanCreator.createHuman("John", "Peterson", "Michael", Sex.MALE);
        University university = universityCreator.createUniversity("National Technical University", rector);

        Faculty csFaculty = createComputerScienceFaculty();
        university.addFaculty(csFaculty);

        return university;
    }

    private Faculty createComputerScienceFaculty() {
        Human dean = humanCreator.createHuman("Helen", "Kovalenko", "Peter", Sex.FEMALE);
        Faculty faculty = facultyCreator.createFaculty("Faculty of Computer Science", dean);

        Department software = createSoftwareDepartment();
        faculty.addDepartment(software);

        return faculty;
    }

    private Department createSoftwareDepartment() {
        Human head = humanCreator.createHuman("Sergey", "Melnyk", "Alexander", Sex.MALE);
        Department department = departmentCreator.createDepartment("Software Engineering Department", head);

        Group group = createFirstYearGroup();
        department.addGroup(group);

        return department;
    }

    private Group createFirstYearGroup() {
        Human curator = humanCreator.createHuman("Maria", "Shevchenko", "Vasyl", Sex.FEMALE);
        Group group = groupCreator.createGroup("SE-101", curator);

        populateGroup(group);

        return group;
    }

    private void populateGroup(Group group) {
        group.addStudent(studentCreator.createStudent("Andrew", "Tkachenko", "Ivan", Sex.MALE, "ST2024001"));
        group.addStudent(studentCreator.createStudent("Anna", "Bondarenko", "Sergey", Sex.FEMALE, "ST2024002"));
        group.addStudent(studentCreator.createStudent("Dmitry", "Lysenko", "Vladimir", Sex.MALE, "ST2024003"));
    }
}
