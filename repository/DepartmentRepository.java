package repository;

import java.io.*;
import java.util.*;

import model.Department;

public class DepartmentRepository
{
    private static final String FILE_PATH = "repository/files/departments.csv";

    public static void addDepartment(Department dept)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true));

            writer.write(
                    dept.getDeptId() + "," +
                    dept.getDeptName() + "," +
                    dept.getNumOfCourses() + "," +
                    dept.getNumOfStudents() + "," +
                    dept.getNumOfFaculties() + "," +
                    dept.getStatus()
            );

            writer.newLine();
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error writing department file: " + e.getMessage());
        }
    }

    public static List<Department> getAllDepartments()
    {
        List<Department> deptList = new ArrayList<>();

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));

            String line;

            while((line = reader.readLine()) != null)
            {
                String[] data = line.split(",");

                if(data.length < 6) continue;

                Department dept = new Department(
                        data[0],
                        data[1],
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3]),
                        Integer.parseInt(data[4]),
                        data[5]
                );

                deptList.add(dept);
            }

            reader.close();
        }
        catch(Exception e)
        {
            System.out.println("Error reading departments file: " + e.getMessage());
        }

        return deptList;
    }

    public static boolean softDeleteDepartment(String deptId)
    {
        List<Department> departments = getAllDepartments();
        boolean found = false;

        for(Department d : departments)
        {
            if(d.getDeptId().equals(deptId))
            {
                d.setStatus("INACTIVE");
                found = true;
            }
        }

        if(found)
        {
            rewriteFile(departments);
        }

        return found;
    }

    private static void rewriteFile(List<Department> departments)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH));

            for(Department d : departments)
            {
                writer.write(
                        d.getDeptId() + "," +
                        d.getDeptName() + "," +
                        d.getNumOfCourses() + "," +
                        d.getNumOfStudents() + "," +
                        d.getNumOfFaculties() + "," +
                        d.getStatus()
                );

                writer.newLine();
            }

            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error updating department file: " + e.getMessage());
        }
    }
}