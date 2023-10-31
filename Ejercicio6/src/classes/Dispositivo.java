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
 * La clase Dispositivo tendrá la información que cualquier dispositivo debe de tener.
 * */
public class Dispositivo implements Controlador, Comparable{

	
	
	
	//Atributos
	protected String clase;
	protected String marca;
	protected String modelo;
	protected String descripcion;
	protected double precio;
	protected String ram;
	protected int visaCuotas;
	protected int videos;
	protected int encendido;
	protected int volumen;
	protected int brillo;
	
	
	@Override
	public String toString() {
		return "marca = " + marca + "\nmodelo = " + modelo + "\ndescripcion = " + descripcion + "\nprecio = $"
				+ precio + "\nram = " + ram + "\nvisaCuotas = " + visaCuotas + "\nvideo reproducido = " + videos + "\nencendido = "
				+ encendido + "\nvolumen =  " + volumen + "\nbrillo = " + brillo;
	}





	
	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getBrillo() {
		return brillo;
	}

	public void setBrillo(int brillo) {
		this.brillo = brillo;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public int getEncendido() {
		return encendido;
	}

	public void setEncendido(int encendido) {
		this.encendido = encendido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
	public int getVisaCuotas() {
		return visaCuotas;
	}

	public void setVisaCuotas(int visaCuotas) {
		this.visaCuotas = visaCuotas;
	}

	public int getVideos() {
		return videos;
	}

	public void setVideos(int videos) {
		this.videos = videos;
	}



	
	
	public Dispositivo(String clase,String marca, String modelo, String descripcion, double precio, String ram, int visaCuotas,
			int videos, int encendido, int volumen, int brillo) {
		this.clase = clase;
		this.marca = marca;
		this.modelo = modelo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.ram = ram;
		this.visaCuotas = visaCuotas;
		this.videos = videos;
		this.encendido = encendido;
		this.volumen = volumen;
		this.brillo = brillo;
	}





	@Override
	public int compareTo(Object otro) {
		  if (this.precio>((Dispositivo)otro).getPrecio())
	            return 1;
	      if (this.precio<((Dispositivo)otro).getPrecio())
	            return -1;
		return 0;
	}






	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void subirVolumen() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void bajarVolumen() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void subirBrillo() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void bajarBrillo() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void mostrarInfo() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void estado() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void pausaVideo() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void stopVideo() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void mostrarVideo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
