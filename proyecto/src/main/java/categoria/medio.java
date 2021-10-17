
package categoria;

import javax.swing.JOptionPane;


public class medio {
    public static preguntas Pmedio = new preguntas();

    public void Medio() {
        String[] medio = new String[5];
        int[] respuestasmedio = new int[5];
        int Puntuacion = 0;
        int Elecresp;

        medio[0] = Pmedio.getPreguntaMedio1();
        medio[1] = Pmedio.getPreguntaMedio2();
        medio[2] = Pmedio.getPreguntaMedio3();
        medio[3] = Pmedio.getPreguntaMedio4();
        medio[4] = Pmedio.getPreguntaMedio5();

        respuestasmedio[0] = 3;
        respuestasmedio[1] = 4;
        respuestasmedio[2] = 4;
        respuestasmedio[3] = 4;
        respuestasmedio[4] = 1;

        for (int i = 0; i < medio.length; i++) {
            Elecresp = Integer.parseInt(JOptionPane.showInputDialog(medio[i]));
            if (Elecresp == 5) {
                JOptionPane.showMessageDialog(null, "gracias por jugar, tu puntuacion es:" +Puntuacion);
                System.exit(0);
            }
            if (Elecresp == respuestasmedio[i]) {
                JOptionPane.showMessageDialog(null, "Muy bien!");
                Puntuacion = Puntuacion +5;
                if (Puntuacion == 25) {
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
