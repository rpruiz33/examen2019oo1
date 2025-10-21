package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conferencia {
private int idConferencia;
private String titulo;
private LocalDate dia;
private double costo;
private List<Auspiciante>lstAuspiciante;
public int getIdConferencia() {
	return idConferencia;
}
public void setIdConferencia(int idConferencia) {
	this.idConferencia = idConferencia;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}


public LocalDate getDia() {
	return dia;
}
public void setDia(LocalDate dia) {
	this.dia = dia;
}
public double getCosto() {
	return costo;
}
public void setCosto(double costo) {
	this.costo = costo;
}
public List<Auspiciante> getLstAuspiciante() {
	return lstAuspiciante;
}
public void setLstAuspiciante(List<Auspiciante> lstAuspiciante) {
	this.lstAuspiciante = lstAuspiciante;
}
public Conferencia(int idConferencia, String titulo, LocalDate dia2, double costo) {
	super();
	this.idConferencia = idConferencia;
	this.titulo = titulo;
	this.dia = dia2;
	this.costo = costo;
	this.lstAuspiciante = new ArrayList<Auspiciante>();
}
@Override
public String toString() {
	return "Conferencia [idConferencia=" + idConferencia + ", titulo=" + titulo + ", dia=" + dia + ", costo=" + costo
			+ ", lstAuspiciante=" + lstAuspiciante + "\n]";
}




}