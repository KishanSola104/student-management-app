public class Faculty
{
    /* Instance Variables */
    private String facultyId;
    private String facultyName;
    private String facultyPassword;
    private String deptId;
    private String courseId;

    /* Default Constructor */
    public Faculty()
    {
        this("", "", "", "", "");
    }

    /* Parameterized Constructor */
    public Faculty(String facultyId, String facultyName, String facultyPassword, String deptId, String courseId)
    {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPassword = facultyPassword;
        this.deptId = deptId;
        this.courseId = courseId;
    }

    /* Getter and Setter Methods */

    public String getFacultyId()
    {
        return facultyId;
    }

    public void setFacultyId(String facultyId)
    {
        this.facultyId = facultyId;
    }

    public String getFacultyName()
    {
        return facultyName;
    }

    public void setFacultyName(String facultyName)
    {
        this.facultyName = facultyName;
    }

    public String getFacultyPassword()
    {
        return facultyPassword;
    }

    public void setFacultyPassword(String facultyPassword)
    {
        this.facultyPassword = facultyPassword;
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
}