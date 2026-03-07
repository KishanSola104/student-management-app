public class Subject
{
    /* Instance Variables */
    private String subjectId;
    private String subjectName;
    private int subjectCredits;
    private String deptId;
    private String courseId;
    private String semesterId;

    /* Default Constructor */
    public Subject()
    {
        this("", "", 0, "", "", "");
    }

    /* Parameterized Constructor */
    public Subject(String subjectId, String subjectName, int subjectCredits,
                   String deptId, String courseId, String semesterId)
    {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.subjectCredits = subjectCredits;
        this.deptId = deptId;
        this.courseId = courseId;
        this.semesterId = semesterId;
    }

    /* Getter and Setter Methods */

    public String getSubjectId()
    {
        return subjectId;
    }

    public void setSubjectId(String subjectId)
    {
        this.subjectId = subjectId;
    }

    public String getSubjectName()
    {
        return subjectName;
    }

    public void setSubjectName(String subjectName)
    {
        this.subjectName = subjectName;
    }

    public int getSubjectCredits()
    {
        return subjectCredits;
    }

    public void setSubjectCredits(int subjectCredits)
    {
        this.subjectCredits = subjectCredits;
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