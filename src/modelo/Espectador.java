package modelo;

public class Espectador extends Persona {
	private String nombre;
	private String cuit;
	private double montoAportado;
	public Espectador(int idPersona, String movil, String mail, String nombre, String cuit, double montoAportado) {
		super(idPersona, movil, mail);
		this.nombre = nombre;
		this.cuit = cuit;
		this.montoAportado = montoAportado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public double getMontoAportado() {
		return montoAportado;
	}
	public void setMontoAportado(double montoAportado) {
		this.montoAportado = montoAportado;
	}
	
	
	
	

}
