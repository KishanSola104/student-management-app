package repository;

import java.io.*;
import java.util.*;

import model.Course;

public class CourseRepository
{
    private static final String FILE_PATH = "repository/files/courses.csv";

    public static void addCourse(Course course)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true));

            writer.write(
                    course.getCourseId() + "," +
                    course.getCourseName() + "," +
                    course.getDeptId() + "," +
                    course.getNumOfStudents() + "," +
                    course.getNumOfFaculties() + "," +
                    course.getNumOfSemesters() + "," +
                    course.getStatus()
            );

            writer.newLine();
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error writing course file: " + e.getMessage());
        }
    }

    public static List<Course> getAllCourses()
    {
        List<Course> courseList = new ArrayList<>();

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));

            String line;

            while((line = reader.readLine()) != null)
            {
                String[] data = line.split(",");

                if(data.length < 7) continue;

                Course course = new Course(
                        data[0],
                        data[1],
                        data[2],
                        Integer.parseInt(data[3]),
                        Integer.parseInt(data[4]),
                        Integer.parseInt(data[5]),
                        data[6]
                );

                courseList.add(course);
            }

            reader.close();
        }
        catch(Exception e)
        {
            System.out.println("Error reading courses file: " + e.getMessage());
        }

        return courseList;
    }

    public static boolean softDeleteCourse(String courseId)
    {
        List<Course> courses = getAllCourses();
        boolean found = false;

        for(Course c : courses)
        {
            if(c.getCourseId().equals(courseId))
            {
                c.setStatus("INACTIVE");
                found = true;
            }
        }

        if(found)
        {
            rewriteFile(courses);
        }

        return found;
    }

    private static void rewriteFile(List<Course> courses)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH));

            for(Course c : courses)
            {
                writer.write(
                        c.getCourseId() + "," +
                        c.getCourseName() + "," +
                        c.getDeptId() + "," +
                        c.getNumOfStudents() + "," +
                        c.getNumOfFaculties() + "," +
                        c.getNumOfSemesters() + "," +
                        c.getStatus()
                );

                writer.newLine();
            }

            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error updating courses file: " + e.getMessage());
        }
    }
}