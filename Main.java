import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("testU - an exam portal for students to practice and prepare for their exams.");

        System.out.println("---------------------------------------------------------------------------------");
        int attempt=0;
        while(attempt<3){
            System.out.println("Enter your username:");
            String name=sc.nextLine();
            System.out.println("password: ");
            String password=sc.nextLine();

            if(name.equals("Afeefa9500") && password.equals("ZB4LmJP7")){
                System.out.println("Login Successful!");
                return;
            }
            attempt++;
            if(attempt<3){
                System.out.println("Invalid credentials. Please try again");
            }
        }
        System.out.println("You have exceeded the maximum number of attempts. Please try again later.");
    }
}