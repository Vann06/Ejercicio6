package clases;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
public class Archivo {

	
	private static String linea;
	private String partes[]= null;
	String inventarioCSV = "dispositivos.csv";
	private BufferedReader lector;
	
	

	
	public void printArchivo(String nombreArchivo) {
		try {
			lector = new BufferedReader(new FileReader(nombreArchivo));
			while((linea = lector.readLine()) != null) {
				partes = linea.split(",");
				for(int i = 0; i < partes.length; i++) {
					System.out.println(partes[i]);
					
				}
				System.out.println();
				
				
			}
			lector.close();
			linea = null;
			partes = null;
		}catch(Exception e) {
			System.err.println("err "+ e.getMessage());
		}
	}
	
	
	public static ArrayList<Dispositivo> leerArchivo(String nombreArchivo){
		ArrayList<Dispositivo> dispositivo = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
			linea = br.readLine();
			while(linea != null) {
				linea = br.readLine();
				
				if(linea != null && !linea.equals(",,,,,,,,,,,,,,,,,,,,,,")) {
					String[] line = linea.split(",");
					//pr("Linea --->"+linea);
					String clase = line[0];
					String marca = line[1];
					String modelo = line[2];
					String desc = line[3];
					double precio = Double.parseDouble(line[4]);
					String ram = line[5];
					int visaCuotas = Integer.parseInt(line[6]);
					String tamanio = line[7];
					String tipo = line[8];
					String velCPU = line[9];
					String velGPU = line[10];
					int videos = Integer.parseInt(line[11]);
					String procesador = line[12];
					String almacenamiento = line[13];
					Boolean memoria = Boolean.parseBoolean(line[14]);
					Boolean cuboCargador = Boolean.parseBoolean(line[15]);
					Boolean tel5G = Boolean.parseBoolean(line[16]);
					int encendido = Integer.parseInt(line[17]);
					int volumen = Integer.parseInt(line[18]);

					
					Dispositivo dis = null;
					switch(line[0].toString()) {
					case "computadora":
						dis = new Computadora(marca, modelo, desc, precio, ram, visaCuotas, videos,encendido,volumen);
						dispositivo.add(dis);
						break;
					case "telefono":
						dis = new Telefono(marca,modelo,desc,precio,ram,visaCuotas,videos,encendido,volumen,procesador,almacenamiento,memoria,cuboCargador,tel5G);
						dispositivo.add(dis);
						break;
					}
					
					
					
					
				}
				
				}
			
		}catch (FileNotFoundException ex) {
			System.err.println("err "+ex.getMessage());
		} catch (IOException ex) {
			System.err.println("err2 "+ex.getMessage());
		}
		
		return dispositivo;
			
	}
	 private static void pr(String x) {
			System.out.println(x);
		}
	

	
}
