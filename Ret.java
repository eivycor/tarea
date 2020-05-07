package retoo;

import java.util.Scanner;

public class Ret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("ingresa dos numeros :");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		if (num1 % num2 == 0) {
			System.out.println("son multiplos");
		} else {
			System.out.println("no son multiplos");
		}
	}

}
