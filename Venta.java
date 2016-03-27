package trabajoPractico;

public class Venta {
	//atributos
	private Prenda tipoPrenda;
	private String fecha;


	//construtor
	public Venta(Prenda tp, String f){
		this.tipoPrenda=tp;
		this.fecha=f;
	
		
	}
	
		//getters y setters
	public Prenda getTipoPrenda() {
		return tipoPrenda;
	}
	public void setTipoPrenda(Prenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	public boolean tieneIgualFechaQue(String f){
		return fecha == f;
	}
	
	public double gananciasXVentas(){
		return  tipoPrenda.precioFinal();
		
	}
}
