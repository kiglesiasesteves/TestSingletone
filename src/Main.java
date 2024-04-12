import javax.swing.*;
import java.util.Random;

        public class Main {
            public static void main(String[] args) {
                Main programa = new Main();
                programa.IniciarPartida();
            }



            public  void IniciarPartida(){
                Singletone juego = Singletone.getInstance();

                juego.setNumeroAleatorioMin(1);//Número mínimo aleatorio
                juego.setNumeroAleatorioMax(10);//Número máximo aleatorio
                juego.setRondaPartida(10); // Número de rondas
                juego.setIntentosMax(2); // Número de intentos por ronda
                juego.setRondaActual(0); // Reiniciar ronda actual
                juego.setPuntuacion(0); // Reiniciar puntuación

                JOptionPane.showMessageDialog(null, "Comezamos a partida. Cada vez que erres terás un fallo e cada vez que puntúes terás un punto máis. \nTerás" +juego.getRondaPartida()+ "e terás a seguinte cantidade de intentos: "+juego.getIntentos());
                juego.setNombre(JOptionPane.showInputDialog("Coloca o teu nome"));

                for (int ronda = 1; ronda <= juego.getRondaPartida(); ronda++) {
                    juego.setRondaActual(ronda);
                    JOptionPane.showMessageDialog(null, "Ronda " + ronda + ": " + juego.getNombre() + ", intento " + juego.getIntentos());
                    juego.setNumeroAleatorio(GenerarNumeroAleatorio());
                    RealizarIntento();
                }

                MostrarResultado();
            }


            private void RealizarIntento() {
                Singletone juego = Singletone.getInstance();
                for (int intento = 1; intento <= juego.getIntentosMax(); intento++) {
                    juego.setIntentos(1);
                    juego.setRespuesta(Integer.parseInt(JOptionPane.showInputDialog("Intento " + intento +" Estamos na partida"+ juego.getRondaPartida()+ ": Ingrese un número (1-10)")));
                    if (juego.getRespuesta() == juego.getNumeroAleatorio()) {
                        JOptionPane.showMessageDialog(null, "¡Adivinaches!");
                        juego.setPuntuacion(juego.getPuntuacion() + 1);
                        intento++;
                    } else {
                        String respuesta = null;
                        if (juego.getRespuesta() < juego.getNumeroAleatorio()) {
                            respuesta="maior";
                        } else if (juego.getRespuesta() > juego.getNumeroAleatorio()) {
                            respuesta="menor";
                        }
                        JOptionPane.showMessageDialog(null, " Intento fallido. O número é"+ respuesta);
                        juego.setFallos(juego.getFallos() + 1);

                    }
                }
                JOptionPane.showMessageDialog(null, " O número era: " + juego.getNumeroAleatorio());

            }



            private void MostrarResultado() {
                Singletone juego = Singletone.getInstance();
                JOptionPane.showMessageDialog(null, " Fin del juego\nNombre: " + juego.getNombre() + "\nPuntuación: " + juego.getPuntuacion()+"\nFallos"+juego.getFallos());
            }
            public int GenerarNumeroAleatorio() {
                Singletone juego = Singletone.getInstance();
                Random random = new Random();
                int min=juego.getNumeroAleatorioMin();
                int max= juego.getNumeroAleatorioMax();
                juego.setNumeroAleatorio(random.nextInt(max - min + 1) + min);

                return juego.getNumeroAleatorio();

            }
        }
