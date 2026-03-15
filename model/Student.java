package model;

public class Student
{
    /* Status Constants */
    public static final String ACTIVE = "ACTIVE";
    public static final String INACTIVE = "INACTIVE";

    /* Instance Variables */
    private String studentId;
    private String studentName;
    private String deptId;
    private String courseId;
    private int semesterNumber;
    private String status;

    /* Default Constructor */
    public Student()
    {
        this("", "", "", "", 0, ACTIVE);
    }

    /* Parameterized Constructor */
    public Student(String studentId, String studentName,
                   String deptId, String courseId,
                   int semesterNumber, String status)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.deptId = deptId;
        this.courseId = courseId;
        this.semesterNumber = semesterNumber;
        this.status = status;
    }

    /* Getters and Setters */

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

    public int getSemesterNumber()
    {
        return semesterNumber;
    }

    public void setSemesterNumber(int semesterNumber)
    {
        this.semesterNumber = semesterNumber;
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