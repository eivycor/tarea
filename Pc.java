package ordenadores;

public class Pc extends Tienda{
public int torre;
	
public void slogand() {
	System.out.println("el que mas pesa pero menos muestra");

}
public int getTorre() {
	return torre;
}
public void setTorre(int torre) {
	this.torre = torre;
}
public Pc() {
	
}
public void mostrar() {
	System.out.println("\nsu codigo es"+getCodigo()+"\nsu precio es "+getPrecio()+"\nsu torre es"+getTorre());
}
}