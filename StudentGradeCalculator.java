import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Student Grade Calculator");
        System.out.println("Enter marks obtained in each subject (out of 100): ");
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int subject4 = scanner.nextInt();
        int subject5 = scanner.nextInt();

        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double averagePercentage = totalMarks / 500.0 * 100;
        String grade;

        if (averagePercentage >= 91) {
            grade = "A+";
        } else if (averagePercentage >= 81) {
            grade = "A";
        } else if (averagePercentage >= 71) {
            grade = "B";
        } else if (averagePercentage >= 61) {
            grade = "C";
        } else if (averagePercentage >= 51) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}