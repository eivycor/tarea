package rep;

import java.util.Scanner;

public class Pro2 {
	static int num, si, sp;
	static double prom;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		sp = 1;
		si = 1;
		num = 0;
		while (num <= 270) {
			if (num % 2 != 0) {
				si = si + num;
				num = num + 1;

			} else {
				sp = sp + num;
				num = num + 1;
			}
		}
		prom = sp / num;
		System.out.println("suma de los impares:"+"" + si);
		System.out.println("el promedio de numeros pares es: " + prom);
	}

}

