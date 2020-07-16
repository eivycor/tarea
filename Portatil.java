package ordenadores;

public class Portatil extends Tienda {

	public double peso;

	public Portatil() {
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

public void mostrar() {
	System.out.println("\nsu codigo es"+getCodigo()+"\nsu precio es"+getPrecio()+"\nsu peso es"+getPeso());
}

public void eslonag() {
	// TODO Auto-generated method stub
	System.out.println("ideal para sus viajes");
}
}