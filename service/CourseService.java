package service;

import java.util.List;

import model.Course;
import model.Department;
import repository.CourseRepository;
import repository.DepartmentRepository;

public class CourseService
{

    public static void addCourse(String courseId, String courseName, String deptId, int numOfSemesters)
    {
        List<Department> departments = DepartmentRepository.getAllDepartments();

        boolean deptExists = false;

        for(Department d : departments)
        {
            if(d.getDeptId().equals(deptId) && d.getStatus().equals("ACTIVE"))
            {
                deptExists = true;
                break;
            }
        }

        if(!deptExists)
        {
            System.out.println("Invalid Department ID. Course cannot be added.");
            return;
        }

        Course course = new Course(courseId, courseName, deptId, 0, 0, numOfSemesters, "ACTIVE");

        CourseRepository.addCourse(course);

        System.out.println("Course added successfully!");
    }

    public static void viewCourses()
    {
        List<Course> courses = CourseRepository.getAllCourses();

        if(courses.isEmpty())
        {
            System.out.println("No courses found.");
            return;
        }

        System.out.println("\n----- Course List -----");

        for(Course c : courses)
        {
            if(c.getStatus().equals("ACTIVE"))
            {
                System.out.println(
                        c.getCourseId() + " - " +
                        c.getCourseName() +
                        " | Dept: " + c.getDeptId() +
                        " | Semesters: " + c.getNumOfSemesters()
                );
            }
        }
    }

    public static void deleteCourse(String courseId)
    {
        boolean result = CourseRepository.softDeleteCourse(courseId);

        if(result)
        {
            System.out.println("Course deleted successfully (Soft Delete).");
        }
        else
        {
            System.out.println("Course not found.");
        }
    }
}