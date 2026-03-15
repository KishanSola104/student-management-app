package model;

public class Course
{
    private String courseId;
    private String courseName;
    private String deptId;
    private int numOfStudents;
    private int numOfFaculties;
    private int numOfSemesters;
    private String status;

    public Course()
    {
        this("", "", "", 0, 0, 0, "ACTIVE");
    }

    public Course(String courseId, String courseName, String deptId,
                  int numOfStudents, int numOfFaculties,
                  int numOfSemesters, String status)
    {
        this.courseId = courseId;
        this.courseName = courseName;
        this.deptId = deptId;
        this.numOfStudents = numOfStudents;
        this.numOfFaculties = numOfFaculties;
        this.numOfSemesters = numOfSemesters;
        this.status = status;
    }

    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getDeptId() { return deptId; }
    public void setDeptId(String deptId) { this.deptId = deptId; }

    public int getNumOfStudents() { return numOfStudents; }
    public void setNumOfStudents(int numOfStudents) { this.numOfStudents = numOfStudents; }

    public int getNumOfFaculties() { return numOfFaculties; }
    public void setNumOfFaculties(int numOfFaculties) { this.numOfFaculties = numOfFaculties; }

    public int getNumOfSemesters() { return numOfSemesters; }
    public void setNumOfSemesters(int numOfSemesters) { this.numOfSemesters = numOfSemesters; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}