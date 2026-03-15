package main;

import java.util.Scanner;

import service.AdminService;
import service.FacultyService;

public class StudentManagementApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n====== STUDENT MANAGEMENT SYSTEM ======");
            System.out.println("1. Admin Login");
            System.out.println("2. Faculty Login");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    adminLogin();
                    break;

                case 2:
                    facultyLogin();
                    break;

                case 3:
                    System.out.println("Exiting System...");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    /* Admin Login */
    private static void adminLogin() {
        System.out.println("\n------ Admin Login ------");

        int attempts = 3;

        while (attempts > 0) {
            try {
                System.out.print("Enter Admin ID: ");
                String adminId = scanner.nextLine();

                System.out.print("Enter Password: ");
                String password = scanner.nextLine();

                boolean isValid = AdminService.login(adminId, password);

                if (isValid) {
                    System.out.println("Login Successful!");
                    AdminDashboard.showMenu();
                    return;
                } else {
                    attempts--;
                    System.out.println("Invalid Credentials!");

                    if (attempts > 0) {
                        System.out.println("Attempts left: " + attempts);
                    } else {
                        System.out.println("Login failed. Returning to main menu.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    /* Faculty Login */
    private static void facultyLogin() {
        System.out.println("\n------ Faculty Login ------");

        int attempts = 3;

        while (attempts > 0) {
            try {
                System.out.print("Enter Faculty ID: ");
                String facultyId = scanner.nextLine();

                System.out.print("Enter Password: ");
                String password = scanner.nextLine();

                boolean isValid = FacultyService.login(facultyId, password);

                if (isValid) {
                    System.out.println("Login Successful!");
                    // FacultyDashboard.showMenu();
                    return;
                } else {
                    attempts--;
                    System.out.println("Invalid Credentials!");

                    if (attempts > 0) {
                        System.out.println("Attempts left: " + attempts);
                    } else {
                        System.out.println("Too many failed attempts.");
                        System.out.println("Returning to Main Menu...");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error during login: " + e.getMessage());
            }
        }
    }

}