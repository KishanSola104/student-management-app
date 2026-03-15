package model;

public class Semester
{
    /* Instance Variables */
    private String semesterId;
    private String courseId;
    private int semesterNumber;
    private int numOfSubjects;
    private int numOfStudents;
    private String status;

    /* Default Constructor */
    public Semester()
    {
        this("", "", 0, 0, 0, "ACTIVE");
    }

    /* Parameterized Constructor */
    public Semester(String semesterId, String courseId,
                    int semesterNumber, int numOfSubjects,
                    int numOfStudents, String status)
    {
        this.semesterId = semesterId;
        this.courseId = courseId;
        this.semesterNumber = semesterNumber;
        this.numOfSubjects = numOfSubjects;
        this.numOfStudents = numOfStudents;
        this.status = status;
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

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}