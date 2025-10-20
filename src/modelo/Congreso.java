package modelo;

import java.util.ArrayList;
import java.util.List;

public class Congreso {
	private List<Persona> lstPersonas;
	private List<Conferencia> lstConferencias;
	private List<Entrada> lstEntradas;

	public Congreso() {
		super();
		this.lstPersonas = new ArrayList<Persona>();
		this.lstConferencias = new ArrayList<Conferencia>();
		this.lstEntradas = new ArrayList<Entrada>();
	}

	public List<Persona> getLstPersonas() {
		return lstPersonas;
	}

	public void setLstPersonas(List<Persona> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}

	public List<Conferencia> getLstConferencias() {
		return lstConferencias;
	}

	public void setLstConferencias(List<Conferencia> lstConferencias) {
		this.lstConferencias = lstConferencias;
	}

	public List<Entrada> getLstEntradas() {
		return lstEntradas;
	}

	public void setLstEntradas(List<Entrada> lstEntradas) {
		this.lstEntradas = lstEntradas;
	}

	public List<Auspiciante> traerAuspiciante() {
		
		List<Auspiciante> lstAux = new ArrayList<Auspiciante>();
		for (int i = 0; i < lstPersonas.size(); i++) {
			if (lstPersonas.get(i) instanceof Auspiciante) {
				lstAux.add((Auspiciante) lstPersonas.get(i));

			}

		}
		return lstAux;
	}
	
	
	
public Auspiciante traerAuspiciante(String cuit) {
		int i=0;
		boolean flag=false;
		Auspiciante aux = null;
		while(lstPersonas.size()>i && !flag ) {
			if (lstPersonas.get(i) instanceof Auspiciante ) {
				if(((Auspiciante)lstPersonas.get(i)).getCuit().equals(cuit)){
					
				aux=(Auspiciante)lstPersonas.get(i);
				flag=true;

			}
			}
		i++;
		}
		
		return aux;
	}


public boolean agragarAuspiciante( String movil, String mail, String razonSocial, String cuit,double montoAportado)throws Exception {
	int id=1;

	if(traerAuspiciante(cuit)!=null) {
		 throw new Exception("el cuit ya esta registrado");
	}
	if(!lstPersonas.isEmpty()) {
		id=((Auspiciante)lstPersonas.get(lstPersonas.size()-1)).getIdPersona()+1;
		
	}
	lstPersonas.add(new Auspiciante (id ,movil, mail, razonSocial,  cuit,montoAportado));
	return true;
	
	
	
}

}
