package cond;
import java.util.Scanner;
public class Semana4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);			
		System.out.println("ingrese genero:h/m");
			String genero=scan. next();
			if (genero.contentEquals("h")) {
				System.out.println("Bienvenido hombre");
			}else {
				System.out.println("Bienvenido mujer");
			}
			double precio =0;
			System.out.println("ingrese edad");
				int d=scan.nextInt();	
				if ( d > 6 && d <= 12 );{
						precio= 10;
						
				  		    if (d>12 && d<=60) {
							 precio =20;
				              }else {
					             if (d>60);{
					               precio=15;
					                  }
				
	                                 }
						}
				System.out.println("se cobrara"+precio);
	}
}

	

	
		
				














	




					
		
	

	
	