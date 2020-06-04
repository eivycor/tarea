package fibon;
import java.util.Scanner;
public class Termino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan=new Scanner(System.in);
int num,i,num1,num2,n;
num1=0;
num2=1;
n=1;
System.out.println("ingresa numero");
num=scan.nextInt();
for(i=0;i<num;i++) {

	n=num1+num2;
	System.out.println(n);
	num1=num2;
	num2=n;
	

}
	}

}
