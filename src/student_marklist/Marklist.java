package student_marklist;




		import java.util.Scanner;

		public class Marklist {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        int numberOfStudents = 4; 
		        String[] names = new String[numberOfStudents];
		        double[] unit1Marks = new double[numberOfStudents];
		        double[] unit2Marks = new double[numberOfStudents];
		        double[] unit3Marks = new double[numberOfStudents];
		        double[] totalMarks = new double[numberOfStudents];
		        double[] averageMarks = new double[numberOfStudents];
		        String[] grades = new String[numberOfStudents];
		        String[] results = new String[numberOfStudents];

		        
		        for (int i = 0; i < numberOfStudents; i++) {
		            System.out.print("Enter name for Student " + (i + 1) + ": ");
		            names[i] = scanner.nextLine();
		            System.out.print("Enter marks for Unit 1: ");
		            unit1Marks[i] = scanner.nextDouble();
		            System.out.print("Enter marks for Unit 2: ");
		            unit2Marks[i] = scanner.nextDouble();
		            System.out.print("Enter marks for Unit 3: ");
		            unit3Marks[i] = scanner.nextDouble();
		            scanner.nextLine(); // Consume the newline character
		        }

		        
		        for (int i = 0; i < numberOfStudents; i++) {
		            totalMarks[i] = unit1Marks[i] + unit2Marks[i] + unit3Marks[i];
		            averageMarks[i] = totalMarks[i] / 3;

		            
		            if (averageMarks[i] >= 80) {
		                grades[i] = "A";
		            } else if (averageMarks[i] >= 75) {
		                grades[i] = "B+";
		            } else if (averageMarks[i] >= 65) {
		                grades[i] = "B";
		            } else if (averageMarks[i] >= 55) {
		                grades[i] = "C+";
		            } else if (averageMarks[i] >= 50) {
		                grades[i] = "C";
		            } else if (averageMarks[i] >= 40) {
		                grades[i] = "D";
		            } else {
		                grades[i] = "F";
		            }

		            
		            results[i] = (averageMarks[i] >= 40) ? "P" : "F";
		        }

		        
		        System.out.println("\nSTUDENT MARKLIST:");
		        System.out.println("*****************************************************************");
		        System.out.println("NAME\tMARKS 1\tMARKS 2\tMARKS 3\tTOTAL\tAVERAGE\tGRAGE\tRESULTS");
		        System.out.println("*****************************************************************");
		        
		        for (int i = 0; i < numberOfStudents; i++) {
		            System.out.printf("%s\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%s\t%s\n",
		                    names[i], unit1Marks[i], unit2Marks[i], unit3Marks[i],
		                    totalMarks[i], averageMarks[i], grades[i], results[i]);
		        }
		        //System.out.println("---------------------------------------------------------------");

		        scanner.close();
		    }
		}
   
