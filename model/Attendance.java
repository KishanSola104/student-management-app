public class Attendance
{
    /* Instance Variables */
    private String deptId;
    private String courseId;
    private String semesterId;
    private String subjectId;
    private String studentId;
    private String attendanceDate;
    private String status; // Present or Absent

    /* Default Constructor */
    public Attendance()
    {
        this("", "", "", "", "", "", "");
    }

    /* Parameterized Constructor */
    public Attendance(String deptId, String courseId, String semesterId,
                      String subjectId, String studentId,
                      String attendanceDate, String status)
    {
        this.deptId = deptId;
        this.courseId = courseId;
        this.semesterId = semesterId;
        this.subjectId = subjectId;
        this.studentId = studentId;
        this.attendanceDate = attendanceDate;
        this.status = status;
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

    public String getSubjectId()
    {
        return subjectId;
    }

    public void setSubjectId(String subjectId)
    {
        this.subjectId = subjectId;
    }

    public String getStudentId()
    {
        return studentId;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public String getAttendanceDate()
    {
        return attendanceDate;
    }

    public void setAttendanceDate(String attendanceDate)
    {
        this.attendanceDate = attendanceDate;
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