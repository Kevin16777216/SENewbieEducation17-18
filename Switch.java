import java.util.Scanner;
public class Switch {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("you approach a crossroads.");
		System.out.println("1. left");
		System.out.println("2. right");
		System.out.println();

		System.out.print("input: ");
		int dir = input.nextInt();

		switch(dir){
			case 1:
				System.out.println("you decide to go left. along the way, you're");
				System.out.println("stopped by a pack of orcs. they kill you. the end.");
				break;
			case 2:
				System.out.println("you decide to head right. it begins to rain.");
				System.out.println("the ground becomes really muddy and you just sink right in.");
				System.out.println("the mud suffocates you. the end.");
				break;
			default:
				System.out.println("let's stick to the given choices next time, ok?");
				break;
		}
	}
}
