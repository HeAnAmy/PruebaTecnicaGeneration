/**
 * 
 */
package Proyecto1;

/**
 * @author amyre
 *
 */
public class Carro {
	String Modelo = "Chevy" , Color = "Vino", Marca = "Chevrolet", Chasis =  "buenas condicones", Propietario = "Juan Hern�ndez", Techo = "Corredizo", trasmisi�n = "manual" ;
	int A�o = 1999, velocidadM�xima = 170, VelocidadMinima = 5, Puertas = 5, NumerodeMarchas = 6, Volumendecombustible = 57  ;

	public static void main(String[] args) {
		

	}

	public Carro(String modelo, String color, String marca, String chasis, String propietario, String techo,
			String trasmisi�n, int a�o, int velocidadM�xima, int velocidadMinima, int puertas, int numerodeMarchas,
			int volumendecombustible) {
		super();
		Modelo = modelo;
		Color = color;
		Marca = marca;
		Chasis = chasis;
		Propietario = propietario;
		Techo = techo;
		this.trasmisi�n = trasmisi�n;
		A�o = a�o;
		this.velocidadM�xima = velocidadM�xima;
		VelocidadMinima = velocidadMinima;
		Puertas = puertas;
		NumerodeMarchas = numerodeMarchas;
		Volumendecombustible = volumendecombustible;
	}

}
