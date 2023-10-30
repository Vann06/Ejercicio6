package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Archivo arch = new Archivo();
		Tech tec = new Tech();
	
		ArrayList<Dispositivo> aar  = new ArrayList<>();
		aar = arch.leerArchivo("dispositivos.csv");
		
		//pr("Total de dispositivos en Main"+aar.size());
		
		for(int i = 0; i < aar.size(); i++) {
			tec.agregarDispositivo(aar.get(i).getMarca(), aar.get(i).getModelo(),aar.get(i).getDescripcion(), aar.get(i).getPrecio(), aar.get(i).getRam(), aar.get(i).getVisaCuotas(), aar.get(i).getVideos(), aar.get(i).getEncendido(), aar.get(i).getVolumen());	
		}
		//arch.printArchivo("dispositivos.csv");
		pr(tec.mejorPrecio());
		pr(tec.peorPrecio());
		tec.seleccionarEquipo(1);
		
		
		pr("*******************************************\n");
		pr("**Bienvenido al inventario ElectroTech!!**");
		
		int opcion = 0;
		
	
		
		
		
		
		
	}
	 private static void pr(String x) {
			System.out.println(x);
		}
	

}

