package service;

import java.util.List;

import model.Student;
import model.Course;
import repository.StudentRepository;
import repository.CourseRepository;

public class StudentService
{

    public static void addStudent(String studentId, String studentName,
                                  String deptId, String courseId,
                                  int semesterNumber)
    {
        // Basic validation
        if(studentId == null || studentId.trim().isEmpty())
        {
            System.out.println("Student ID cannot be empty.");
            return;
        }

        if(studentName == null || studentName.trim().isEmpty())
        {
            System.out.println("Student name cannot be empty.");
            return;
        }

        // Check duplicate student ID
        List<Student> students = StudentRepository.getAllStudents();

        for(Student s : students)
        {
            if(s.getStudentId().equals(studentId))
            {
                System.out.println("Student ID already exists.");
                return;
            }
        }

        // Validate course
        List<Course> courses = CourseRepository.getAllCourses();

        Course selectedCourse = null;

        for(Course c : courses)
        {
            if(c.getCourseId().equals(courseId) &&
               c.getStatus().equals("ACTIVE"))
            {
                selectedCourse = c;
                break;
            }
        }

        if(selectedCourse == null)
        {
            System.out.println("Invalid Course ID.");
            return;
        }

        // Validate semester
        if(semesterNumber <= 0 ||
           semesterNumber > selectedCourse.getNumOfSemesters())
        {
            System.out.println("Invalid semester number for this course.");
            return;
        }

        Student student = new Student(
                studentId,
                studentName,
                deptId,
                courseId,
                semesterNumber,
                Student.ACTIVE
        );

        boolean saved = StudentRepository.addStudent(student);

        if(saved)
        {
            System.out.println("Student added successfully!");
        }
        else
        {
            System.out.println("Failed to add student.");
        }
    }


    public static void viewAllStudents()
    {
        List<Student> students = StudentRepository.getAllStudents();

        if(students.isEmpty())
        {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n----- Student List -----");

        for(Student s : students)
        {
            if(s.getStatus().equals(Student.ACTIVE))
            {
                System.out.println(
                        s.getStudentId() + " - " +
                        s.getStudentName() +
                        " | Dept: " + s.getDeptId() +
                        " | Course: " + s.getCourseId() +
                        " | Semester: " + s.getSemesterNumber()
                );
            }
        }
    }


    public static void viewStudentsByDepartment(String deptId)
    {
        List<Student> students = StudentRepository.getAllStudents();

        System.out.println("\nStudents in Department: " + deptId);

        for(Student s : students)
        {
            if(s.getStatus().equals(Student.ACTIVE) &&
               s.getDeptId().equals(deptId))
            {
                System.out.println(s.getStudentId() + " - " + s.getStudentName());
            }
        }
    }


    public static void viewStudentsByCourse(String courseId)
    {
        List<Student> students = StudentRepository.getAllStudents();

        System.out.println("\nStudents in Course: " + courseId);

        for(Student s : students)
        {
            if(s.getStatus().equals(Student.ACTIVE) &&
               s.getCourseId().equals(courseId))
            {
                System.out.println(s.getStudentId() + " - " + s.getStudentName());
            }
        }
    }


    public static void viewStudentsBySemester(String courseId, int semester)
    {
        List<Student> students = StudentRepository.getAllStudents();

        System.out.println("\nStudents in Course " + courseId +
                           " Semester " + semester);

        for(Student s : students)
        {
            if(s.getStatus().equals(Student.ACTIVE) &&
               s.getCourseId().equals(courseId) &&
               s.getSemesterNumber() == semester)
            {
                System.out.println(s.getStudentId() + " - " + s.getStudentName());
            }
        }
    }


    public static void deleteStudent(String studentId)
    {
        boolean result = StudentRepository.softDeleteStudent(studentId);

        if(result)
        {
            System.out.println("Student deleted successfully.");
        }
        else
        {
            System.out.println("Student not found.");
        }
    }
}