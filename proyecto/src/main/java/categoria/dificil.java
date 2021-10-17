
package categoria;

import javax.swing.JOptionPane;


public class dificil {
    public static preguntas Pdificil = new preguntas();

    public void Dificil() {
        String[] dificil = new String[5];
        int[] respuestasdificil = new int[5];
        int Puntuacion = 0;
        int Elecresp;

        dificil[0] = Pdificil.getPreguntaDificil1();
        dificil[1] = Pdificil.getPreguntaDificil2();
        dificil[2] = Pdificil.getPreguntaDificil3();
        dificil[3] = Pdificil.getPreguntaDificil4();
        dificil[4] = Pdificil.getPreguntaDificil5();

        respuestasdificil[0] = 4;
        respuestasdificil[1] = 4;
        respuestasdificil[2] = 3;
        respuestasdificil[3] = 4;
        respuestasdificil[4] = 2;

        for (int i = 0; i < dificil.length; i++) {
            Elecresp = Integer.parseInt(JOptionPane.showInputDialog(dificil[i]));
            if (Elecresp == 5) {
                JOptionPane.showMessageDialog(null, "gracias por jugar, tu puntuacion es:" +Puntuacion);
                System.exit(0);
            }
            if (Elecresp == respuestasdificil[i]) {
                JOptionPane.showMessageDialog(null, "Muy bien!");
                Puntuacion = Puntuacion +10;
                if (Puntuacion == 50) {
                    JOptionPane.showMessageDialog(null, "ganaste, tu puntuacion es:" +Puntuacion);
                    JOptionPane.showMessageDialog(null, "para seguir con otras categorias vuelve a iniciar el juego");
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "perdiste");
                System.exit(0);

            }
        }
    }
}
