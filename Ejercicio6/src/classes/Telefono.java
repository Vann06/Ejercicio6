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
 * El propósito de esta clase es representar a un teléfono que tiene sus propias características.
 * */


public class Telefono extends Dispositivo{


	
	//Atributos
	private String procesador;
	private String almacenamiento;
	private int memoria;
	private int cuboCargador;
	private int tel5G;
	
	
	
	
	@Override
	public String toString() {
		return "procesador = " + procesador + "\nalmacenamiento = " + almacenamiento + "\nmemoria = " + memoria
				+ "\ncuboCargador = " + cuboCargador + "\ntel5G = " + tel5G + "]";
	}

	
	
	
	
	
	
	public Telefono(String clase,String marca, String modelo, String descripcion, double precio, String ram, int visaCuotas,
			int videos, int encendido, int volumen, int brillo, String procesador, String almacenamiento, int memoria, int cuboCargador, int tel5G) {
		super(clase,marca, modelo, descripcion, precio, ram, visaCuotas, videos,encendido, volumen, brillo);
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
	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getCuboCargador() {
		return cuboCargador;
	}

	public void setCuboCargador(int cuboCargador) {
		this.cuboCargador = cuboCargador;
	}

	public int getTel5G() {
		return tel5G;
	}

	public void setTel5G(int tel5g) {
		tel5G = tel5g;
	}
	
	
	 /**
     * Sube el volumen del telefono
     */
    @Override
    public void subirVolumen() {
        if (volumen < 100) {
            volumen += 3;
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
            volumen -= 3;
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
            brillo += 2;
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
            brillo -= 2;
            System.out.println("El brillo bajo a: " + brillo);
        } else {
            System.out.println("El brillo está al minimo.");
        }
    }
    
    
	

	
	
}
