package sem;

import java.util.Scanner;

public class Sobre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota;
		Scanner scan = new Scanner(System.in);
		System.out.println("ingresar nota entre 0 y 10");
		nota = scan.nextInt();
		switch (nota) {
		case 0:
			System.out.println("cero");
		case 1:
			System.out.println("uno");
		case 2:
			System.out.println("dos");
		case 3:
			System.out.println("tres");
		case 4:
			System.out.println("cuatro");
		case 5:
			System.out.println("cinco");
		case 6:
			System.out.println("seis");
			break;
		case 7:
			System.out.println("siete");
			break;
		case 8:
			System.out.println("ocho");
		case 9:
			System.out.println("nueve");
		case 10:
			System.out.println("diez");

		}
	}
}
