
package categoria;

import javax.swing.JOptionPane;


public class Muydificil {
    public static preguntas Pmuydificil = new preguntas();

    public void Muydificil() {
        String[] muydificil = new String[5];
        int[] respuestasmuydificil = new int[5];
        int Puntuacion = 0;
        int Elecresp;

        muydificil[0] = Pmuydificil.getPreguntaMuyDifcil1();
        muydificil[1] = Pmuydificil.getPreguntaMuyDifcil2();
        muydificil[2] = Pmuydificil.getPreguntaMuyDifcil3();
        muydificil[3] = Pmuydificil.getPreguntaMuyDifcil4();
        muydificil[4] = Pmuydificil.getPreguntaMuyDifcil5();

        respuestasmuydificil[0] = 3;
        respuestasmuydificil[1] = 4;
        respuestasmuydificil[2] = 3;
        respuestasmuydificil[3] = 2;
        respuestasmuydificil[4] = 2;

        for (int i = 0; i < muydificil.length; i++) {
            Elecresp = Integer.parseInt(JOptionPane.showInputDialog(muydificil[i]));
            if (Elecresp == 5) {
                JOptionPane.showMessageDialog(null, "gracias por jugar, tu puntuacion es:" +Puntuacion);
                System.exit(0);
            }
            if (Elecresp == respuestasmuydificil[i]) {
                JOptionPane.showMessageDialog(null, "Muy bien!");
                Puntuacion = Puntuacion +20;
                if (Puntuacion == 100) {
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
