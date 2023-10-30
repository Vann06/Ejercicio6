package clases;

public class Dispositivo implements Comparable{

	
	
	//Atributos
	protected String marca;
	@Override
	public String toString() {
		return "marca = " + marca + "\nmodelo = " + modelo + "\ndescripcion = " + descripcion + "\nprecio = $"
				+ precio + "\nram = " + ram + "\nvisaCuotas = " + visaCuotas + "\nvideos = " + videos + "\nencendido = "
				+ encendido + "\nvolumen =  " + volumen + "";
	}





	protected String modelo;
	protected String descripcion;
	protected double precio;
	protected String ram;
	protected int visaCuotas;
	protected int videos;
	protected int encendido;
	protected int volumen;
	
	
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



	
	
	public Dispositivo(String marca, String modelo, String descripcion, double precio, String ram, int visaCuotas,
			int videos, int encendido, int volumen) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.ram = ram;
		this.visaCuotas = visaCuotas;
		this.videos = videos;
		this.encendido = encendido;
		this.volumen = volumen;
	}





	@Override
	public int compareTo(Object otro) {
		  if (this.precio>((Dispositivo)otro).getPrecio())
	            return 1;
	      if (this.precio<((Dispositivo)otro).getPrecio())
	            return -1;
		return 0;
	}
	
	
	
	
	
	
}

