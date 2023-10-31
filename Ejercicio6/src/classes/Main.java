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
 *  El propósito de esta clase es es mostrar e interactuar con el usuario.
 * */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Archivo arch = new Archivo();
		Tech tec = new Tech();
	
		ArrayList<Dispositivo> aar  = new ArrayList<>();
		aar = arch.leerArchivo("dispositivos.csv");
		
		
		for(int i = 0; i < aar.size(); i++) {
			Dispositivo dispositivo = aar.get(i);
			if(dispositivo instanceof Computadora) {
				Computadora computadora = (Computadora) dispositivo;
				Tech.agregarDispositivo(computadora.getClase(),computadora.getMarca(), computadora.getModelo(), computadora.getDescripcion(), computadora.getPrecio(), computadora.getRam(), computadora.getVisaCuotas(), computadora.getVideos(), computadora.getEncendido(), computadora.getVolumen(), computadora.getBrillo(), computadora.getTamanio(), computadora.getTipo(), computadora.getVelocidadCPU(), computadora.getVelocidadGPU(), "", "", 0, 0, 0);	

			}
			if(dispositivo instanceof Telefono) {
				Telefono tel = (Telefono)dispositivo;
				Tech.agregarDispositivo(tel.getClase(),tel.getMarca(), tel.getModelo(), tel.getDescripcion(), tel.getPrecio(), tel.getRam(), tel.getVisaCuotas(), tel.getVideos(), tel.getEncendido(), tel.getVolumen(), tel.getBrillo(), null, null, null, null, tel.getProcesador(), tel.getAlmacenamiento(), tel.getMemoria(), tel.getCuboCargador(), tel.getTel5G());
			}
		}
		
		
		pr("*******************************************\n");
		pr("**Bienvenido al inventario ElectroTech!!**");
		
		int opcion = 0;
		
		while(opcion>=0 && opcion<=3) {
			
			try {
				pr("");
				pr("**********  Bienvenido al Menu  ***********");
				pr("");
				pr("---------------Menu Inicial----------------\n");
				pr("1. Mostrar Dispositivo\n");
				pr("2. Mostrar Dispositivo mas Caro y mas Barato\n");
				pr("Elija cualquier otro numero para Salir");
				
				pr("Ingrese la opcion \n > ");
				String input = in.next();  
				opcion = Integer.parseInt(input);
				
				switch(opcion) {
				
				case 1:
					pr("Usted eligio mostrar Dispositivo");
					tec.seleccionarEquipo(1);
					break;
				case 2:
					pr("Usted eligio mostrar mas Caro y mas Barato");
					pr(tec.visualizarEquipo());
					break;
				}
			}catch(Exception e) {
				e.printStackTrace();
				 // TODO: handle exception
				System.out.println("\nDebe ingresar un número (:() \n");
	            System.out.println(e.getMessage());
	            opcion=0;
	            in.nextLine();
				
		
			}finally {
				pr("********************************************");
				pr("Gracias por usar el sistema de Inventario!");
           }
		}
	}
	 private static void pr(String x) {
			System.out.println(x);
		}
	
	
	
	
}
