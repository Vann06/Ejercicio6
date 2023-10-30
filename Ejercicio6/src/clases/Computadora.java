package clases;

public class Computadora extends Dispositivo{
	
	//Atributos
	
	private String tamanio;
	private String tipo;
	private String velocidadCPU;
	private String velocidadGPU;
	
	@Override
	public String toString() {
		return "Computadora [tamanio=" + tamanio + ", tipo=" + tipo + ", velocidadCPU=" + velocidadCPU
				+ ", velocidadGPU=" + velocidadGPU + "]";
	}


	
	public String getTamanio() {
		return tamanio;
	}


	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getVelocidadCPU() {
		return velocidadCPU;
	}


	public void setVelocidadCPU(String velocidadCPU) {
		this.velocidadCPU = velocidadCPU;
	}


	public String getVelocidadGPU() {
		return velocidadGPU;
	}


	public void setVelocidadGPU(String velocidadGPU) {
		this.velocidadGPU = velocidadGPU;
	}



	
	
	public Computadora(String marca, String modelo, String descripcion, double precio, String ram, int visaCuotas,
			int videos, int encendido, int volumen) {
		super(marca, modelo, descripcion, precio, ram, visaCuotas, videos,encendido, volumen);
		// TODO Auto-generated constructor stub
	
	}
}
	

	
	