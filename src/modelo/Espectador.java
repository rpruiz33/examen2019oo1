package modelo;

public class Espectador extends Persona {
	private String nombre;
	private String apellido;
	private  String tipoDocumento;
	private long nroDocumento;
	private String nivelEstudio;
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
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public long getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(long nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getNivelEstudio() {
		return nivelEstudio;
	}
	public void setNivelEstudio(String nivelEstudio) {
		this.nivelEstudio = nivelEstudio;
	}
	public Espectador(int idPersona, String movil, String mail, String nombre, String apellido, String tipoDocumento,
			long nroDocumento, String nivelEstudio) {
		super(idPersona, movil, mail);
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.nivelEstudio = nivelEstudio;
	}
}