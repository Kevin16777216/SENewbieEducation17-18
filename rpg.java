import java.util.Scanner;
public class rpg {
	public static int yourAttack = 0;
	public static int yourHealth = 20;
	public static int yourAttack2 = 0;
	public static int opponentHealth = 20;
	public static int opponentAttack = 2;
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
		Scanner sc = new Scanner(System.in);		
		while (yourHealth	> 0 && opponentHealth > 0) {	
			System.out.println("Enter 1 for a normal attack. Enter 2 for a special attack.");			
			int attack = sc.nextInt();
			if (attack == 1) {
				yourAttack = 2;
				yourHealth -= opponentAttack;
				opponentHealth -= yourAttack;		
				System.out.println("Both you and your opponent attack at the same time. Your opponent has " + opponentHealth + " left. You have " + yourHealth + " left.");
			}
			else if (attack == 2) {
				yourAttack = 3;
				yourHealth -= opponentAttack;
				opponentHealth -= yourAttack;		
				System.out.println("Both you and your opponent attack at the same time. Your opponent has " + opponentHealth + " left. You have " + yourHealth + " left.");
			}
			else {
				System.out.println(attack);
				System.out.println("Please do a valid attack.");
			}				
		}
	}
	public static void main(String[] args) {
		rpg();
		System.out.println("Congrats, you win!");
	}
}
