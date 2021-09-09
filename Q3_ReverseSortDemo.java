public class Q3_ReverseSortDemo {
	public static void main(String[] args){
		char[] unorderedLetters;
		unorderedLetters = new char[]{'x', 'a', 'b', 'r', 'p'};
		reverseSort(unorderedLetters);
		for (int i = 0 ; i < unorderedLetters.length; i++ )
			System.out.print(unorderedLetters[i]);
	}

	//method that sorts a char array into its reverse alphabetical order
	public static void reverseSort(char[] values){

		//your code here

		// Setting up variables
		char largest;
		char temp = 'a';
		int position = 0;
		boolean flag = false;

		// Nested for loop Selection Sort
		for ( int i = 0; i < (values.length - 1); i++ ){
			largest = values[i];
			for ( int j = (i + 1); j < values.length; j++ ){
				if (values[j] > largest) {
					largest = values[j];
					position = j;
					temp = values[i];
					flag = true;
				}
			}

			values[i] = largest;

			// Flag to stop first position to be overwritten if it is the largest
			if (flag){
				values[position] = temp;}
			flag = false;
		}
	}
}