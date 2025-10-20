package modelo;

import java.util.ArrayList;
import java.util.List;

public class Conferencia {
private int idConferencia;
private String titulo;
private double costo;
private List<Auspiciante>lstAuspiciante;
public Conferencia(int idConferencia, String titulo, double costo) {
	super();
	this.idConferencia = idConferencia;
	this.titulo = titulo;
	this.costo = costo;
	this.lstAuspiciante = new ArrayList <Auspiciante>();
}
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





}
