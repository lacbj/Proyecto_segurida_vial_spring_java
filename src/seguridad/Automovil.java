package seguridad;

public class Automovil {
	
	protected  int patente;
	
	protected String modelo;
	protected String color;
	protected int asiento;
	protected int velocidad;
	
	
	public Automovil(int patente, String modelo, String color, int asiento, int velocidad) {
		super();
		this.patente = patente;
		this.modelo = modelo;
		this.color = color;
		this.asiento = asiento;
		this.velocidad = velocidad;
	}


	public int getPatente() {
		return patente;
	}


	public void setPatente(int patente) {
		this.patente = patente;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getAsiento() {
		return asiento;
	}


	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	@Override
	public String toString() {
		return "Automovil [patente=" + patente + ", modelo=" + modelo + ", color=" + color + ", asiento=" + asiento
				+ ", velocidad=" + velocidad + "]";
	}
	
	
	
	}
	
	
	
	
	
	
	
	



