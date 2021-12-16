import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Pon dos números: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		System.out.println("Elige suma <1> o resta <2>: ");
		int operacion = s.nextInt();
	
	switch(operacion) {
	case 1:
		System.out.println("La suma es: " + (n1 + n2));
	break;
	case 2:
		System.out.println("La resta es: " + (n1 - n2));
	break;
	case 3:
		multiplicacion(n1, n2);
		break;
	case 4:
		division(n1, n2);
		
	}}
	
	public static void multiplicacion(int n1, int n2) {
		System.out.println("Tu multiplicacion es: " + (n1 * n2));

	}
	public static void division(int n1, int n2) {
		System.out.println("Tu división es: " + ((double)n1 / (double)n2));

	}
	
	
}