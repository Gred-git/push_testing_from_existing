import java.util.Scanner;


public class Q6 {
	public static void main(String[] args) {

		//your code here

		// Setting up array
		double[] grades;
		grades = new double[10];

		// Setting up Scanner
		Scanner scanGrades = new Scanner(System.in);

		// Scanning for grades input
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Enter your grade: ");
			grades[i] = scanGrades.nextDouble();
		}

		System.out.println("------------------------------");
		System.out.println("Grades");
		System.out.println("------------------------------");

		// Prints the 10 grades
		for (int h = 0; h < grades.length; h++) {
			System.out.println(grades[h]);
		}

		System.out.println("------------------------------");
		System.out.println("Average");
		System.out.println("------------------------------");

		// Prints the average
		double average = calculateAverage(grades);
		System.out.println(average);

		System.out.println("------------------------------");
		System.out.println("Median");
		System.out.println("------------------------------");

		// Prints the median
		double median = calculateMedian(grades);
		System.out.println(median);

		System.out.println("------------------------------");
		System.out.println("Failed");
		System.out.println("------------------------------");

		// Prints the number of fails
		int numFailed = calculateNumberFailed(grades);
		System.out.println(numFailed);

		System.out.println("------------------------------");
		System.out.println("Passed");
		System.out.println("------------------------------");

		// Prints the number of passes
		int numPassed = calculateNumberPassed(grades);
		System.out.println(numPassed);
	}

	public static double calculateAverage(double[] notes) {
		//your code here

		// Setting up variables
		double total = 0;

		// Adds up all values in the array
		for (int i = 0; i < notes.length; i++) {
			total += notes[i];
		}

		// Returns the total divided by the number of elements
		return (total / notes.length);
	}

	public static double calculateMedian(double[] notes) {
		//your code here

		// Sorting algorithm
		for (int i = 0; i < notes.length -1; i++ ){
			int smallest = i;
			for (int j = i + 1; j < notes.length; j++ ){
				if (notes[j] < notes[smallest]){
					smallest = j;
				}
			}
			double temp = notes[smallest];
			notes[smallest] = notes[i];
			notes[i] = temp;
		}

		// Odd length, there is a true middle
		if (notes.length % 2 == 1){
			int oddMiddle = (notes.length / 2);
			double medianValue = notes[oddMiddle];
			return medianValue;
		}

		// Even length, average two closest middles
		else{
			int middleLow = (notes.length / 2)-1;
			int middleHigh = (notes.length / 2);
			double medianValue = ((notes[middleLow] + notes[middleHigh]) / 2);
			return medianValue;
		}
	}


	public static int calculateNumberFailed(double[] notes){
		//your code here

		// Setting up variables
		int failed=0;

		// Checks if each variable is less than 50.0 and increases fail counter
		for ( int i = 0; i < notes.length; i++ ){
			if ( notes[i] < 50.0){
				failed++;
			}
		}
		return failed;
	}

	public static int calculateNumberPassed(double[] notes){
		//your code here

		// Setting up variables
		int passed=0;

		// Checks if each variable is grater than or equal to 50.0 and increases pass counter
		for ( int i = 0; i < notes.length; i++ ){
			if ( notes[i] >= 50.0){
				passed++;
			}
		}
		return passed;
	}

}