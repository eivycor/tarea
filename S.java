package reto;

import java.util.Scanner;

public class S {
	static int num1,num2,num3;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan =new Scanner (System.in);
		System.out.println("ingrese tres numero ");
		num1=scan.nextInt();
	    num2=scan.nextInt();
	    num3=scan.nextInt();
	
	if (num1>num2 && num1>num3){
	System.out.println(num1+"y"+num2+"y"+ num3);
	}  else{
	 if (num2>num1 && num2>num3){
		System.out.println(num2+"y"+num1 +"y"+num3);}}
	
		if (num3>num1 && num3>num2) {
		System.out.println(num3+"y"+num1 +"y"+num2); }
}
}
