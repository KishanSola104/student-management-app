public class Marksheet
{
    /* Instance Variables */
    private String deptId;
    private String courseId;
    private String studentId;
    private String semesterId;
    private String examId;
    private double totalMarks;
    private double percentage;
    private String grade;

    /* Default Constructor */
    public Marksheet()
    {
        this("", "", "", "", "", 0.0, 0.0, "");
    }

    /* Parameterized Constructor */
    public Marksheet(String deptId, String courseId, String studentId,
                     String semesterId, String examId,
                     double totalMarks, double percentage, String grade)
    {
        this.deptId = deptId;
        this.courseId = courseId;
        this.studentId = studentId;
        this.semesterId = semesterId;
        this.examId = examId;
        this.totalMarks = totalMarks;
        this.percentage = percentage;
        this.grade = grade;
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

    public String getStudentId()
    {
        return studentId;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public String getSemesterId()
    {
        return semesterId;
    }

    public void setSemesterId(String semesterId)
    {
        this.semesterId = semesterId;
    }

    public String getExamId()
    {
        return examId;
    }

    public void setExamId(String examId)
    {
        this.examId = examId;
    }

    public double getTotalMarks()
    {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks)
    {
        this.totalMarks = totalMarks;
    }

    public double getPercentage()
    {
        return percentage;
    }

    public void setPercentage(double percentage)
    {
        this.percentage = percentage;
    }

    public String getGrade()
    {
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }
}