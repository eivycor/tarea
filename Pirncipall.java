package ordenadores;

public class Pirncipall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Portatil po = new Portatil();
		po.setCodigo(19247);
		po.setPrecio(2017.4);
		po.setPeso(40);
		po.eslonag();
		po.mostrar();
		Pc compu = new Pc();
		compu.setCodigo(9874);
		compu.setPrecio(1020.5);
		compu.setTorre(1);
		compu.mostrar();
		compu.slogand();
	}

}