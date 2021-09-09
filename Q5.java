public class Q5{

	public static void main(String[] args){
		boolean[] test = new boolean[8];

		//test for isPrime
		test[0]  = (isPrime(0) == false);
		test[1] = (isPrime(2) == true);
		test[2] = (isPrime(7) == true);
		test[3] = (isPrime(15) == false);

		test[4]  = (getFibonacci(1) == 1);
		test[5]  = (getFibonacci(3) == 2);
		test[6]  = (getFibonacci(5) == 5);
		test[7]  = (getFibonacci(8) == 21);


		boolean testFlag=true;
		for (int i = 0; i < test.length; i++){
			if(test[i]){
				System.out.println("test " + i + " passed");
			} else {
				System.out.println("test " + i + " failed");
				testFlag = false;
			}
		}

		if(testFlag ){
			System.out.println("All tests are successful");
		} else {
			System.out.println("Not all tests are successful");
		}

	}

	//method that determines if the number x is prime
	public static boolean isPrime(int x){

		// 0 and 1 are not prime
		boolean prime = true;
		if(x < 2){
			prime = false;
		}

		// 2 is Prime
		if(x== 2){
			prime = true;
		}

		// Algorithm to check for prime numbers
		int i = 2;
		while(prime && x > i){
			if(x % i == 0){
				prime = false;
			}
			i++;
		}
		return prime;
	}

	//returns the fibonacci number at the position in parameter
	public static int getFibonacci(int position) {

		// Setting up variables
		int num = 0;
		int num2 = 1;
		int fibonacci = 0;

		// 0 is always 0
		if (position == 0) {
			fibonacci = 0;

		// 1 is always 1
		} else if (position == 1) {
			fibonacci = 1;

		// Algorithm to find fibonacci numbers
		} else {
			for (int i = 2; i <= position; i++ ) {
				fibonacci = num + num2;
				num = num2;
				num2 = fibonacci;
			}
		}
		return fibonacci;
	}

}