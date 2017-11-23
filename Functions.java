public class Functions {

	public static boolean isPrime(int n) {

		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		//print first x primes

		int x = 12;
		int max = -1;

		while(x > 0) {
			for(int i = 2; true; i++){
				if(isPrime(i) && (i > max)) {
					System.out.println(i);
					max = i;
					break;
				}
			}
			x--;
		}

	}
}
