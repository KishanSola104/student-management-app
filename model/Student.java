public class Student
{
    /* Instance Variables */
    private String studentId;
    private String studentName;
    private String deptId;
    private String courseId;
    private String semesterId;

    /* Default Constructor */
    public Student()
    {
        this("", "", "", "", "");
    }

    /* Parameterized Constructor */
    public Student(String studentId, String studentName, String deptId, String courseId, String semesterId)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.deptId = deptId;
        this.courseId = courseId;
        this.semesterId = semesterId;
    }

    /* Getter and Setter Methods */

    public String getStudentId()
    {
        return studentId;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
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

    public String getSemesterId()
    {
        return semesterId;
    }

    public void setSemesterId(String semesterId)
    {
        this.semesterId = semesterId;
    }
}