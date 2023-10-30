package clases;

public class Telefono extends Dispositivo{

	
	//Atributos
	private String procesador;
	private String almacenamiento;
	private boolean memoria;
	private boolean cuboCargador;
	private boolean tel5G;
	
	
	
	@Override
	public String toString() {
		return "Telefono [procesador=" + procesador + ", almacenamiento=" + almacenamiento + ", memoria=" + memoria
				+ ", cuboCargador=" + cuboCargador + ", tel5G=" + tel5G + ", marca=" + marca + ", modelo=" + modelo
				+ ", descripcion=" + descripcion + ", precio=" + precio + ", ram=" + ram + ", visaCuotas=" + visaCuotas
				+ ", videos=" + videos + ", encendido=" + encendido + ", volumen=" + volumen + ", getProcesador()="
				+ getProcesador() + ", getAlmacenamiento()=" + getAlmacenamiento() + ", isMemoria()=" + isMemoria()
				+ ", isCuboCargador()=" + isCuboCargador() + ", isTel5G()=" + isTel5G() + ", getVolumen()="
				+ getVolumen() + ", getEncendido()=" + getEncendido() + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getDescripcion()=" + getDescripcion() + ", getPrecio()=" + getPrecio()
				+ ", getRam()=" + getRam() + ", getVisaCuotas()=" + getVisaCuotas() + ", getVideos()=" + getVideos()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	public Telefono(String marca, String modelo, String descripcion, double precio, String ram, int visaCuotas,
			int videos, int encendido, int volumen, String procesador, String almacenamiento, boolean memoria, boolean cuboCargador, boolean tel5G) {
		super(marca, modelo, descripcion, precio, ram, visaCuotas, videos,encendido, volumen);
		// TODO Auto-generated constructor stub
		this.procesador = procesador;
		this.almacenamiento = almacenamiento;
		this.memoria = memoria;
		this.cuboCargador = cuboCargador;
		this.tel5G = tel5G;
	}

	
	
	
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	public boolean isMemoria() {
		return memoria;
	}
	public void setMemoria(boolean memoria) {
		this.memoria = memoria;
	}
	public boolean isCuboCargador() {
		return cuboCargador;
	}
	public void setCuboCargador(boolean cuboCargador) {
		this.cuboCargador = cuboCargador;
	}
	public boolean isTel5G() {
		return tel5G;
	}
	public void setTel5G(boolean tel5g) {
		tel5G = tel5g;
	}
	
	
	
	
	
}

	