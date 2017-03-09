import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Iterator;

import processing.core.PApplet;

public class Logica {

	PApplet app;

	String[] usuarios;
	String[] informacion;
	String[] tonos;
	LinkedList<Persona> personitas = new LinkedList<>();
	TreeSet<Persona> ordenadoPeso = new TreeSet<Persona>(new OrdenadorPeso());
	TreeSet<Persona> ordenadoEdad = new TreeSet<Persona>(new OrdenadorEdad());
	LinkedList<Persona> backUp = new LinkedList<>();
	HashSet<Persona> desordenadoPeso = new HashSet<>();

	public Logica(PApplet app) {
		this.app = app;
		usuarios = new String[1];
		informacion = new String[1];
		tonos = new String[1];

		// Cargo los txt
		usuarios = app.loadStrings("../data/usuarios.txt");
		informacion = app.loadStrings("../data/informacion.txt");
		tonos = app.loadStrings("../data/tonos.txt");

		// Recorro todos los txt
		for (int i = 0; i < 10; i++) {

			String[] usua = usuarios[i].split(":");
			String nombre = usua[0];
			String apellido = usua[1];

			String[] info = informacion[i].split("/");

			String cedula = informacion[0];
			int edad = Integer.parseInt(info[1]);
			int peso = Integer.parseInt(info[2]);

			String[] color = tonos[i].split("/");
			int r = Integer.parseInt(color[0]);
			int g = Integer.parseInt(color[1]);
			int b = Integer.parseInt(color[2]);

			personitas.add(new Persona(app, nombre, apellido, cedula, edad, peso, r, g, b));

		}
		backUp.addAll(personitas);
	}

	public void ejecutar() {
		int j = 0;
		Iterator<Persona> i = backUp.iterator();
		while (i.hasNext()) {

			Persona persona = i.next();

			persona.pintar(100, 100 + (30 * j));
			j++;
		}

		int h = 0;
		Iterator<Persona> m = ordenadoPeso.iterator();
		while (m.hasNext()) {

			Persona persona = m.next();

			persona.pintar(100, 100 + (30 * h));
			h++;
		}

		int a = 0;
		Iterator<Persona> b = ordenadoEdad.iterator();
		while (b.hasNext()) {

			Persona persona = b.next();

			persona.pintar(100, 100 + (30 * a));
			a++;
		}

	}

	public void teclado() {
		if (app.key == '1') {
			// Orden segun su apellido
			backUp.removeAll(personitas);
			ordenadoPeso.removeAll(personitas);
			ordenadoEdad.removeAll(personitas);
			desordenadoPeso.removeAll(personitas);
			backUp.addAll(personitas);

			Collections.sort(backUp);
		}

		if (app.key == '2') {
			// Orden segun su peso
			backUp.removeAll(personitas);
			ordenadoPeso.removeAll(personitas);
			ordenadoEdad.removeAll(personitas);
			desordenadoPeso.removeAll(personitas);
			ordenadoPeso.addAll(personitas);
		}

		if (app.key == '3') {
			// Segun su peso de forma descendete de forma parcial repetir peso
			backUp.removeAll(personitas);
			ordenadoPeso.removeAll(personitas);
			ordenadoEdad.removeAll(personitas);
			desordenadoPeso.removeAll(personitas);
			ordenadoEdad.addAll(personitas);

		}

		if (app.key == '4') {

		}

	}
}
