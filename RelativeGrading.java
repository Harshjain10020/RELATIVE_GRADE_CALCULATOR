import java.util.Scanner;

public class RelativeGrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputs
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        
        double[] marks = new double[numberOfStudents];
        System.out.println("Enter the marks of the students:");
        for (int i = 0; i < numberOfStudents; i++) {
            marks[i] = scanner.nextDouble();
        }
        
        System.out.println("Enter your marks:");
        double userMarks = scanner.nextDouble();

        // Calculate mean
        double mean = calculateMean(marks);

        // Calculate standard deviation
        double standardDeviation = calculateStandardDeviation(marks, mean);

        // Calculate the grade
        String grade = calculateGrade(mean, standardDeviation, userMarks);

        // Output the grade
        System.out.println("Class average (mean): " + mean);
        System.out.println("Standard deviation: " + standardDeviation);
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }

    public static double calculateMean(double[] marks) {
        double sum = 0.0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public static double calculateStandardDeviation(double[] marks, double mean) {
        double sum = 0.0;
        for (double mark : marks) {
            sum += Math.pow(mark - mean, 2);
        }
        return Math.sqrt(sum / marks.length);
    }

    public static String calculateGrade(double mean, double stddev, double marks) {
        if (marks > (mean + 1.50 * stddev) && marks >= 90) {
            return "S";
        } else if (marks > (mean + 0.50 * stddev) && marks <= (mean + 1.50 * stddev)) {
            return "A";
        } else if (marks > (mean - 0.50 * stddev) && marks <= (mean + 0.50 * stddev)) {
            return "B";
        } else if (marks > (mean - 1.00 * stddev) && marks <= (mean - 0.50 * stddev)) {
            return "C";
        } else if (marks > (mean - 1.50 * stddev) && marks <= (mean - 1.00 * stddev)) {
            return "D";
        } else if (marks > (mean - 2.00 * stddev) && marks <= (mean - 1.50 * stddev)) {
            return "E";
        } else {
            return "F";
        }
    }
}
