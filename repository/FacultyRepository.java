package repository;

import java.io.*;
import java.util.*;

import model.Faculty;

public class FacultyRepository
{
    private static final String FILE_PATH = "repository/files/faculty.csv";

    public static List<Faculty> getAllFaculty()
    {
        List<Faculty> facultyList = new ArrayList<>();

        try(BufferedReader reader =
            new BufferedReader(new FileReader(FILE_PATH)))
        {
            String line;

            while((line = reader.readLine()) != null)
            {
                String[] data = line.split(",");

                if(data.length < 6) continue;

                Faculty faculty = new Faculty(
                        data[0],
                        data[1],
                        data[2],
                        data[3],
                        data[4],
                        data[5]
                );

                facultyList.add(faculty);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error reading faculty file: " + e.getMessage());
        }

        return facultyList;
    }


    public static boolean addFaculty(Faculty faculty)
    {
        try(BufferedWriter writer =
            new BufferedWriter(new FileWriter(FILE_PATH, true)))
        {
            writer.write(
                    faculty.getFacultyId() + "," +
                    faculty.getFacultyName() + "," +
                    faculty.getPassword() + "," +
                    faculty.getDeptId() + "," +
                    faculty.getCourseId() + "," +
                    faculty.getStatus()
            );

            writer.newLine();

            return true;
        }
        catch(Exception e)
        {
            System.out.println("Error writing faculty file: " + e.getMessage());
            return false;
        }
    }


    public static boolean softDeleteFaculty(String facultyId)
    {
        List<Faculty> facultyList = getAllFaculty();
        boolean found = false;

        for(Faculty f : facultyList)
        {
            if(f.getFacultyId().equals(facultyId))
            {
                f.setStatus(Faculty.INACTIVE);
                found = true;
            }
        }

        if(found)
        {
            return rewriteFile(facultyList);
        }

        return false;
    }


    private static boolean rewriteFile(List<Faculty> facultyList)
    {
        try(BufferedWriter writer =
            new BufferedWriter(new FileWriter(FILE_PATH)))
        {
            for(Faculty f : facultyList)
            {
                writer.write(
                        f.getFacultyId() + "," +
                        f.getFacultyName() + "," +
                        f.getPassword() + "," +
                        f.getDeptId() + "," +
                        f.getCourseId() + "," +
                        f.getStatus()
                );

                writer.newLine();
            }

            return true;
        }
        catch(Exception e)
        {
            System.out.println("Error updating faculty file: " + e.getMessage());
            return false;
        }
    }
}