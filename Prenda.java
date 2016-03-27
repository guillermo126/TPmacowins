package trabajoPractico;

public class Prenda {
	//atributos
	protected int precioBase;
	private Nacional clasePrenda;
	private Negocio neg;
	
	//constructor
	public Prenda( Nacional cp, Negocio n){
		
		this.clasePrenda = cp;
		this.neg = n;
		
	}

	//getters y setters
	
	public Nacional getClasePrenda() {
		return clasePrenda;
	}
	public void setClasePrenda(Nacional clasePrenda) {
		this.clasePrenda = clasePrenda;
	}
	public Negocio getNeg() {
		return neg;
	}
	public void setNeg(Negocio neg) {
		this.neg = neg;
	}
	
	public double precioFinal() {
		
		return  clasePrenda.tasaImportacion() *( neg.getValorFijo() + this.getPrecioBase());
		
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	
	

	
		
		
		
		
	
}




