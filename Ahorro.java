package tarrr;
import java .util.Scanner;
public class Ahorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mes,a�o;
double ah,cant;
Scanner scan=new Scanner (System.in);
mes=1;
ah=0;

	do {
		mes++;
		System.out.println("ingresa cantidad de ahorro");
		cant=scan.nextDouble();
		ah=ah+cant;
	}
	while(mes<=12);
	System.out.println("lo ahorrado en un a�o es :"+ ah );
	}

}
