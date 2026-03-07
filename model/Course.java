public class Course
{
    /* Instance Variables */
    private String courseId;
    private String courseName;
    private String deptId;
    private int numOfStudents;
    private int numOfFaculties;
    private int numOfSemesters;

    /* Default Constructor */
    public Course()
    {
        this("", "", "", 0, 0, 0);
    }

    /* Parameterized Constructor */
    public Course(String courseId, String courseName, String deptId,
                  int numOfStudents, int numOfFaculties, int numOfSemesters)
    {
        this.courseId = courseId;
        this.courseName = courseName;
        this.deptId = deptId;
        this.numOfStudents = numOfStudents;
        this.numOfFaculties = numOfFaculties;
        this.numOfSemesters = numOfSemesters;
    }

    /* Getter and Setter Methods */

    public String getCourseId()
    {
        return courseId;
    }

    public void setCourseId(String courseId)
    {
        this.courseId = courseId;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getDeptId()
    {
        return deptId;
    }

    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
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

    public int getNumOfSemesters()
    {
        return numOfSemesters;
    }

    public void setNumOfSemesters(int numOfSemesters)
    {
        this.numOfSemesters = numOfSemesters;
    }
}