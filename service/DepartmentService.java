package service;

import java.util.List;

import model.Department;
import repository.DepartmentRepository;

public class DepartmentService
{
    public static void addDepartment(String deptId, String deptName)
    {
        Department dept = new Department(deptId, deptName, 0, 0, 0, "ACTIVE");

        DepartmentRepository.addDepartment(dept);

        System.out.println("Department added successfully!");
    }

    public static void viewDepartments()
    {
        List<Department> departments = DepartmentRepository.getAllDepartments();

        if(departments.isEmpty())
        {
            System.out.println("No departments found.");
            return;
        }

        System.out.println("\n----- Department List -----");

        for(Department d : departments)
        {
            if(d.getStatus().equals("ACTIVE"))
            {
                System.out.println(
                        d.getDeptId() + " - " +
                        d.getDeptName() +
                        " | Courses: " + d.getNumOfCourses() +
                        " | Students: " + d.getNumOfStudents() +
                        " | Faculty: " + d.getNumOfFaculties()
                );
            }
        }
    }

    public static void deleteDepartment(String deptId)
    {
        boolean result = DepartmentRepository.softDeleteDepartment(deptId);

        if(result)
        {
            System.out.println("Department deleted successfully (Soft Delete).");
        }
        else
        {
            System.out.println("Department not found.");
        }
    }
}