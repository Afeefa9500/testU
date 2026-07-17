# testU - Console Based Online Examination System

testU is a menu-driven console application developed in Java that simulates an online examination system. It allows students to register, log in, attempt multiple-choice tests, view previous scores, and manage their profiles, while administrators can manage the question bank and monitor registered students.

This project was developed to strengthen Object-Oriented Programming concepts and Java fundamentals.

---

##  Features

### Student Module
- Student Registration
- Secure Login (3 login attempts)
- Take Multiple Choice Tests
- View Profile
- Update Profile
- View Previous Scores
- Logout

### Admin Module
- Admin Login
- Add New Questions
- View Question Bank
- View Registered Students
- Logout

### Test Module
- Multiple Choice Questions
- Automatic Score Calculation
- Score History
- Input Validation

---

##  Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- Constructors
- Inheritance
- Encapsulation
- Method Overriding
- Scanner Class
- Menu-Driven Programming

---

##  Project Structure

```
testU
│
├── Main.java
├── User.java
├── Student.java
├── Admin.java
├── Question.java
└── Test.java
```


##  Class Responsibilities

### User.java
Base class containing common user details and profile management.

### Student.java
Extends the User class and stores previous test scores.

### Admin.java
Extends the User class and provides administrator functionality.

### Question.java
Represents a multiple-choice question with four options and the correct answer.

### Test.java
Handles question management, test execution, score calculation, and result storage.

### Main.java
Controls application flow, authentication, menus, and interactions between all classes.


## Object-Oriented Concepts Implemented

- Inheritance
- Encapsulation
- Constructor Chaining
- Composition
- Polymorphism (through inherited methods)
- Object Creation
- Method Reusability

## Sample Workflow

```
Main Menu
│
├── Student Registration
├── Student Login
│      │
│      ├── Take Test
│      ├── View Profile
│      ├── Update Profile
│      ├── Previous Scores
│      └── Logout
│
├── Admin Login
│      │
│      ├── Add Question
│      ├── View Questions
│      ├── View Students
│      └── Logout
│
└── Exit
```


##  Future Enhancements

- File Handling for Persistent Storage
- Timer-Based Tests
- Randomized Question Generation
- Difficulty Levels
- Result Analytics
- Percentage and Grade Calculation
- Database Integration (MySQL)
- Java Swing/JavaFX GUI
- Web-Based Version

---

## Learning Outcomes

This project demonstrates practical implementation of:

- Java Fundamentals
- Object-Oriented Programming
- Collection Framework (ArrayList)
- Menu-Driven Application Design
- User Authentication
- Modular Programming
- Java Project Organization

---

## Author

**AFEEFA AZMI SHAIK**

B.Tech Computer Science Engineering

VIT-AP University

GitHub: https://github.com/Afeefa9500
