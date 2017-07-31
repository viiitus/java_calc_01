import java.util.Scanner;

public class Testprogramm {

	private static final String ANSWER_NO = "n";

	public static void main(String[] args) {

		VitusStringFormatter formatter = new VitusStringFormatter(37);
		Taschenrechner taschenrechner = new Taschenrechner();
		Scanner scanner = new Scanner(System.in);

		boolean exitProgram;
		String operator;
		String decision;
		
	
		do {
			System.out.println(formatter.getNicePaddedString('-', '+'));
			System.out.println("|           Taschenrechner          |");
			System.out.println(formatter.getNicePaddedString('-', '+'));
			System.out.print("| Bitte geben Sie den Operator ein: ");
			operator = scanner.next();
			System.out.println(formatter.getPaddedString('-'));
			System.out.print("| Bitte eine Zahl eingeben:         ");
			int op1 = scanner.nextInt();
			System.out.println(formatter.getPaddedString('-'));

			System.out.print("| Bitte zweite Zahl eingeben:       ");
			int op2 = scanner.nextInt();
			System.out.println(formatter.getPaddedString('-'));

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

			System.out.println("| Weitere Berechnug durchführen? (y/n)");
			decision = scanner.next();
			System.out.println();
				
			if (ANSWER_NO.equalsIgnoreCase(decision)) {
				exitProgram = true;
			} else {
				exitProgram = false;
			}
			System.out.println(formatter.getPaddedString(' '));
		} while (!exitProgram);

	}
}
