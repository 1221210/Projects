/**
 * Ian Selby 021119 Example Chapter 7 - 2D Array GradeBook
 * Description: Takes 10 student's grades and puts them into an array. Then calculate min, max, and average scores.
 */
public class gradebook {

	private String courseName; // the name of the course
	private int [][] grades; // 2d array to hold the arrays
	
	//constructor 
	public gradebook (String courseName, int [][]grades) {
		this.courseName = courseName;
		this.grades = grades;
	}
	// allows you to reset the course name
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	
	public void processGrades() {
		
		outputGrade(); // prints the array and calcs the average
		
		//call methods getMinimum and getMaximum
		System.out.printf("%n%s %d%n%s %d%n%n", 
				"Lowest grade in the gradebook: ", getMinimum(grades),
				"Highest grade in the gradebook: ", getMaximum(grades));

	}
	public double getAverage(int[] setOfGrades)
	{
		int total = 0; 
		
		for (int grade : setOfGrades)
			 total += grade;
			
		return (double)total/setOfGrades.length;
			
	}
	public int getMinimum(int[][]grade) 
	{
		int lowGrade = grade[0][0]; 
		
		for (int[] studentGrades : grade)
			for(int grade1:studentGrades)
			{
				if (grade1 < lowGrade)
					
					lowGrade = grade1;
			}
		
		return lowGrade;
	}
	public int getMaximum(int[][]grade) 
	{
		int highGrade = grade[0][0]; 
		
		for (int[] studentGrades : grade)
			for(int grade1:studentGrades)
			{
				if (grade1 > highGrade)
					
					highGrade = grade1;		
			}
		return highGrade;
		
	}
	public void outputGrade() // outputs the grade array
	{
		// these lines build the report headings
		System.out.printf("The grades are:%n%n");
		System.out.print("            "); // spaces to align headings
		// prints the headers using a loop
		for (int i = 0; i < grades[0].length; i++)
			System.out.printf("Test %d      ", i+1);
		System.out.println("Average"); // end of the report header
		
		// create the rows to print out for each student
		for (int student = 0; student<grades.length; student++)
		{
			System.out.printf("Student %2d", student+1);		
			for (int test : grades[student])
				System.out.printf("     %d     ", test);
			double average = getAverage(grades[student]);
			System.out.printf("%9.2f%n", average);
		
		}
		
	}
	
	}
