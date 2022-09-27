package seguridad;



public class Conductor {

private String nombre = "";
	
	
	private int DNI;
	private String automovil;
	private boolean registro;
	private Auto Auto;
	private Moto Moto;
	
	
	public Conductor(String nombre, int dNI, String automovil, boolean registro, Auto Auto) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.automovil = automovil;
		this.registro = registro;
		this.Auto = Auto;
		
		
		
	}


	public Conductor(String nombre, int dNI, String automovil, boolean registro, Moto Moto) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.automovil = automovil;
		this.registro = registro;
		
		this.Moto = Moto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDNI() {
		return DNI;
	}


	public void setDNI(int dNI) {
		DNI = dNI;
	}


	public String getAutomovil() {
		return automovil;
	}


	public void setAutomovil(String automovil) {
		this.automovil = automovil;
	}


	public boolean isRegistro() {
		return registro;
	}


	public void setRegistro(boolean registro) {
		this.registro = registro;
	}


	public Auto getAuto() {
		return Auto;
	}


	public void setAuto(Auto auto) {
		Auto = auto;
	}


	public Moto getMoto() {
		return Moto;
	}


	public void setMoto(Moto moto) {
		Moto = moto;
	}


	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", DNI=" + DNI + ", automovil=" + automovil + ", registro=" + registro
				+ ", Auto=" + Auto + ", Moto=" + Moto + "]";
	}
	
	
	
	
	
	
	
}
