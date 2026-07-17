public class Admin extends User {

    public Admin(String name, String email, String username, String password) {
        super(name, email, username, password);
    }

    public void displayAdminMenu() {
        System.out.println("\n===== ADMIN MENU =====");
        System.out.println("1. Add Question");
        System.out.println("2. View All Questions");
        System.out.println("3. View All Students");
        System.out.println("4. Logout");
    }
}