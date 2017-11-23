import java.util.Scanner;
public class exercisefourchallenge {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("height: ");
		int n = input.nextInt();
		printequitri(n);
	}

	public static void printequitri(int n){
		int x = n;
		for(int h = 1; h <= n; h++){
			for(int c = x; c != 0; c--){
				System.out.print(" ");
			}
			for(int i = h; i != 0; i--){
				System.out.print("# ");
			}
			System.out.println();
			x--;
		}
	}
}
