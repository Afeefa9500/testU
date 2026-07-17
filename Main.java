import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Student> students = new ArrayList<>();

    static Admin admin = new Admin(
            "Administrator",
            "admin@testu.com",
            "admin",
            "admin123");

    static Test test = new Test();

    public static void main(String[] args) {

        loadDefaultQuestions();

        while (true) {

            System.out.println("\n========== testU ==========");
            System.out.println("1. Student Registration");
            System.out.println("2. Student Login");
            System.out.println("3. Admin Login");
            System.out.println("4. Exit");
            System.out.print("Enter choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    registerStudent();
                    break;

                case 2:
                    studentLogin();
                    break;

                case 3:
                    adminLogin();
                    break;

                case 4:
                    System.out.println("Thank you for using testU!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }

    static void registerStudent() {

        System.out.print("Name : ");
        String name = sc.nextLine();

        System.out.print("Email : ");
        String email = sc.nextLine();

        System.out.print("Username : ");
        String username = sc.nextLine();

        for (Student s : students) {
            if (s.getUsername().equals(username)) {
                System.out.println("Username already exists.");
                return;
            }
        }

        System.out.print("Password : ");
        String password = sc.nextLine();

        students.add(new Student(name, email, username, password));

        System.out.println("Registration Successful!");
    }

    static void studentLogin() {

        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Username : ");
            String username = sc.nextLine();

            System.out.print("Password : ");
            String password = sc.nextLine();

            for (Student s : students) {

                if (s.getUsername().equals(username)
                        && s.getPassword().equals(password)) {

                    System.out.println("Login Successful!");

                    studentMenu(s);
                    return;
                }
            }

            attempts--;

            System.out.println("Invalid Credentials.");

            if (attempts > 0)
                System.out.println("Attempts Left : " + attempts);
        }

        System.out.println("Login Failed.");
    }

    static void studentMenu(Student student) {

        int choice;

        do {

            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Take Test");
            System.out.println("2. View Profile");
            System.out.println("3. Update Profile");
            System.out.println("4. Previous Scores");
            System.out.println("5. Logout");

            System.out.print("Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    test.conductTest(student, sc);
                    break;

                case 2:
                    student.displayProfile();
                    break;

                case 3:

                    System.out.print("New Name : ");
                    String name = sc.nextLine();

                    System.out.print("New Email : ");
                    String email = sc.nextLine();

                    System.out.print("New Username : ");
                    String username = sc.nextLine();

                    System.out.print("New Password : ");
                    String password = sc.nextLine();

                    student.updateProfile(name, email, username, password);

                    break;

                case 4:
                    student.viewPreviousScores();
                    break;

                case 5:
                    System.out.println("Logged Out.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);
    }

    static void adminLogin() {

        System.out.print("Username : ");
        String username = sc.nextLine();

        System.out.print("Password : ");
        String password = sc.nextLine();

        if (username.equals(admin.getUsername())
                && password.equals(admin.getPassword())) {

            adminMenu();
        } else {

            System.out.println("Invalid Admin Credentials.");
        }
    }

    static void adminMenu() {

        int choice;

        do {

            admin.displayAdminMenu();

            System.out.print("Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Question : ");
                    String q = sc.nextLine();

                    System.out.print("Option 1 : ");
                    String o1 = sc.nextLine();

                    System.out.print("Option 2 : ");
                    String o2 = sc.nextLine();

                    System.out.print("Option 3 : ");
                    String o3 = sc.nextLine();

                    System.out.print("Option 4 : ");
                    String o4 = sc.nextLine();

                    System.out.print("Correct Option (1-4): ");
                    int ans = sc.nextInt();
                    sc.nextLine();

                    test.addQuestion(new Question(q, o1, o2, o3, o4, ans));

                    System.out.println("Question Added.");
                    break;

                case 2:
                    test.viewQuestions();
                    break;

                case 3:

                    if (students.isEmpty()) {
                        System.out.println("No Students Registered.");
                    } else {

                        for (Student s : students) {
                            s.displayProfile();
                        }
                    }

                    break;

                case 4:
                    System.out.println("Logged Out.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);
    }

    static void loadDefaultQuestions() {

        test.addQuestion(new Question(
                "Which language is platform independent?",
                "C",
                "Java",
                "Python",
                "C++",
                2));

        test.addQuestion(new Question(
                "Which data structure follows FIFO?",
                "Stack",
                "Queue",
                "Tree",
                "Graph",
                2));

        test.addQuestion(new Question(
                "Which keyword is used for inheritance?",
                "implements",
                "extends",
                "inherit",
                "super",
                2));

        test.addQuestion(new Question(
                "Which loop executes at least once?",
                "for",
                "while",
                "do while",
                "foreach",
                3));

        test.addQuestion(new Question(
                "Java is a ____ language.",
                "Procedural",
                "Object Oriented",
                "Machine",
                "Assembly",
                2));
    }
}