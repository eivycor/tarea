package poo4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humano hum = new Humano();
		hum.hablar();
		hum.correr();
		hum.comer();
		hum.genero = "mujer";
		hum.caracter="pacifista";
		System.out.println(hum.caracter);
		System.out.println(hum.genero);
		System.out.println(hum.edad);
		System.out.println(hum.altura);
		System.out.println(hum.hablar);
		System.out.println();
		Arbol tree=new Arbol();
		tree.crecer();
		tree.crecerhojas();
		tree.fotosintesis();
		System.out.println(tree.tipo);
		System.out.println(tree.cantidadhojas);
		System.out.println(tree.alturaarbol);
		System.out.println(tree.antiguedad);
		
		
	}

}
