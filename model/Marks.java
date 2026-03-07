public class Marks
{
    /* Instance Variables */
    private String deptId;
    private String courseId;
    private String semesterId;
    private String subjectId;
    private String examId;
    private String studentId;
    private double marks;

    /* Default Constructor */
    public Marks()
    {
        this("", "", "", "", "", "", 0.0);
    }

    /* Parameterized Constructor */
    public Marks(String deptId, String courseId, String semesterId,
                 String subjectId, String examId, String studentId, double marks)
    {
        this.deptId = deptId;
        this.courseId = courseId;
        this.semesterId = semesterId;
        this.subjectId = subjectId;
        this.examId = examId;
        this.studentId = studentId;
        this.marks = marks;
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

    public String getExamId()
    {
        return examId;
    }

    public void setExamId(String examId)
    {
        this.examId = examId;
    }

    public String getStudentId()
    {
        return studentId;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public double getMarks()
    {
        return marks;
    }

    public void setMarks(double marks)
    {
        this.marks = marks;
    }
}