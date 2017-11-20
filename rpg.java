import java.util.Scanner;
public class rpg {
  public static void rpg () {
		System.out.println("In the land of the faraway, there lies a legendary knight.");
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Welcome, " + name);
		System.out.println("You wander into a forest, and meet a duck. The duck wants to fight you for some reason. You draw your sword, and hence starts the battle.");
		battle();
	}
	public static void battle() {
		
	public static void main(String[] args) {
		rpg();
	}
}
