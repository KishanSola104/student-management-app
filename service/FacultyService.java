package service;

import java.util.List;

import model.Faculty;
import model.Course;
import repository.FacultyRepository;
import repository.CourseRepository;

public class FacultyService {

    public static boolean login(String facultyId, String password) {
        List<Faculty> facultyList = FacultyRepository.getAllFaculty();

        for (Faculty faculty : facultyList) {
            if (faculty.getFacultyId().equals(facultyId) &&
                    faculty.getPassword().equals(password) &&
                    faculty.getStatus().equals(Faculty.ACTIVE)) {
                return true;
            }
        }

        return false;
    }

    public static void addFaculty(String facultyId, String facultyName,
            String password, String deptId,
            String courseId) {
        List<Faculty> facultyList = FacultyRepository.getAllFaculty();

        for (Faculty f : facultyList) {
            if (f.getFacultyId().equals(facultyId)) {
                System.out.println("Faculty ID already exists.");
                return;
            }
        }

        List<Course> courses = CourseRepository.getAllCourses();

        boolean courseExists = false;

        for (Course c : courses) {
            if (c.getCourseId().equals(courseId) &&
                    c.getStatus().equals("ACTIVE")) {
                courseExists = true;
                break;
            }
        }

        if (!courseExists) {
            System.out.println("Invalid Course ID.");
            return;
        }

        Faculty faculty = new Faculty(
                facultyId,
                facultyName,
                password,
                deptId,
                courseId,
                Faculty.ACTIVE);

        boolean saved = FacultyRepository.addFaculty(faculty);

        if (saved) {
            System.out.println("Faculty added successfully.");
        } else {
            System.out.println("Failed to add faculty.");
        }
    }

    public static void viewAllFaculties() {
        List<Faculty> facultyList = FacultyRepository.getAllFaculty();

        System.out.println("\n----- Faculty List -----");

        for (Faculty f : facultyList) {
            if (f.getStatus().equals(Faculty.ACTIVE)) {
                System.out.println(
                        f.getFacultyId() + " - " +
                                f.getFacultyName() +
                                " | Dept: " + f.getDeptId() +
                                " | Course: " + f.getCourseId());
            }
        }
    }

    public static void deleteFaculty(String facultyId) {
        boolean result = FacultyRepository.softDeleteFaculty(facultyId);

        if (result) {
            System.out.println("Faculty deleted successfully.");
        } else {
            System.out.println("Faculty not found.");
        }
    }

    public static void viewFacultiesByDepartment(String deptId) {
        List<Faculty> facultyList = FacultyRepository.getAllFaculty();

        System.out.println("\nFaculties in Department: " + deptId);

        for (Faculty f : facultyList) {
            if (f.getStatus().equals(Faculty.ACTIVE) &&
                    f.getDeptId().equals(deptId)) {
                System.out.println(
                        f.getFacultyId() + " - " +
                                f.getFacultyName() +
                                " | Course: " + f.getCourseId());
            }
        }
    }
}