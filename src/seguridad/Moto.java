package seguridad;



public class Moto extends Automovil {
	
	private int retrovisores;

	public Moto(int patente, String modelo, String color, int asiento, int velocidad,int retrovisores) {
		super(patente, modelo, color, asiento, velocidad);
		
		this.retrovisores =  retrovisores;
		// TODO Auto-generated constructor stub
	

	
	


	}

	public int getRetrovisores() {
		return retrovisores;
	}

	public void setRetrovisores(int retrovisores) {
		this.retrovisores = retrovisores;
	}

	@Override
	public String toString() {
		return "Moto [retrovisores=" + retrovisores + ", patente=" + patente + ", modelo=" + modelo + ", color=" + color
				+ ", asiento=" + asiento + ", velocidad=" + velocidad + "]";
	}

	
	


}
