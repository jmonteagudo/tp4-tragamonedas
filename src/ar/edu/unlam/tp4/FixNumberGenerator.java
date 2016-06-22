package ar.edu.unlam.tp4;

public class FixNumberGenerator implements NumberGenerator {

	private Integer numero;
	
	/* Este generador devolver� siempre number cuando se llame al m�todo generate()
	*/
	public FixNumberGenerator(Integer number) {
		this.numero = number;
	}

	/* post: devuelve el n�mero de posici�n en la que se
	* encuentra el Tambor. Es un valor comprendido
	* entre 1 y 10.
	*/
	@Override
	public Integer generate() {
		return numero;
	}

}
