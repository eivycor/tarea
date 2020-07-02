package libro;

public class Book extends Magazine{
private String isbn;
private int timeread;
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public int getTimeread() {
	return timeread;
}
public void setTimeread(int timeread) {
	this.timeread = timeread;
}
public void lee() {
	System.out.println("\nautor:"+getAutor()+"\netitulo"+getTitulo()+"\neditorial"+getEditorial()+"\nedicion"+getEdicion()+"\neditorial"+getEditorial()+"\nid"+getId());
System.out.println("\ncodigo"+getIsbn()+"\ntiempo"+getTimeread());


}
public Book() {
	
}
}

