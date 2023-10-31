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
 * El propósito de esta clase es guardar y leer en un archivo CSV
 * */

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
	
	

	/**
	 * Imprime el contenido de un archivo CSV proporcionado.
	 * 
	 * @param nombreArchivo Nombre del archivo CSV que se desea imprimir.
	 */
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
	
	/**
	 * Lee un archivo CSV y crea una lista de objetos Dispositivo con la información proporcionada en el archivo.
	 * 
	 * @param nombreArchivo Nombre del archivo CSV que se desea leer.
	 * @return Una ArrayList de objetos Dispositivo creados a partir de la información en el archivo.
	 */
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
					int memoria = Integer.parseInt(line[14]);
					int cuboCargador = Integer.parseInt(line[15]);
					int tel5G = Integer.parseInt(line[16]);
					int encendido = Integer.parseInt(line[17]);
					int volumen = Integer.parseInt(line[18]);
					int brillo = Integer.parseInt(line[19]);

					
					Dispositivo dis = null;
					switch(line[0].toString()) {
					case "computadora":
						dis = new Computadora(clase,marca, modelo, desc, precio, ram, visaCuotas, videos,encendido,volumen,brillo,tamanio,tipo,velCPU,velGPU);
						dispositivo.add(dis);
						break;
					case "telefono":
						dis = new Telefono(clase,marca,modelo,desc,precio,ram,visaCuotas,videos,encendido,volumen,brillo,procesador,almacenamiento,memoria,cuboCargador,tel5G);
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
