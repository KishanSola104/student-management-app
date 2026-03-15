package service;

import java.util.List;
import model.Admin;
import repository.AdminRepository;

public class AdminService
{
    public static boolean login(String adminId, String password)
    {
        List<Admin> admins = AdminRepository.getAllAdmins();

        for(Admin admin : admins)
        {
            if(admin.getAdminId().equals(adminId) &&
               admin.getPassword().equals(password))
            {
                return true;
            }
        }

        return false;
    }
}