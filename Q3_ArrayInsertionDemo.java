public class Q3_ArrayInsertionDemo {

	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert) {
		// Your code here

		// Setting up new larger array
		int[] afterArray;
		afterArray = new int[beforeArray.length + 1];

		// Adding elements from the beginning upto the index of insertion
		for (int i = 0; i < indexToInsert; i++) {
			afterArray[i] = beforeArray[i];
		}

		// Insert new value at proper index
		afterArray[indexToInsert] = valueToInsert;

		// Adding the rest of the elements
		for (int i = indexToInsert+1; i < afterArray.length; i++){
			afterArray[i] = beforeArray[i-1];
		}

		return afterArray;
	}

	public static void main(String[] args) {
		// Your code here

		// Setting up array
		int[] basicArray;
		basicArray = new int[]{1, 5, 4, 7, 9, 6};

		// Position and number to be inserted
		int insertionPosition = 5;
		int numToInsert = 30;

		// Calling the method to produce the new array
		int[] afterArray;
		afterArray = insertIntoArray(basicArray, insertionPosition, numToInsert);

		// Printing before array
		System.out.println("Array before insertion:");
		for (int i = 0; i < basicArray.length; i++) {
			System.out.println(basicArray[i]);
		}

		// Printing after array
		System.out.println("Array after insertion of " + numToInsert + " at position " + insertionPosition + ":");
		for (int i = 0; i < afterArray.length; i++) {
			System.out.println(afterArray[i]);


		}
	}
}