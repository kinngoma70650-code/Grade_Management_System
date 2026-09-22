package GradingSystem;

import java.util.Scanner;
public class GradeManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        int choice;

		        do {

		            System.out.print("Enter learner name: ");
		            String learner = scanner.nextLine();

		            System.out.print("Enter Mathematics mark: ");
		            double maths = scanner.nextDouble();

		            System.out.print("Enter English mark: ");
		            double english = scanner.nextDouble();

		            System.out.print("Enter Computer mark: ");
		            double computer = scanner.nextDouble();

		            double average = (maths + english + computer) / 3;

		            String grade = (average >= 80) ? "A" :
		                           (average >= 70) ? "B" :
		                           (average >= 60) ? "C" :
		                           (average >= 50) ? "D" : "F";

		            String remark = (average >= 50) ? "Pass" : "Fail";

		            System.out.println();
		            System.out.println("STUDENT PERFORMANCE");
		            System.out.println("Name: " + learner);
		            System.out.println("Maths: " + maths);
		            System.out.println("English: " + english);
		            System.out.println("Computer: " + computer);
		            System.out.println("Average Mark: " + average);
		            System.out.println("Grade Awarded: " + grade);
		            System.out.println("Remark: " + remark);

		            System.out.println();
		            System.out.println("Checking three subjects:");

		            for (int subject = 1; subject <= 3; subject++) {
		                System.out.println("Subject " + subject + " recorded");
		            }

		            System.out.println();
		            System.out.println("Simple mark check:");

		            int check = 1;

		            while (check <= 3) {
		                System.out.println("Mark " + check + " checked");
		                check++;
		            }

		            System.out.println();
		            System.out.print("Add another learner? Enter 1 for Yes or 2 for No: ");
		            choice = scanner.nextInt();

		            scanner.nextLine();

		        } while (choice == 1);

		        System.out.println("Grade entry finished.");
		    }
		}