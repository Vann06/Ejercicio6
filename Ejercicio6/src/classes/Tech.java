package classes;
/*
 * POO 2 Semestre
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Fecha inicio: 28/10/2023
 * Fecha final: 30/10/2023
 *
 * @author Vianka Castro 23201
 * 
 * El propósito de esta clase es representar a un teléfono que tiene sus propias características.
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class Tech {

	//String csv = "dispositivos.csv";
	private static ArrayList<Dispositivo> disp;
	//private static int cantDisp;
	Scanner in = new Scanner(System.in);
	
	public Tech() {
		disp = new ArrayList<>();
		//cantDisp = 0;
	
	}
	
	/**
	 * Agrega un nuevo dispositivo al inventario.
	 * 
	 * @param clase         Clase del dispositivo (ej. "computadora" o "telefono").
	 * @param marca         Marca del dispositivo.
	 * @param modelo        Modelo del dispositivo.
	 * @param descripcion   Descripción del dispositivo.
	 * @param precio        Precio del dispositivo.
	 * @param ram           Capacidad de RAM del dispositivo.
	 * @param visaCuotas    Número de cuotas permitidas con tarjeta Visa.
	 * @param videos        Número de videos en la lista de reproducción.
	 * @param encendido     Estado de encendido del dispositivo (1 para encendido, 0 para apagado).
	 * @param volumen       Nivel de volumen del dispositivo.
	 * @param brillo        Nivel de brillo del dispositivo.
	 * @param tamanio       Tamaño específico del dispositivo (solo para computadoras).
	 * @param tipo          Tipo de dispositivo de almacenamiento (solo para computadoras).
	 * @param velocidadCPU  Velocidad del procesador CPU (solo para computadoras).
	 * @param velocidadGPU  Velocidad del procesador GPU (solo para computadoras).
	 * @param procesador    Tipo de procesador (solo para teléfonos).
	 * @param almacenamiento Capacidad de almacenamiento interno (solo para teléfonos).
	 * @param memoria       Si el dispositivo acepta expansión de memoria (1 para sí, 0 para no, solo para teléfonos).
	 * @param cuboCargador  Si incluye cubo cargador (1 para sí, 0 para no, solo para teléfonos).
	 * @param tel5G         Si es compatible con tecnología 5G (1 para sí, 0 para no, solo para teléfonos).
	 */
	public static void agregarDispositivo(String clase, String marca, String modelo, String descripcion, double precio, String ram, int visaCuotas, int videos, int encendido, int volumen, int brillo, String tamanio, String tipo, String velocidadCPU, String velocidadGPU, String procesador, String almacenamiento, int memoria, int cuboCargador, int tel5G) {
	    Dispositivo dispositivo;

	    if ("computadora".equals(clase.toLowerCase())) {
	        // Create an instance of Computadora
	        dispositivo = new Computadora(clase, marca, modelo, descripcion, precio, ram, visaCuotas, videos, encendido, volumen, brillo, tamanio, tipo, velocidadCPU, velocidadGPU);
	    } else if ("telefono".equals(clase.toLowerCase())) {
	        // Create an instance of Telefono
	        dispositivo = new Telefono(clase, marca, modelo, descripcion, precio, ram, visaCuotas, videos, encendido, volumen, brillo, procesador, almacenamiento, memoria, cuboCargador, tel5G);
	    } else {
	        // Default to a generic Dispositivo if the class is not recognized
	        dispositivo = new Dispositivo(clase, marca, modelo, descripcion, precio, ram, visaCuotas, videos, encendido, volumen, brillo);
	    }

	    disp.add(dispositivo);
	}
	
	/**
	 * Devuelve una cadena de texto que muestra el dispositivo más barato y el más caro del inventario.
	 * 
	 * @return Cadena de texto que contiene la información del dispositivo más barato y más caro.
	 *         En caso de que no existan dispositivos, se devuelve "no existen dispositivos".
	 */
	public String visualizarEquipo() {
		
		//pr("Total objetos en mejorPRecio "+disp.length);
		
		if(disp.isEmpty()) {
			
			return "no existen dispositivos";
		}
		
		Dispositivo mejorPrecio = disp.get(0);
		Dispositivo peorPrecio = disp.get(0);
		
		for(int i = 1; i< disp.size(); i++) {
			if(mejorPrecio != null && disp.get(i) !=null) {
				//Se compara para ver el dispositivo con mejor precio
				if(disp.get(i).compareTo(mejorPrecio)< 0)
					mejorPrecio = disp.get(i);
				
				if(disp.get(i).compareTo(peorPrecio) > 0) {
					peorPrecio = disp.get(i);
					}
				}
				
			}
			
		pr("El dispositivo mas barato es:");
		pr("------>"+mejorPrecio.getMarca());
		pr("El dispositivo mas caro es: ");
		return "------>" + peorPrecio.getMarca();
	}
		
		
	/**
	 * Muestra la lista de dispositivos disponibles y permite al usuario seleccionar un dispositivo para ver su información.
	 * 
	 * @param popcion Entero que representa la opción seleccionada por el usuario.
	 */
		public void seleccionarEquipo(int popcion){
			pr("Lista de Dispositivos: ");
			int num = 0;
			for(int j = 0; j< disp.size(); j++) {
				num++;
				pr(num + ". " + disp.get(j).getMarca());
				
			}
			pr("Elija el dispositivo que desea ver \n > ");
			popcion = in.nextInt();
			
			if(popcion > 0 ) {
				popcion--;
				pr("El dispositivo seleccionado es: " + disp.get(popcion).getMarca());
				
				if(disp.get(popcion).getEncendido() == 1) {
					pr("---- El dispositivo esta encendido ----");
					pr("** Datos Generales del Dispositivo **\n");
					pr("Marca: " + disp.get(popcion).getMarca());
					pr("Modelo: " + disp.get(popcion).getModelo());
					pr("Descripcion: " + disp.get(popcion).getDescripcion());
					pr("Precio: $" + disp.get(popcion).getPrecio());
					pr("RAM: "+ disp.get(popcion).getRam());
					pr("Visa Cuotas: "+ disp.get(popcion).getVisaCuotas());
					pr("Video Reproducido: " + disp.get(popcion).getVideos());
					pr("Volumen:  " + disp.get(popcion).getVolumen());
					pr("Brillo: " + disp.get(popcion).getBrillo());
					
					

		            if (disp.get(popcion) instanceof Computadora) {
		                Computadora computadora = (Computadora) disp.get(popcion);
		                pr("-------------------------------------------");
		                pr("El dispositivo seleccionado es una Computadora");
		                pr("A continuación muestra su información en pantalla:");
		                pr(computadora.toString());
		            } else if (disp.get(popcion) instanceof Telefono) {
		                Telefono telefono = (Telefono) disp.get(popcion);
		                pr("-------------------------------------------");
		                pr("El dispositivo seleccionado es un Teléfono");
		                pr("A continuación muestra su información en pantalla:");
		                pr(telefono.toString());		            }
					
				}
				else {
					pr("*** El dispositivo esta apagado ***");
				}
				
			}
			else {
				pr("No existe ese valor!!");
			}
				

			
			//pr(disp.get(0).getMarca());
			
			//return("Esto es prueba");
		}
		

	
	 private static void pr(String x) {
			System.out.println(x);
		}
	


}
