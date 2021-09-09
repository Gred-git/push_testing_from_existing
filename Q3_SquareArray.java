public class Q3_SquareArray {

	public static int[] createArray(int size) {
		// Your code here

		// Setting up array
		int[] squareArray;
		squareArray = new int[size];

		// Squaring each element
		for (int i = 0; i < squareArray.length; i++) {
			squareArray[i] = i * i;
		}
		return squareArray;
	}

	public static void main(String[] args) {
		// Your code here
		int[] test = createArray(12);

		// Printing array
		for (int i = 0; i < test.length; i++) {
			System.out.println("The square of " + i + " is: " + test[i]);
		}
	}
}