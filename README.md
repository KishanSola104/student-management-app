# Student Management System

A console-based **Student Management System** built using **Core Java**, implementing **Object-Oriented Programming (OOP)** concepts and **file handling with CSV files** for data storage.  
The application follows a **layered architecture (Model – Service – Repository)** to maintain clean separation of concerns and better project organization.

This system allows administrators and faculty members to manage academic data such as departments, courses, semesters, subjects, students, marks, and attendance efficiently.

---

## Features

### Admin Module
The admin can perform the following tasks:

- Add and manage **Departments**
- Create and manage **Courses** under departments
- Define **Semesters** for courses
- Add **Subjects** for each semester
- Register **Students** and assign them to courses and semesters
- Add **Faculty members**
- Generate and manage **faculty login credentials**
- Manage the academic structure of the system

### Faculty Module
Faculty members can:

- Login using their credentials
- Select **course, semester, and subject**
- Enter **student marks**
- Record **student attendance**
- View student records
- Generate **marksheets**
- Generate **attendance reports**

---

## Architecture

This project follows a **Layered Architecture** to separate responsibilities within the application.

Main (Console UI)  
↓  
Service Layer (Business Logic)  
↓  
Repository Layer (File Handling)  
↓  
CSV Files (Data Storage)

### Model Layer
Contains **POJO classes** representing system entities such as:

- Admin
- Faculty
- Department
- Course
- Semester
- Subject
- Student
- Exam
- Marks
- Attendance
- Marksheet

These classes include:
- Instance variables
- Constructors
- Getters and setters

### Service Layer
Handles **business logic**, including:

- Data validation
- Processing marks
- Calculating percentages and grades
- Generating marksheets
- Managing system operations

### Repository Layer
Handles **data persistence using CSV files**.

Responsibilities include:

- Reading CSV files
- Writing data to CSV files
- Converting CSV rows into Java objects
- Storing objects as CSV records

---

## Data Storage

The system stores all data in **CSV files instead of using a database**.

Advantages of CSV storage:

- Simple and lightweight
- Easy to read and edit
- No database configuration required

Example of a student record in CSV:


S101,John Doe,C01,SEM1
S102,Alice Smith,C01,SEM1


---

## Technologies Used

- Java (Core Java)
- Object-Oriented Programming (OOP)
- File Handling
- CSV File Storage
- Layered Architecture

---

## Purpose of the Project

This project demonstrates:

- Strong understanding of **Core Java**
- Implementation of **OOP principles**
- Designing a **layered architecture**
- Handling data using **file-based storage**
- Building a **real-world academic management system**

---

## Future Improvements

Possible future enhancements include:

- Integrating a **database (MySQL / PostgreSQL)**
- Adding a **GUI using JavaFX or Swing**
- Implementing **REST APIs using Spring Boot**
- Converting the system into a **web application**
- Adding **authentication and role-based access control**

---

## Author

Developed by **Kishankumar Solanki**