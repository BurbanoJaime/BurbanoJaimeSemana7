import processing.core.PApplet;

public class Persona implements Comparable<Persona> {
	private PApplet app;

	private String nombre;
	private String apellido;
	private String cedula;
	private int edad;
	private int peso;
	private int r;
	private int g;
	private int b;
	private int color;

	private int posX;
	private int posY;

	public Persona(PApplet app, String nombre, String apellido, String cedula, int edad, int peso, int r, int g,
			int b) {
		this.app = app;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.edad = edad;
		this.peso = peso;
		this.r = r;
		this.g = g;
		this.b = b;

		color = r + g + b;
	}

	public void pintar(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		app.fill(r, g, b);
		app.text("Nombre: " + nombre + "  " + "Apellido: " + apellido + "  " + "Cedula: " + cedula + "  " + "Edad: "
				+ edad + "  " + "Color: " + color + "  " + "Peso: " + peso, posX, posY);
	}

	@Override
	public int compareTo(Persona o) {
		return apellido.compareTo(o.getApellido());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
