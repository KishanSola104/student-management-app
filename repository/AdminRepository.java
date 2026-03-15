package repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import model.Admin;

public class AdminRepository {
    private static final String FILE_PATH = "repository/files/admin.csv";

    public static List<Admin> getAllAdmins() {
        List<Admin> adminList = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length >= 2) {
                    String adminId = data[0];
                    String password = data[1];

                    Admin admin = new Admin(adminId, password);
                    adminList.add(admin);
                }
            }

            reader.close();
        } catch (Exception e) {
            System.out.println("Error reading admin file: " + e.getMessage());
        }

        return adminList;
    }
}