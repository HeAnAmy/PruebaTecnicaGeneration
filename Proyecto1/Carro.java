/**
 * 
 */
package Proyecto1;

/**
 * @author amyre
 *
 */
public class Carro {
	String Modelo = "Chevy" , Color = "Vino", Marca = "Chevrolet", Chasis =  "buenas condicones", Propietario = "Juan Hernández", Techo = "Corredizo", trasmisión = "manual" ;
	int Año = 1999, velocidadMáxima = 170, VelocidadMinima = 5, Puertas = 5, NumerodeMarchas = 6, Volumendecombustible = 57  ;

	public static void main(String[] args) {
		

	}

	public Carro(String modelo, String color, String marca, String chasis, String propietario, String techo,
			String trasmisión, int año, int velocidadMáxima, int velocidadMinima, int puertas, int numerodeMarchas,
			int volumendecombustible) {
		super();
		Modelo = modelo;
		Color = color;
		Marca = marca;
		Chasis = chasis;
		Propietario = propietario;
		Techo = techo;
		this.trasmisión = trasmisión;
		Año = año;
		this.velocidadMáxima = velocidadMáxima;
		VelocidadMinima = velocidadMinima;
		Puertas = puertas;
		NumerodeMarchas = numerodeMarchas;
		Volumendecombustible = volumendecombustible;
	}

}
