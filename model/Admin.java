public class Admin
{
    /* Instance variables */
    private String adminId;
    private String password;

    /* Default Constructor */
    public Admin()
    {
        this("", "");  
    }

    /* Parameterized Constructor */
    public Admin(String adminId, String password)
    {
        this.adminId = adminId;
        this.password = password;
    }

    /* Getter & Setter Methods */

    public String getAdminId()
    {
        return adminId;
    }

    public void setAdminId(String adminId)
    {
        this.adminId = adminId;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}