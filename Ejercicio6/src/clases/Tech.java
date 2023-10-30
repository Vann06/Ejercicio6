package clases;

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
	
	 public static void agregarDispositivo(String marca, String modelo, String descripcion, double precio, String ram, int visaCuotas, int videos, int encendido, int volumen){
	            Dispositivo dispositivo = new Dispositivo(marca,modelo,descripcion, precio, ram, visaCuotas, videos,encendido, volumen); //Creo el objeto que voy a meter en el arreglo
	            disp.add(dispositivo);
	           //cantDisp++;
	 
	 }
	
	
	public String mejorPrecio() {
		
		//pr("Total objetos en mejorPRecio "+disp.length);
		
		Dispositivo mejor = disp.get(0);
		
		for(int i = 1; i< disp.size(); i++) {
			if(mejor != null && disp.get(i) !=null) {
				if(disp.get(i).compareTo(mejor)< 0)
					mejor = disp.get(i);
			}
		}
		if(mejor !=null) {
			pr("El dispositivo mas barato es: ");
			return mejor.getMarca();
		}
		else
			return "No hay dispositivos";
	}
		
		
		public String peorPrecio() {
			
			//pr("Total objetos en mejorPRecio "+disp.length);
			
			Dispositivo mejor = disp.get(0);
			
			for(int i = 1; i< disp.size(); i++) {
				if(mejor != null && disp.get(i) !=null) {
					if(disp.get(i).compareTo(mejor)> 0)
						mejor = disp.get(i);
				}
			}
			if(mejor !=null) {
				pr("El dispositivo mas caro es: ");
				return mejor.getMarca();
			}
			else
				return "No hay dispositivos";
		}
		
		
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
					pr("El dispositivo esta encendido");
					
					pr("Numero del video: " + disp.get(popcion).getVideos());
					pr("Volumen " + disp.get(popcion).getVolumen());
					pr("Brillo ");
					pr(disp.get(popcion).toString());
					//num del video
					//volumen
					//brillo
					//info que muestra
					
				}
				else {
					pr("El dispositivo esta apagado");
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
