package carro;

public class vehiculo {
	public static void  main(String[] args) {
		
		vehiculo t = new vt();
		vehiculo d = new vd();
		vehiculo f = new vf();
		t.mostrardatos();
		t.mostrardatos();
		d.mostrardatos();
		f.mostrardatos();
		
	}
	public void mostrardatos() {
		System.out.println("carro");
	}
	}
class vt extends vehiculo {
	int numeropuertas=4;
	String mt="nisaan";
public void mostrardatos() {
	System.out.println(numeropuertas);
	System.out.println(mt);
	}
}

class vd extends vehiculo {
	int cilindrada=2;

	public void mostrardatos() {
		System.out.println(cilindrada);
	}
}

class vf extends vehiculo {
	int carga=500;
	public void mostrardatos() {
		System.out.println(carga);
	}
}
