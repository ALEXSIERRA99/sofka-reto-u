package interfaz;

import categoria.Muydificil;
import categoria.amateur;
import categoria.dificil;
import categoria.facil;
import categoria.medio;
import javax.swing.JOptionPane;

public class interfaz {

    static int opcion;
    public static facil inter1 = new facil();

    public static amateur inter2 = new amateur();
    public static medio inter3 = new medio();
    public static dificil inter4 = new dificil();
    public static Muydificil inter5 = new Muydificil();

    public void jugar() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido al preguntas y respuestas\n"
                + "elige un nivel de dificultad para poder jugar.\n"
                + "El juego consiste en 5 preguntas que deberás responder\n"
                + "Si fallas se cerrara el juego, puedes salir en cualquier momento\n"
                + "Y podrás ver tu puntuación.\n"
                + "\n"
                + "Categorías:\n"
                + "1 fácil\n"
                + "2 amateur\n"
                + "3 medio\n"
                + "4 difícil\n"
                + "5 Muy difícil\n"
                + "6 salir"));
        switch (opcion) {
            case 1:
                inter1.Facil();
                break;
            case 2:
                inter2.Amateur();
                break;
            case 3:
                inter3.Medio();
                break;
            case 4:
                inter4.Dificil();
                break;
            case 5:
                inter5.Muydificil();
            case 6:
                JOptionPane.showMessageDialog(null, "hasta luego");
                break;

            default:
                throw new AssertionError();
        }
    }
}
