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
	}
	
	
	
	s.close();
	}

}