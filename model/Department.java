public class Department
{
    /* Instance Variables */
    private String deptId;
    private String deptName;
    private int numOfCourses;
    private int numOfStudents;
    private int numOfFaculties;

    /* Default Constructor */
    public Department()
    {
        this("", "", 0, 0, 0);
    }

    /* Parameterized Constructor */
    public Department(String deptId, String deptName, int numOfCourses, int numOfStudents, int numOfFaculties)
    {
        this.deptId = deptId;
        this.deptName = deptName;
        this.numOfCourses = numOfCourses;
        this.numOfStudents = numOfStudents;
        this.numOfFaculties = numOfFaculties;
    }

    /* Getter and Setter Methods */

    public String getDeptId()
    {
        return deptId;
    }

    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
    }

    public String getDeptName()
    {
        return deptName;
    }

    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    public int getNumOfCourses()
    {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses)
    {
        this.numOfCourses = numOfCourses;
    }

    public int getNumOfStudents()
    {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents)
    {
        this.numOfStudents = numOfStudents;
    }

    public int getNumOfFaculties()
    {
        return numOfFaculties;
    }

    public void setNumOfFaculties(int numOfFaculties)
    {
        this.numOfFaculties = numOfFaculties;
    }
}