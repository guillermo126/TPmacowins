package trabajoPractico;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class Tests {
	
	ArrayList<Venta> ventas = new ArrayList<Venta>();
	Nacional argentina= new Nacional(); 
	Importada brasil = new Importada();
	Negocio macowins = new Negocio (100, ventas);
	Saco sacoVerde = new Saco (brasil, macowins);
	Saco sacoAzul = new Saco(argentina,macowins);
	Venta v1 = new Venta(sacoAzul, "01/12/16");
	Venta v2 = new Venta(sacoVerde,"01/12/16");
	
	@Before
	public void ponerEnLista(){
		ventas.add(v1);
		ventas.add(v2);
	}

	@Test
	public void test1() {
		assertTrue(macowins.cantidadVendidaEl("01/12/16")==2);
		
	}
	
	@Test
	public void test2(){
		assertTrue(macowins.gananciaTotalEl("01/12/16")== 520);
	}
	
	@Test
	public void test3(){
		assertFalse(macowins.cantidadVendidaEl("01/12/16")==5);
	}

}
