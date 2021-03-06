package ar.edu.unlam.tp4;

public class Tambor {
	
	private Integer posicion;

	public Tambor(NumberGenerator generator) {
		this.posicion = generator.generate();
	}
	
	/* post: devuelve el n�mero de posici�n en la que se
	* encuentra el Tambor. Es un valor comprendido
	* entre 1 y 10.
	*/
	public Integer getPosicion() {
		return posicion;
	}
	
	
	/* post: hace girar el tambor y luego se detiene en
	* una posici�n comprendida entre 1 y 10.
	*/
	public void girar() {
		RandoNumberGenerator generadorRandom = new RandoNumberGenerator();
		this.posicion = generadorRandom.generate();
	}

}
