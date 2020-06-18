package clacu;

public class Calculadora {

	public static int suma(int x,int y) {
		return x+y;
	}
	public static int resta(int x,int y) {
		return x-y;
	}
	public static int multi(int x,int y) {
		return x*y;
	}
	public static void main(String[] args) {
		int x=10;
		int y=5;
		int s=suma(x,y);
		int r=resta(x,y);
		int m=multi(x,y);
System.out.println(s);
System.out.println(r);
System.out.println(m);
}

}
