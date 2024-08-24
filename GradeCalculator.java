import java.util.Scanner;

public class GradeCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Welcome to the Grade Calculator!");
System.out.println("--------------------------------");

System.out.print("Enter the number of subjects: ");
int numSubjects = scanner.nextInt();

int[] marks = new int[numSubjects];
String[] subjects = new String[numSubjects];

for (int i = 0; i < numSubjects; i++) {
System.out.print("Enter the name of subject " + (i + 1) + ": ");
subjects[i] = scanner.next();

System.out.print("Enter the marks obtained in " + subjects[i] + " (out of 100): ");
marks[i] = scanner.nextInt();
}

int totalMarks = calculateTotalMarks(marks);
double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
String grade = calculateGrade(averagePercentage);

System.out.println("--------------------------------");
System.out.println("Results:");
System.out.println("Total Marks: " + totalMarks + "/" + (numSubjects * 100));
System.out.println("Average Percentage: " + averagePercentage + "%");
System.out.println("Grade: " + grade);
}

private static int calculateTotalMarks(int[] marks) {
int total = 0;
for (int mark : marks) {
total += mark;
}
return total;
}

private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
return ((double) totalMarks / (numSubjects * 100)) * 100;
}

private static String calculateGrade(double averagePercentage) {
if (averagePercentage >= 90) {
return "A+ (Excellent)";
} else if (averagePercentage >= 80) {
return "A (Very Good)";
} else if (averagePercentage >= 70) {
return "B+ (Good)";
} else if (averagePercentage >= 60) {
return "B (Fair)";
} else if (averagePercentage >= 50) {
return "C+ (Pass)";
} else {
return "F (Fail)";
}
}
}