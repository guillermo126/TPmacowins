package trabajoPractico;
import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
public class Negocio {
	//atributos
	private int valorFijo;
	private ArrayList<Venta> ventas;
	
	// constructor
	public Negocio(int i, ArrayList<Venta> ventas2) {
		this.valorFijo =i;
		this.ventas = ventas2;
	}
	
	//getters y setters
	public int getValorFijo() {
		return valorFijo;
	}
	public void setValorFijo(int valorFijo) {
		this.valorFijo = valorFijo;
	}
	public ArrayList<Venta> getVentas() {
		return ventas;
	}
	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}
	
	public int cantidadVendidaEl( String fecha){
		 Stream<Venta> v1 = ventas.stream().filter( v -> v.getFecha() == fecha);
		return (int) v1.count();
	
	}
	
	public double gananciaTotalEl(String fecha){
		Stream<Venta> v1 = ventas.stream().filter( v -> v.getFecha() == fecha);
		DoubleStream  a= v1.mapToDouble(venta -> venta.gananciasXVentas());
		//.stream().mapToDouble(venta -> venta.gananciasXVentas()).sum()
		return a.sum();
	
	}
}
	
	
	
	
	
	

