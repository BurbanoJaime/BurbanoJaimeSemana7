import processing.core.PApplet;

public class MainParcial_ApellidoNombre extends PApplet {

	public static void main(String[] args) {
		PApplet.main("MainParcial_ApellidoNombre");
	}

	Logica log;

	@Override
	public void settings() {
		size(1200, 700);
	}

	@Override
	public void setup() {
		log = new Logica(this);
	}

	@Override
	public void draw() {
		background(20);
		log.ejecutar();
	}

	public void keyPressed() {
		log.teclado();
	}
}
