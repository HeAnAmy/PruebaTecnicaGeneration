package facturaTienda;

public class Factura {
	//Variables
	String numero;
	String descripcion;
	int cantidadPieza;
	double precioPieza;
	double totalPagar;
	
	public Factura(String numero, String descripcion, int cantidadPieza, double precioPieza){
		this.numero = numero;
		this.descripcion = descripcion;
		this.cantidadPieza = cantidadPieza;
		if (precioPieza > 0.0){
			this.precioPieza = precioPieza;
		}
	}
	
	//get numero
	public String getNumero(){
		return numero;
	}
	//set numero
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	//get descripcion
	public String getDescripcion(){
		return descripcion;
	}
	//set descripcion
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	
	//get cantidadPieza
	public int getCantidadPieza(){
		return cantidadPieza;
	}
	//set cantidadPieza
	public void setCantidadPieza(int cantidadPieza){
		this.cantidadPieza = cantidadPieza;
	}
	
	//get precio
	public double getPrecioPieza(){
		return precioPieza;
	}
	//set precio
	public void getPrecioPieza(double precioPieza){
		this.precioPieza = precioPieza;
	}
	
	
	//Metodo getTotalFatura
	public double getTotalFatura(int cantidadPieza, double precioPieza){
		this.getTotalFatura += cantidadPieza * precioPieza;
		return this.totalPagar;
	}
}






package facturaTienda;
import java.util.Scanner;

public class crearFactura {
    public static void main(String args[]) {
      //Variables
	  String numero = null;
	  String descripcion = null;
	  int cantidadPieza = 0;
	  double precioPieza = 0.0;
	  
	  //Crear objeto factura
	  Factura factura = new Factura(numero, descripcion, cantidadPieza, precioPieza);
	  
	  //Variable para saber si hay mas productos a facturar
	  char respuestaProductos;
	  
	  //Entrada de datos
	  Scanner entrada = new Scanner(System.in);
	  
	  //Imprimir instrucciones de uso del programa
	  System.out.printlin("Sistema de facturaración de la Tienda de informática");
	  System.out.printlin("Por favor atienda las siguientes instrucciones");
	  
	  //Se utiliza do-while porque al menos una vez se debe introducir un producto al sistema
	  do{
			System.out.printlin("Ingrese el número de pieza: ");
			numero = entrada.next();
			System.out.printlin("Ingrese la descripcion de la pieza: ");
			descripcion = entrada.next();
			System.out.printlin("Ingrese la cantidad de piezas: ");
			cantidadPieza = entrada.nextInt();
			System.out.printlin("Ingrese el precio de la pieza: ");
			descripcion = entrada.nextDouble();
			
			//obtener el monto de la factura
			factura.getTotalFatura(cantidadPieza, precioPieza);
			
			//Preguntar si hay más productos
			System.out.printlin("Ingresar S si se ingresa nuevo producto");
			respuestaProductos = entrada.next().charAt(0);
		}while (respuestaProductos = 's' || respuestaProductos = 'S');
		System.out.printlin("El total a pagar es: " + factura.getTotalFatura);
    }
}