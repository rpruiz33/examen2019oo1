package test;
import modelo.Espectador;

import java.time.LocalDate;

import modelo.Auspiciante;
import modelo.Congreso;

public class Test {

	public static void main(String[] args) {
			Congreso sistema=new Congreso();
			
			try {
				System.out.println(sistema.agragarAuspiciante("1511111111", "unqui@edu.ar","Universidad Nacional de Quilmes", "30-1111111-9", 2000.0));
				System.out.println(sistema.agragarAuspiciante("1522222222", "undav@edu.ar","Universidad Nacional de Avellaneda", "30-2222222-9", 3000.0));
				System.out.println(sistema.agragarAuspiciante("1533333333", "unlz@edu.ar","Universidad Nacional de Lomas", "30-3333333-9", 1000.0));
				System.out.println(sistema.agragarAuspiciante("1544444444", "utnavvvellaneda@edu.ar","Universidad tecnologica de avellaneda", "30-44444444-9", 4000.0));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(sistema.traerAuspiciante());
			
			try {
				System.out.println(sistema.agragarAuspiciante("159999999","utnlanu´@edau.ar","Univerisidad Tecnologica de Lansus", "30-44444444-9", 2000.0));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(sistema.agragarEspectador("1555555555", "dperez@edu.com","Dario", "Perez", "dni",55555555, "universitario"));
			System.out.println(sistema.agragarEspectador("1566666666", "dgonzales@edu.com","Diego", "Gonzales", "dni",66666666, "universitario"));
			System.out.println(sistema.agragarEspectador("1577777777", "fmariscano@edu.com","Franco", "Mariscano", "dni",77777777, "Postgrado"));
			System.out.println(sistema.agragarEspectador("1588888888", "cmadero@edu.com","Carolina", "Madero", "dni",88888888, "Postgrado"));
	
	
			System.out.println(sistema.traerEspectador());
	
	
			System.out.println(sistema.agregarConferencia("La BIGDATA en la filosofia", LocalDate.of(2019,10,8), 1200));
			System.out.println(sistema.traerConferencia(1).agregarAuspiciante(sistema.traerAuspiciante("30-1111111-9"))); 
			
			System.out.println(sistema.traerConferencia(1).agregarAuspiciante(sistema.traerAuspiciante("30-2222222-9")));
			
			System.out.println(sistema.agregarConferencia("Serr o no ser en la era moderna", LocalDate.of(2019,10,8), 5000));
			System.out.println(sistema.traerConferencia(2).agregarAuspiciante(sistema.traerAuspiciante("30-33333333-9")));
			
			System.out.println(sistema.agregarConferencia("EL ABC de la filosofia", LocalDate.of(2019,10,8), 5000));
			System.out.println(sistema.traerConferencia(3).agregarAuspiciante(sistema.traerAuspiciante("30-44444444-9")));
			System.out.println(sistema.getLstConferencias());

	
	
	}
}