import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    private ArrayList<Question> questions;

    public Test() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void viewQuestions() {

        if (questions.isEmpty()) {
            System.out.println("\nNo questions available.");
            return;
        }

        System.out.println("\n===== QUESTION BANK =====");

        for (int i = 0; i < questions.size(); i++) {

            System.out.println("\nQuestion " + (i + 1));
            questions.get(i).displayQuestion();

            System.out.println("Correct Answer : "
                    + questions.get(i).getCorrectAnswer());
        }
    }

    public int conductTest(Student student, Scanner sc) {

        if (questions.isEmpty()) {
            System.out.println("\nNo questions available.");
            return 0;
        }

        int score = 0;

        System.out.println("\n========== TEST STARTED ==========");

        for (int i = 0; i < questions.size(); i++) {

            System.out.println("\nQuestion " + (i + 1));

            Question q = questions.get(i);

            q.displayQuestion();

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            while (answer < 1 || answer > 4) {
                System.out.print("Invalid choice! Enter again: ");
                answer = sc.nextInt();
            }

            if (q.checkAnswer(answer)) {
                score++;
            }
        }

        student.addScore(score);

        System.out.println("\n========== RESULT ==========");
        System.out.println("Score : " + score + " / " + questions.size());

        return score;
    }
    public boolean hasQuestions() {
        return !questions.isEmpty();
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
}