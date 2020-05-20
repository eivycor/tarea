package repetitiva;

import java.util.Scanner;

public class Pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		int a=0;
		System.out.println("ingresa un numero:");
		num = scan.nextInt();
		while (num >= 0) {
			a++;	
			System.out.println("ingresa un numero:");
			num = scan.nextInt();
		 
		}
		System.out.println("cantidad de numeros ingresados:"+ a );
	}
}

