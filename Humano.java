package poo4;

public class Humano {
	String hablar;
	String genero;
	String caracter;
	double altura;
	int edad;

	void hablar() {
		System.out.println("hola");
	}

	void correr() {
		System.out.println("correr");
	}

	void comer() {
		System.out.println("comer pan");
	}

	Humano() {
		this.hablar = "soy humano";
		this.altura = 1.67;
		this.edad = 19;

	}
}
