package edu.ntu.nebatov.lab3.controller;

import edu.ntu.nebatov.lab3.model.*;
import edu.ntu.nebatov.lab3.controller.impl.HumanImpl;

public class Main {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        printUniversity(university);
    }

    public static University createTypicalUniversity() {
        Human rector = new HumanImpl("Олександр", "Азюковський", "Олександрович", Sex.MALE);

        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversity("Дніпровська політехніка", rector);

        Human dean = new HumanImpl("Марія", "Коваль", "Іванівна", Sex.FEMALE);
        Faculty faculty = universityCreator.getFacultyCreator().createFaculty("Факультет інформатики", dean);
        university.addFaculty(faculty);

        Human headOfDept = new HumanImpl("Олег", "Сидоренко", "Вікторович", Sex.MALE);
        Department department = universityCreator.getFacultyCreator().getDepartmentCreator()
                .createDepartment("Кафедра комп’ютерних наук", headOfDept);
        faculty.addDepartment(department);

        Human groupHead = new HumanImpl("Анна", "Шевченко", "Петрівна", Sex.FEMALE);
        Group group = universityCreator.getFacultyCreator().getDepartmentCreator()
                .getGroupCreator().createGroup("124-2-2", groupHead);
        department.addGroup(group);

        GroupCreator groupCreator = universityCreator.getFacultyCreator().getDepartmentCreator().getGroupCreator();
        groupCreator.addStudentToGroup(group, "Дмитро", "Бондар", "Іванович", Sex.MALE);
        groupCreator.addStudentToGroup(group, "Оксана", "Мельник", "Сергіївна", Sex.FEMALE);

        return university;
    }

    private static void printUniversity(University university) {
        System.out.println("=== " + university.getName() + " ===");
        System.out.println("Ректор: " + university.getHead());

        for (Faculty faculty : university.getFaculties()) {
            System.out.println(" ├─ " + faculty.getName() + " (Декан: " + faculty.getHead() + ")");
            for (Department dept : faculty.getDepartments()) {
                System.out.println(" │  ├─ " + dept.getName() + " (Завідувач: " + dept.getHead() + ")");
                for (Group group : dept.getGroups()) {
                    System.out.println(" │  │  ├─ Група " + group.getName() + " (Староста: " + group.getHead() + ")");
                    for (Student st : group.getStudents()) {
                        System.out.println(" │  │  │  └─ " + st.getFullName() + " [" + st.getSex() + "]");
                    }
                }
            }
        }
    }
}
