package ventas;
import java. util. Scanner;
public class V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int nv,i,c,a,b,d;
a=0;
b=0;
d=0;
System.out.println("ingresar numero de ventas");
nv=scan .nextInt();
for(i=1;i<=nv;i++) {
	System.out.println("ingresa cantidad");
	c=scan.nextInt();
	if( c<200) {
	a=a+1;}
	
	else if (c>200 && c<400) {
	b=b+1;}
	
	else if(c>400) {
		
		d=d+1;
		;
	}
}
System.out.println("menores a 200"+":"+a);
System.out.println("mayores a 200 y menores a 400"+":"+b);
System.out.println("mayores a 400"+":" +d);
	}

}
