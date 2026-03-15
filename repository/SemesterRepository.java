package repository;

import java.io.*;
import java.util.*;

import model.Semester;

public class SemesterRepository
{
    private static final String FILE_PATH = "repository/files/semesters.csv";

    public static void addSemester(Semester semester)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true));

            writer.write(
                    semester.getSemesterId() + "," +
                    semester.getCourseId() + "," +
                    semester.getSemesterNumber() + "," +
                    semester.getNumOfSubjects() + "," +
                    semester.getNumOfStudents() + "," +
                    semester.getStatus()
            );

            writer.newLine();
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error writing semester file: " + e.getMessage());
        }
    }

    public static List<Semester> getAllSemesters()
    {
        List<Semester> semesterList = new ArrayList<>();

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));

            String line;

            while((line = reader.readLine()) != null)
            {
                String[] data = line.split(",");

                if(data.length < 6) continue;

                Semester semester = new Semester(
                        data[0],
                        data[1],
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3]),
                        Integer.parseInt(data[4]),
                        data[5]
                );

                semesterList.add(semester);
            }

            reader.close();
        }
        catch(Exception e)
        {
            System.out.println("Error reading semester file: " + e.getMessage());
        }

        return semesterList;
    }

    public static boolean softDeleteSemester(String semesterId)
    {
        List<Semester> semesters = getAllSemesters();
        boolean found = false;

        for(Semester s : semesters)
        {
            if(s.getSemesterId().equals(semesterId))
            {
                s.setStatus("INACTIVE");
                found = true;
            }
        }

        if(found)
        {
            rewriteFile(semesters);
        }

        return found;
    }

    private static void rewriteFile(List<Semester> semesters)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH));

            for(Semester s : semesters)
            {
                writer.write(
                        s.getSemesterId() + "," +
                        s.getCourseId() + "," +
                        s.getSemesterNumber() + "," +
                        s.getNumOfSubjects() + "," +
                        s.getNumOfStudents() + "," +
                        s.getStatus()
                );

                writer.newLine();
            }

            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error updating semester file: " + e.getMessage());
        }
    }
}