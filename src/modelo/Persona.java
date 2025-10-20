package modelo;

public abstract class Persona {
	protected int idPersona;
	protected String movil;
	protected String mail;
	public Persona(int idPersona, String movil, String mail) {
		super();
		this.idPersona = idPersona;
		this.movil = movil;
		this.mail = mail;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
	

}
