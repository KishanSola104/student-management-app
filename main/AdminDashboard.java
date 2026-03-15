package main;

import java.util.Scanner;

import service.DepartmentService;
import service.FacultyService;
import service.CourseService;

import service.SemesterService;

import service.StudentService;

public class AdminDashboard {
    static Scanner scanner = new Scanner(System.in);

    private static int getIntInput()
{
    while(true)
    {
        try
        {
            int value = Integer.parseInt(scanner.nextLine());
            return value;
        }
        catch(Exception e)
        {
            System.out.print("Invalid input! Please enter a number: ");
        }
    }
}

    public static void showMenu() {
        while (true) {
            System.out.println("\n===== ADMIN DASHBOARD =====");

            System.out.println("1. Manage Departments");
            System.out.println("2. Manage Courses");
            System.out.println("3. Manage Semesters");
            System.out.println("4. Manage Students");
            System.out.println("5. Manage Faculty");
            System.out.println("6. Logout");

            System.out.print("Enter Choice: ");

            int choice = getIntInput();
           


            switch (choice) {
                case 1:
                    manageDepartments();
                    break;

                case 2:
                    manageCourses();
                    break;

                case 3:
                    manageSemesters();
                    break;

                case 4:
                    manageStudents();
                    break;

                case 5:
                    manageFaculty();
                    break;

                case 6:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    /* Department Management */

    private static void manageDepartments() {
        while (true) {
            System.out.println("\n----- Department Management -----");

            System.out.println("1. Add Department");
            System.out.println("2. View Departments");
            System.out.println("3. Delete Department");
            System.out.println("4. Back");

            System.out.print("Enter Choice: ");

            int choice = getIntInput();
            

            switch (choice) {
                case 1:

                    System.out.print("Enter Department ID: ");
                    String deptId = scanner.nextLine();

                    System.out.print("Enter Department Name: ");
                    String deptName = scanner.nextLine();

                    DepartmentService.addDepartment(deptId, deptName);

                    break;

                case 2:

                    DepartmentService.viewDepartments();

                    break;

                case 3:

                    System.out.print("Enter Department ID to delete: ");
                    String deleteDeptId = scanner.nextLine();

                    DepartmentService.deleteDepartment(deleteDeptId);

                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    /* Course Management */
    private static void manageCourses() {
        while (true) {
            System.out.println("\n----- Course Management -----");

            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Delete Course");
            System.out.println("4. Back");

            System.out.print("Enter Choice: ");

            int choice = getIntInput();
            

            switch (choice) {
                case 1:

                    System.out.print("Enter Course ID: ");
                    String courseId = scanner.nextLine();

                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();

                    System.out.print("Enter Department ID: ");
                    String deptId = scanner.nextLine();

                    System.out.print("Enter Number of Semesters: ");
                    int semesters = scanner.nextInt();
                    scanner.nextLine();

                    CourseService.addCourse(courseId, courseName, deptId, semesters);

                    break;

                case 2:

                    CourseService.viewCourses();

                    break;

                case 3:

                    System.out.print("Enter Course ID to delete: ");
                    String deleteId = scanner.nextLine();

                    CourseService.deleteCourse(deleteId);

                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    /* Semester Management */

    private static void manageSemesters() {
        while (true) {
            System.out.println("\n----- Semester Management -----");

            System.out.println("1. Add Semester");
            System.out.println("2. View Semesters");
            System.out.println("3. Delete Semester");
            System.out.println("4. Back");

            System.out.print("Enter Choice: ");

            int choice = getIntInput();
            

            switch (choice) {
                case 1:

                    System.out.print("Enter Semester ID: ");
                    String semesterId = scanner.nextLine();

                    System.out.print("Enter Course ID: ");
                    String courseId = scanner.nextLine();

                    System.out.print("Enter Semester Number: ");
                    int semesterNumber = scanner.nextInt();
                    scanner.nextLine();

                    SemesterService.addSemester(semesterId, courseId, semesterNumber);

                    break;

                case 2:

                    SemesterService.viewSemesters();

                    break;

                case 3:

                    System.out.print("Enter Semester ID to delete: ");
                    String deleteId = scanner.nextLine();

                    SemesterService.deleteSemester(deleteId);

                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    /* Student Management */

private static void manageStudents()
{
    while(true)
    {
        System.out.println("\n----- Student Management -----");

        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. View Students by Department");
        System.out.println("4. View Students by Course");
        System.out.println("5. View Students by Semester");
        System.out.println("6. Delete Student");
        System.out.println("7. Back");

        System.out.print("Enter Choice: ");

        int choice = getIntInput();

        switch(choice)
        {
            case 1:

                System.out.print("Enter Student ID: ");
                String studentId = scanner.nextLine();

                System.out.print("Enter Student Name: ");
                String studentName = scanner.nextLine();

                System.out.print("Enter Department ID: ");
                String deptId = scanner.nextLine();

                System.out.print("Enter Course ID: ");
                String courseId = scanner.nextLine();

                System.out.print("Enter Semester Number: ");
                int semester = getIntInput();

                StudentService.addStudent(studentId, studentName, deptId, courseId, semester);

                break;

            case 2:

                StudentService.viewAllStudents();

                break;

            case 3:

                System.out.print("Enter Department ID: ");
                String dept = scanner.nextLine();

                StudentService.viewStudentsByDepartment(dept);

                break;

            case 4:

                System.out.print("Enter Course ID: ");
                String course = scanner.nextLine();

                StudentService.viewStudentsByCourse(course);

                break;

            case 5:

                System.out.print("Enter Course ID: ");
                String courseSem = scanner.nextLine();

                System.out.print("Enter Semester Number: ");
                int sem = getIntInput();

                StudentService.viewStudentsBySemester(courseSem, sem);

                break;

            case 6:

                System.out.print("Enter Student ID to delete: ");
                String deleteId = scanner.nextLine();

                StudentService.deleteStudent(deleteId);

                break;

            case 7:
                return;

            default:
                System.out.println("Invalid choice!");
        }
    }
}

    /* Faculty Management */

private static void manageFaculty()
{
    while(true)
    {
        System.out.println("\n----- Faculty Management -----");

        System.out.println("1. Add Faculty");
        System.out.println("2. View All Faculties");
        System.out.println("3. View Faculties by Department");
        System.out.println("4. Delete Faculty");
        System.out.println("5. Back");

        System.out.print("Enter Choice: ");

        int choice = getIntInput();

        switch(choice)
        {
            case 1:

                System.out.print("Enter Faculty ID: ");
                String facultyId = scanner.nextLine();

                System.out.print("Enter Faculty Name: ");
                String facultyName = scanner.nextLine();

                System.out.print("Enter Password: ");
                String password = scanner.nextLine();

                System.out.print("Enter Department ID: ");
                String deptId = scanner.nextLine();

                System.out.print("Enter Course ID: ");
                String courseId = scanner.nextLine();

                FacultyService.addFaculty(
                        facultyId,
                        facultyName,
                        password,
                        deptId,
                        courseId
                );

                break;

            case 2:

                FacultyService.viewAllFaculties();
                break;

            case 3:

                System.out.print("Enter Department ID: ");
                String dept = scanner.nextLine();

                FacultyService.viewFacultiesByDepartment(dept);

                break;

            case 4:

                System.out.print("Enter Faculty ID to delete: ");
                String deleteId = scanner.nextLine();

                FacultyService.deleteFaculty(deleteId);

                break;

            case 5:
                return;

            default:
                System.out.println("Invalid choice!");
        }
    }
}

}