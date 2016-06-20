package ar.edu.unlam.tp4;

public class RandoNumberGenerator implements NumberGenerator {

	/* post: devuelve el n�mero de posici�n en la que se
	* encuentra el Tambor. Es un valor comprendido
	* entre 1 y 10.
	*/
	@Override
	public Integer generate() {
		return (int) (Math.random()*10 + 1);
	}

}
