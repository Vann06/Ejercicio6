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
 * El propósito de esta clase es representar a un dispositivo computadora 
 * que tiene sus únicas características.
 * */
public class Computadora extends Dispositivo{

	//Atributos
	
	private String tamanio;
	private String tipo;
	private String velocidadCPU;
	private String velocidadGPU;
	
	
	
	//Constructor
	public Computadora(String clase,String marca, String modelo, String descripcion, double precio, String ram, int visaCuotas,
			int videos, int encendido, int volumen, int brillo, String tamanio, String tipo, String velocidadCPU,
			String velocidadGPU) {
		super(clase,marca, modelo, descripcion, precio, ram, visaCuotas, videos, encendido, volumen, brillo);
		this.tamanio = tamanio;
		this.tipo = tipo;
		this.velocidadCPU = velocidadCPU;
		this.velocidadGPU = velocidadGPU;
	}


	
	@Override
	public String toString() {
		return "tamanio = " + tamanio + "\ntipo = " + tipo + "\nvelocidadCPU = " + velocidadCPU
				+ "\nvelocidadGPU = " + velocidadGPU;
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


	 /**
     * Sube el volumen del telefono
     */
    @Override
    public void subirVolumen() {
        if (volumen < 100) {
            volumen += 10;
            System.out.println("El volumen esta a: " + volumen);
        } else {
            System.out.println("El volumen llego al maximo.");
        }
    }
    
    
    /**
     * Baja el volumen del telefono
     */
    @Override
    public void bajarVolumen() {
        if (volumen > 0) {
            volumen -= 10;
            System.out.println("El volumen se encuentra a: " + volumen);
        } else {
            System.out.println("El volumen llego al minimo.");
        }
    }
    
    /**
     * Sube el brillo del telefono
     */
    @Override
    public void subirBrillo() {
        if (brillo < 100) {
            brillo += 5;
            System.out.println("El brillo subio a: " + brillo);
        } else {
            System.out.println("El brillo llego al maximo.");
        }
    }

    /**
     * Baja el brillo del telefono
     */
    @Override
    public void bajarBrillo() {
        if (brillo > 0) {
            brillo -= 5;
            System.out.println("El brillo bajo a: " + brillo);
        } else {
            System.out.println("El brillo está al minimo.");
        }
    }
    

	
	
}
