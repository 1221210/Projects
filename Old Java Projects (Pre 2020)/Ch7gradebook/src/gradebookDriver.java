/**
 * Ian Selby 021119 Example Chapter 7 - 2D Array GradeBook
 * Description: Takes 10 student's grades and puts them into an array. Then calculate min, max, and average scores.
 */
public class gradebookDriver 
{
	public static void main(String[] args) 
	{
		int [][] gradesArray = 
			{
				{87,96,70},
				{68,87,90},
				{94,100,90},
				{100,81,21},
				{83,65,85},
				{78,87,65},
				{85,75,83},
				{91,94,100},
				{76,72,84},
				{87,93,73} 
			};
	
		gradebook GradeBook = new gradebook(
		"STA Java Class PM Session", gradesArray);
		
		System.out.printf("Welcome to the gradebook for %n%s%n%n", GradeBook.getCourseName());
		GradeBook.processGrades();
	}
	

}
