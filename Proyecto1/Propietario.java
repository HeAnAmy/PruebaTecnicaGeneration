package Proyecto1;

public class Propietario {
	// Declaración_de_los_atributos_de_la_clase
	String Nombre = "Juan Hernandez";
	double CPF = 191188 ;
	double RG = 57211745 ;
	double Fecha_de_nacimiento = 19/11/88;
	String Calle = "Sur 97";
	String Barrio = "asuncion";
	String Ciudad = "Bogóta";
	String Estado = "Madrid";
	double CP = 15390;
	public static void main(String[] args) {
	

	}
	public Propietario(String nombre, double cPF, double rG, double fecha_de_nacimiento, String calle, String barrio,
			String ciudad, String estado, double cP) {
		super();
		Nombre = nombre;
		CPF = cPF;
		RG = rG;
		Fecha_de_nacimiento = fecha_de_nacimiento;
		Calle = calle;
		Barrio = barrio;
		Ciudad = ciudad;
		Estado = estado;
		CP = cP;
	}

}

	