package trabajoPractico;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		ArrayList<Venta> ventas = new ArrayList<Venta>();
		Nacional argentina= new Nacional(); 
		Importada brasil = new Importada();
		Negocio macowins = new Negocio (100, ventas);
		Saco sacoVerde = new Saco (brasil, macowins);
		Saco sacoAzul = new Saco(argentina,macowins);
		Venta v1 = new Venta(sacoAzul, "01/12/16");
		Venta v2 = new Venta(sacoVerde,"01/12/16");
		ventas.add(v1);
		ventas.add(v2);
		
		System.out.println("la cantidad vendida el 01/12/2016 es:"+macowins.cantidadVendidaEl("01/12/16"));
		System.out.println("la ganancia total del dia 01/12/2016 es:"+macowins.gananciaTotalEl("01/12/16"));
		

		
	}
	
	
}
