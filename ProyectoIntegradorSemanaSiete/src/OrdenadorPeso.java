import java.util.Comparator;

public class OrdenadorPeso implements Comparator<Persona> {
	public int compare(Persona a, Persona b) {
		return b.getPeso() - a.getPeso();
	}
}
