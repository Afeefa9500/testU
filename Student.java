import java.util.ArrayList;

public class Student extends User {

    private ArrayList<Integer> previousScores;

    public Student(String name, String email, String username, String password) {
        super(name, email, username, password);
        previousScores = new ArrayList<>();
    }

    public void addScore(int score) {
        previousScores.add(score);
    }

    public void viewPreviousScores() {
        System.out.println("\n===== PREVIOUS SCORES =====");

        if (previousScores.isEmpty()) {
            System.out.println("No tests attempted yet.");
            return;
        }

        for (int i = 0; i < previousScores.size(); i++) {
            System.out.println("Test " + (i + 1) + " : " + previousScores.get(i));
        }
    }

    public ArrayList<Integer> getPreviousScores() {
        return previousScores;
    }

    public void updateProfile(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;

        System.out.println("\nProfile updated successfully!");
    }
}