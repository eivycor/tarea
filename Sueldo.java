package nuevo;

import java.util.Scanner;

public class Sueldo {
	static int S;
	static double d, sf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("ingresa sueldo");
S=scan.nextInt();
if (S<1000){
d=S*0.15;
sf=S+d;

System.out.println("su sueldo es:"+sf);


}
	}
}

