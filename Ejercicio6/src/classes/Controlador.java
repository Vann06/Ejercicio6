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
 * El propósito de esta inteface es lograr crear todos los requisitos de un dispositivo 
 * en las cuales son implementadas dependiendo de lo que es requerido.
 * */
public interface Controlador {

    /**
     * Enciende el dispositivo.
     */
    void encender();

    /**
     * Apaga el dispositivo.
     */
    void apagar();

    /**
     * Aumenta el volumen del dispositivo.
     */
    void subirVolumen();

    /**
     * Disminuye el volumen del dispositivo.
     */
    void bajarVolumen();

    /**
     * Aumenta el brillo del dispositivo.
     */
    void subirBrillo();

    /**
     * Disminuye el brillo del dispositivo.
     */
    void bajarBrillo();

    /**
     * Muestra la información del dispositivo.
     */
    void mostrarInfo();

    /**
     * Muestra el estado actual del dispositivo.
     */
    void estado();

    /**
     * Reproduce un video en el dispositivo.
     */
    void playVideo();

    /**
     * Pausa el video que se está reproduciendo en el dispositivo.
     */
    void pausaVideo();

    /**
     * Detiene el video que se está reproduciendo en el dispositivo.
     */
    void stopVideo();

    /**
     * Cambia el video que se está reproduciendo en el dispositivo.
     */
    void mostrarVideo();
}
