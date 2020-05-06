package clases;
import java.util.Scanner;
public class Jav {
	static int num1;
	static int num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner (System.in);

	System.out.println("ingrese dos numero ");
	num1=scan.nextInt();
    num2=scan.nextInt();
if (num1<num2){
System.out.println(num2+"y"+num1);
}else {
	System.out.println(num1+"y"+num2);
}
	}
}

