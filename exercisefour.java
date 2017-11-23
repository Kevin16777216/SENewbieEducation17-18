import java.util.Scanner;
public class exercisefour {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("height: ");
		int n = input.nextInt();
		printtri(n);

	}

	public static void printtri(int n){

	/*
		for(int h = 1; h <= n; h++){
			for(int i = h; i != 0; i--){
				System.out.print("#");
			}
			System.out.println();
		}
	*/

		String out = "#";
		for(int i = 0; i < n; i++){
			System.out.println(out);
			out += "#";
		}

	}

}
