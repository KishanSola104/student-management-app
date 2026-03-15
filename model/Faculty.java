package model;

public class Faculty
{
    public static final String ACTIVE = "ACTIVE";
    public static final String INACTIVE = "INACTIVE";

    private String facultyId;
    private String facultyName;
    private String password;
    private String deptId;
    private String courseId;
    private String status;

    public Faculty()
    {
        this("", "", "", "", "", ACTIVE);
    }

    public Faculty(String facultyId, String facultyName, String password,
                   String deptId, String courseId, String status)
    {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.password = password;
        this.deptId = deptId;
        this.courseId = courseId;
        this.status = status;
    }

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

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
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

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}