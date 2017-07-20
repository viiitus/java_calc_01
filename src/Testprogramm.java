import java.util.Scanner;

public class Testprogramm {

	public static void main(String[] args) {

		VitusStringFormatter formatter = new VitusStringFormatter(37);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(formatter.getPaddedString('-'));
		System.out.println("|           Taschenrechner          |");
		System.out.println(formatter.getPaddedString('-'));
		System.out.print("| Bitte geben Sie den Operator ein: ");
		String operator = scanner.nextLine();
		System.out.println(formatter.getPaddedString('-'));
		System.out.print("| Bitte eine Zahl eingeben:         ");
		int op1 = scanner.nextInt();
		System.out.println(formatter.getPaddedString('-'));

		System.out.print("| Bitte zweite Zahl eingeben:       ");
		int op2 = scanner.nextInt();
		System.out.println(formatter.getPaddedString('-'));

		Taschenrechner taschenrechner = new Taschenrechner();

		switch (operator) {
		case "+":
			System.out.println("|            Addition               |");
			System.out.printf("| Ergebnis: %4d                    | \n", taschenrechner.addieren(op1, op2));
			System.out.println("+-----------------------------------+");
			break;
		case "-":
			System.out.println("|           Subtraktion             |");
			System.out.printf("| Ergebnis: %4d                       | \n", taschenrechner.substrahieren(op1, op2));
			System.out.println("+-----------------------------------+");
			break;
		case "*":
			System.out.println("|         Multiplikation            |");
			System.out.printf("| Ergebnis: %4d                       |\n", taschenrechner.multiplizieren(op1, op2));
			System.out.println("+-----------------------------------+");
			break;
		case "/":
			System.out.println("|            Division               |");
			System.out.printf("| Ergebnis: %4d                       |\n", taschenrechner.dividieren(op1, op2));
			System.out.println("+-----------------------------------+");
			break;

		default:
			System.out.println("Sie haben keinen Operator eingegeben.");
			System.out.println("Programm wird geschlossen.");
			break;
		}

	}
}
