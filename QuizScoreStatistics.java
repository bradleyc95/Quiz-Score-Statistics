import java.util.*;
public class QuizScoreStatistics {
	// Bradley Cox

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> grades = new ArrayList<>(); 
		int grade = 50;
		
		while (grade < 99) {
			System.out.println("Please enter a grade >>");
			grade = sc.nextInt();
			
			if (grade < 0 || grade > 100) {
				System.out.println("Please enter a valid grade between 0 and 100 >>");
				grade = sc.nextInt();
			}
			else {
				grades.add(grade);
				System.out.println("Grade registered...");
			}
		}
		
		int numGrades = grades.size();
		int highGrade = 0;
		int lowGrade = 0;
		int avgGrade = 0;
		int tempAvg = 0;
		
		for (Integer i : grades) {
			if (i > highGrade) {
				highGrade = i;
			}
		}
		
		for (Integer i : grades) {
			if (i < lowGrade) {
				lowGrade = i;
			}
		}
		
		for (Integer i : grades) {
			tempAvg += i;
			avgGrade = tempAvg / numGrades;
		}
		
		System.out.println("Out of " + numGrades + " grades, the highest grade is " + highGrade + ", the lowest grade is " + lowGrade + ", and the average grade is " + avgGrade + ".");
		

	}

}
