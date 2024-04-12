import javax.swing.*;

public class Singletone {

    //***Número generado por el usuario*/
    private int respuesta;

    //**Número generado para adivinar*/
    private int numeroAleatorio;

    //***Número de intentos que el usuario ha hecho*/
    private int intentos;

    //***Número de intentos máximo*/
    private int intentosMax;


    //***rondas máxima en cada partida*/
    private  int rondaPartida;

    //***rondas actual del jugador en la partida*/
    private  int rondaActual;

    //***Número de fallos del usuario*/
    private int fallos;

    //Nombre del jugador
    private String nombre;

    //Record de Puntuacion
    private int puntuacion;

    private int numeroAleatorioMin;

    private int numeroAleatorioMax;

    public Singletone(int respuesta, int numeroAleatorio, int intentos, int intentosMax, int rondaPartida, int rondaActual, int fallos, String nombre, int puntuacion, int numeroAleatorioMin, int numeroAleatorioMax) {
        this.respuesta = respuesta;
        this.numeroAleatorio = numeroAleatorio;
        this.intentos = intentos;
        this.intentosMax = intentosMax;
        this.rondaPartida = rondaPartida;
        this.rondaActual = rondaActual;
        this.fallos = fallos;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.numeroAleatorioMin = numeroAleatorioMin;
        this.numeroAleatorioMax = numeroAleatorioMax;
    }

    public int getNumeroAleatorioMin() {
        return numeroAleatorioMin;
    }

    public void setNumeroAleatorioMin(int numeroAleatorioMin) {
        this.numeroAleatorioMin = numeroAleatorioMin;
    }

    public int getNumeroAleatorioMax() {
        return numeroAleatorioMax;
    }

    public void setNumeroAleatorioMax(int numeroAleatorioMax) {
        this.numeroAleatorioMax = numeroAleatorioMax;
    }
    //esta va  ser nuestra única instancia

    private static Singletone Instance= null ;

    public static Singletone getInstance(){
        if(Instance==null){
            Instance=new Singletone();
        }
        return Instance;}

    //priovate el constructor para que no pueda ser instanciada
    private Singletone() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    //comprobamos si la instancia está creada o no y si no, la creamos.


    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }



    public int getRondaPartida() {
        return rondaPartida;
    }

    public void setRondaPartida(int rondaPartida) {
        this.rondaPartida = rondaPartida;
    }

    public int getRondaActual() {
        return rondaActual;
    }

    public void setRondaActual(int rondaActual) {
        this.rondaActual = rondaActual;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }


}