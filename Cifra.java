package cif;

import java.util.Scanner;

public class Cifra {
	static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ingresar un numero del 0 al 99.999");
		num = scan.nextInt();
		if (num < 10) {
			System.out.println("el numero tiene 1 cifras");
		} else {
			if (num < 100) {
				System.out.println("el numero tiene 2 cifras");
			} else {
				if (num < 1000) {
					System.out.println("el numero tiene 3 cifras");
				} else {
					if (num < 10000) {
						System.out.println("el numero tiene 4 cifras");
					} else {
						if (num < 100000) {
							System.out.println("el numero tiene 5 cifras");
						}
					}
				}
			}
		}
	}

}

