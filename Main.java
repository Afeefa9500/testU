import java.util.*;
public class Main{
    static String name="Afeefa";
    static String email="afeefa@gmail.com";
    static String username="Afeefa9500";
    static String password="ZB4LmJP7";
    static void displayMenu(Scanner sc){
        int choice;
        
        do{
            System.out.println("-----------------------------------------------");
            System.out.println("1.Take test");
            System.out.println("2.View Profile");
            System.out.println("3.View Previous Scores");
            System.out.println("4.Update Profile");
            System.out.println("5.Logout");
            System.out.println("-----------------------------------------------");
            System.out.println();
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            sc.nextLine(); // Consume the newline character
                switch (choice) {
                case 1:
                    System.out.println("Preparing test...");
                    takeTest();
                    break;
                case 2:
                    System.out.println("Details: ");
                    viewProfile();
                    break;
                case 3:
                    System.out.println("Previous Scores: ");
                    viewScores();
                    break;
                case 4:
                    System.out.println("Update Profile:");
                    updateProfile(sc);
                    break;
                case 5:
                    logout();
                    System.out.println("Thank you for using testU.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
                
                }
            }while(choice!=5);
    }
    static boolean Login(String ipname, String ippassword){

        return username.equals(ipname) && password.equals(ippassword);
    }
    static void takeTest(){
        System.out.println("Test started...");
        // Add test logic here
    }
    static void viewProfile(){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
    }
    static void viewScores(){
        System.out.println("Math: 85");
        System.out.println("Science: 90");
        System.out.println("English: 88");
    }
    static void updateProfile(Scanner sc){
        // Add update profile logic here
         
        System.out.println("Enter new name: ");
        name = sc.nextLine();
        System.out.println("Enter new email: ");
        email = sc.nextLine();
        System.out.println("Enter new password: ");
        password = sc.nextLine();
        System.out.println("Profile updated successfully.");
         
    }
    static void logout(){
        System.out.println("Log out successful");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("testU - an exam portal for students to practice and prepare for their exams.");

        System.out.println("---------------------------------------------------------------------------------");
        
        int attempt=1;
        while(attempt<=3){
            System.out.println("Enter username: ");
            String username=sc.nextLine(); 
            System.out.println("Enter password: ");
            String password=sc.nextLine();
            if(Login(username, password)){
                System.out.println("Login successful");
                displayMenu(sc);
                break;
            }
            else{
                if(attempt<3){
                    System.out.println("Login failed. Invalid username or password.");
                }
                else{
                    System.out.println("You have exceeded the maximum number of attempts.");
                    break;
                }
                attempt++;
            }

        }
        sc.close();
    }
}