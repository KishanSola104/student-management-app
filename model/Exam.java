public class Exam
{
    /* Instance Variables */
    private String examId;
    private String examName;
    private String deptId;
    private String courseId;
    private String semesterId;
    private String subjectId;

    /* Default Constructor */
    public Exam()
    {
        this("", "", "", "", "", "");
    }

    /* Parameterized Constructor */
    public Exam(String examId, String examName, String deptId,
                String courseId, String semesterId, String subjectId)
    {
        this.examId = examId;
        this.examName = examName;
        this.deptId = deptId;
        this.courseId = courseId;
        this.semesterId = semesterId;
        this.subjectId = subjectId;
    }

    /* Getter and Setter Methods */

    public String getExamId()
    {
        return examId;
    }

    public void setExamId(String examId)
    {
        this.examId = examId;
    }

    public String getExamName()
    {
        return examName;
    }

    public void setExamName(String examName)
    {
        this.examName = examName;
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

    public String getSubjectId()
    {
        return subjectId;
    }

    public void setSubjectId(String subjectId)
    {
        this.subjectId = subjectId;
    }
}