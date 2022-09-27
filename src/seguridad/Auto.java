package seguridad;

public class Auto extends Automovil {
	
	
	private boolean rueda_de_auxilio;

		
	

	public Auto(int patente, String modelo, String color, int asiento, int velocidad, boolean rueda_de_auxilio) {
		super(patente, modelo, color, asiento, velocidad);
		this.rueda_de_auxilio = rueda_de_auxilio;
	}
	
	
	public void  autoVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	

	public boolean isRueda_de_auxilio() {
		return rueda_de_auxilio;
	}

	public void setRueda_de_auxilio(boolean rueda_de_auxilio) {
		this.rueda_de_auxilio = rueda_de_auxilio;
	}
	

	
	
	

	@Override
	public String toString() {
		return "Auto [rueda_de_auxilio=" + rueda_de_auxilio + ", patente=" + patente + ", modelo=" + modelo + ", color="
				+ color + ", asiento=" + asiento + ", velocidad=" + velocidad + "]";
	}

	

	}



	


