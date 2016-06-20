package ar.edu.unlam.tp4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTragamonedas {

	@Test
	public void probarTragamonedasConNumerosAleatorios() {
		Tragamonedas tragamonedas = new Tragamonedas();
		tragamonedas.activar();
		tragamonedas.imprimirEstado();
		if(tragamonedas.entregaPremio()){
			System.out.println("Todos los tambores est�n en la misma posici�n. Ganaste!");
		}
		else
			System.out.println("Los tambores no est�n en la misma posici�n. Perdiste!");
	}
	
	@Test
	public void probarTragamonedasConNumerosIguales() {
		Tragamonedas tragamonedas = new Tragamonedas();
		//tragamonedas.activar();
		tragamonedas.imprimirEstado();
		if(tragamonedas.entregaPremio()){
			System.out.println("Todos los tambores est�n en la misma posici�n. Ganaste!");
		}
		else
			System.out.println("Los tambores no est�n en la misma posici�n. Perdiste!");
	}

}
