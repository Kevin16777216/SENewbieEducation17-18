import java.util.Scanner;
public class Input {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("you approach crossroads.");
		System.out.println("- left");
		System.out.println("- right");
		System.out.println();

		System.out.print("input: ");
		int dir = input.nextLn();

		if(dir.equalsIgnoreCase("left")){
			System.out.println("you decide to go left. along the way, you're");
			System.out.println("stopped by a pack of orcs. they kill you. the end.");
		} else if(dir.equalsIgnoreCase("right")){
			System.out.println("you decide to head right. it begins to rain.");
			System.out.println("the ground becomes really muddy and you just sink right in.");
			System.out.println("the mud suffocates you. the end.");
		} else {
			System.out.println("let's stick to the given choices next time, ok?");
		}
	}
}
