package hacer1;

import java.util.Scanner;

public class Hace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, x, suma;
		Scanner scan = new Scanner(System.in);
		System.out.println("ingresa cantidad de numeros");
		x = scan.nextInt();
		suma = 0;
		do {
			System.out.println("ingrese numero");
			num = scan.nextInt();
			suma = suma + num;
		} while (num != x);
		System.out.println(suma);

	}
}
