import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte Operator eingeben: (+ -)");
		String operator = scanner.nextLine();
		System.out.println(operator);

		System.out.println("Bitte eine Zahl eingeben: ");
		int op1 = scanner.nextInt();
		System.out.println(op1);

		System.out.println("Bitte zweite Zahl eingeben: ");
		int op2 = scanner.nextInt();
		System.out.println(op2);

		Taschenrechner taschenrechner = new Taschenrechner();

		switch (operator) {
		case "+":
			System.out.println("Add");
			System.out.printf("Ausgabe: %d \n", taschenrechner.addieren(op1, op2));
			break;
		case "-":
			System.out.println("Sub");
			System.out.printf("Ausgabe: %d \n", taschenrechner.substrahieren(op1, op2));
			break;
		case "*":
			System.out.println("Multi");
			System.out.printf("Ausgabe: %d \n", taschenrechner.multiplizieren(op1, op2));
			break;

		default:
			System.out.println("Geht nicht.");
			break;
		}

	}

	public int addieren(int a, int b) {
		int ergebnis = a + b;
		return ergebnis;
	}

	private static double potentieren(double basis, double exponent) {
		// throw new UnsupportedOperationException("Sorry, den Mist habe ich noch nicht
		// programmieren lassen. "); //To change body of generated methods, choose Tools
		// | Templates.
		double ergebnis = Math.pow(basis, exponent);
		return ergebnis;
	}

	public int substrahieren(int a, int b) {
		int ergebnis = a - b;
		return ergebnis;
	}

	private double multiplizieren(long a, float b) {
		// Implizite Typumwandlung
		double ergebnis = a * b; // long * float = double
		return ergebnis;
	}

	private double multiplizieren(int a, int b) {
		double ergebnis = a * b;
		return ergebnis;
	}

	private double multiplizieren(int a, float b) {
		// Mit Hilfe von 'casting' können wir einen
		// Zahlenwert von einem Datentyp in einen
		// zweiten "explizit" umwandeln.
		double ergebnis = multiplizieren((double) a, (double) b);
		return ergebnis;
	}

	private double multiplizieren(double a, double b) {
		return a * b;
	}

	public double dividieren(double a, double b) {
		double ergebnis = a / b;
		return ergebnis;
	}

}
