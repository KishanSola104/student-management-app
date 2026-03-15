package service;

import java.util.List;

import model.Semester;
import model.Course;
import repository.SemesterRepository;
import repository.CourseRepository;

public class SemesterService
{

    public static void addSemester(String semesterId, String courseId, int semesterNumber)
    {
        List<Course> courses = CourseRepository.getAllCourses();

        boolean courseExists = false;

        for(Course c : courses)
        {
            if(c.getCourseId().equals(courseId) && c.getStatus().equals("ACTIVE"))
            {
                courseExists = true;
                break;
            }
        }

        if(!courseExists)
        {
            System.out.println("Invalid Course ID. Semester cannot be added.");
            return;
        }

        Semester semester = new Semester(
                semesterId,
                courseId,
                semesterNumber,
                0,
                0,
                "ACTIVE"
        );

        SemesterRepository.addSemester(semester);

        System.out.println("Semester added successfully!");
    }

    public static void viewSemesters()
    {
        List<Semester> semesters = SemesterRepository.getAllSemesters();

        if(semesters.isEmpty())
        {
            System.out.println("No semesters found.");
            return;
        }

        System.out.println("\n----- Semester List -----");

        for(Semester s : semesters)
        {
            if(s.getStatus().equals("ACTIVE"))
            {
                System.out.println(
                        s.getSemesterId() +
                        " | Course: " + s.getCourseId() +
                        " | Semester: " + s.getSemesterNumber()
                );
            }
        }
    }

    public static void deleteSemester(String semesterId)
    {
        boolean result = SemesterRepository.softDeleteSemester(semesterId);

        if(result)
        {
            System.out.println("Semester deleted successfully (Soft Delete).");
        }
        else
        {
            System.out.println("Semester not found.");
        }
    }
}