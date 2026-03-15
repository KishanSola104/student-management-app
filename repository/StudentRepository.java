package repository;

import java.io.*;
import java.util.*;

import model.Student;

public class StudentRepository
{
    private static final String FILE_PATH = "repository/files/students.csv";


    public static boolean addStudent(Student student)
    {
        try(BufferedWriter writer =
                new BufferedWriter(new FileWriter(FILE_PATH, true)))
        {
            writer.write(
                    student.getStudentId() + "," +
                    student.getStudentName() + "," +
                    student.getDeptId() + "," +
                    student.getCourseId() + "," +
                    student.getSemesterNumber() + "," +
                    student.getStatus()
            );

            writer.newLine();

            return true;
        }
        catch(Exception e)
        {
            System.out.println("Error writing student file: " + e.getMessage());
            return false;
        }
    }


    public static List<Student> getAllStudents()
    {
        List<Student> studentList = new ArrayList<>();

        try(BufferedReader reader =
                new BufferedReader(new FileReader(FILE_PATH)))
        {
            String line;

            while((line = reader.readLine()) != null)
            {
                String[] data = line.split(",");

                if(data.length < 6) continue;

                Student student = new Student(
                        data[0],
                        data[1],
                        data[2],
                        data[3],
                        Integer.parseInt(data[4]),
                        data[5]
                );

                studentList.add(student);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error reading student file: " + e.getMessage());
        }

        return studentList;
    }


    public static boolean softDeleteStudent(String studentId)
    {
        List<Student> students = getAllStudents();
        boolean found = false;

        for(Student s : students)
        {
            if(s.getStudentId().equals(studentId))
            {
                s.setStatus(Student.INACTIVE);
                found = true;
            }
        }

        if(found)
        {
            return rewriteFile(students);
        }

        return false;
    }


    private static boolean rewriteFile(List<Student> students)
    {
        try(BufferedWriter writer =
                new BufferedWriter(new FileWriter(FILE_PATH)))
        {
            for(Student s : students)
            {
                writer.write(
                        s.getStudentId() + "," +
                        s.getStudentName() + "," +
                        s.getDeptId() + "," +
                        s.getCourseId() + "," +
                        s.getSemesterNumber() + "," +
                        s.getStatus()
                );

                writer.newLine();
            }

            return true;
        }
        catch(Exception e)
        {
            System.out.println("Error updating student file: " + e.getMessage());
            return false;
        }
    }
}