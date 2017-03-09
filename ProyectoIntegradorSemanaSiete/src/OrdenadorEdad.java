import java.util.Comparator;

public class OrdenadorEdad implements Comparator<Persona> {
	public int compare(Persona a, Persona b) {
		return a.getEdad() - b.getEdad();
	}
}
