package tarea;
import java.util.Scanner;
public class Scan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner (System.in);
System.out.println("ingresa nombre");
String nom=scan.next();
System.out.println("ingresa apellido paterno");
	String apepat=scan.next();
	///////////
	System.out.println("INGRESA EDAD");
	int edad1=scan.nextInt();
	System.out.println("Su nombre es:"+ nom +"\nsu apellido es: "+apepat+"\nedad"+ edad1);
	}

}
