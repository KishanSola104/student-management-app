public class Semester
{
    /* Instance Variables */
    private String semesterId;
    private String deptId;
    private String courseId;
    private int numOfSubjects;
    private int numOfStudents;

    /* Default Constructor */
    public Semester()
    {
        this("", "", "", 0, 0);
    }

    /* Parameterized Constructor */
    public Semester(String semesterId, String deptId, String courseId, int numOfSubjects, int numOfStudents)
    {
        this.semesterId = semesterId;
        this.deptId = deptId;
        this.courseId = courseId;
        this.numOfSubjects = numOfSubjects;
        this.numOfStudents = numOfStudents;
    }

    /* Getter and Setter Methods */

    public String getSemesterId()
    {
        return semesterId;
    }

    public void setSemesterId(String semesterId)
    {
        this.semesterId = semesterId;
    }

    public String getDeptId()
    {
        return deptId;
    }

    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
    }

    public String getCourseId()
    {
        return courseId;
    }

    public void setCourseId(String courseId)
    {
        this.courseId = courseId;
    }

    public int getNumOfSubjects()
    {
        return numOfSubjects;
    }

    public void setNumOfSubjects(int numOfSubjects)
    {
        this.numOfSubjects = numOfSubjects;
    }

    public int getNumOfStudents()
    {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents)
    {
        this.numOfStudents = numOfStudents;
    }
}