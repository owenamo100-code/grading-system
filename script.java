public class StudentGradingSystem {

    public static void main(String[] args) {

        // Array to store student names
        String[] names = {"Ama", "Kofi", "Yaw"};

        // Array to store student scores
        int[] scores = {85, 72, 48};

        int total = 0;
        int highestScore = scores[0];
        String highestStudent = names[0];

        System.out.println("STUDENT GRADING SYSTEM");
        System.out.println("----------------------");

        // Display names, scores and grades
        for (int i = 0; i < scores.length; i++) {

            total += scores[i];

            String grade;

            if (scores[i] >= 80) {
                grade = "A";
            } else if (scores[i] >= 70) {
                grade = "B";
            } else if (scores[i] >= 60) {
                grade = "C";
            } else if (scores[i] >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Student: " + names[i]);
            System.out.println("Score: " + scores[i]);
            System.out.println("Grade: " + grade);
            System.out.println();

            // Find the highest score
            if (scores[i] > highestScore) {
                highestScore = scores[i];
                highestStudent = names[i];
            }
        }

        // Calculate the average
        double average = (double) total / scores.length;

        System.out.println("----------------------");
        System.out.println("Total Score: " + total);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("Highest Scoring Student: "
                + highestStudent);
        System.out.println("Highest Score: " + highestScore);
    }
}