package categoria;

import javax.swing.JOptionPane;

public class amateur {

   public static preguntas Pamateur = new preguntas();

    public void Amateur() {
        String[] amateur = new String[5];
        int[] respuestasamateur = new int[5];
        int Puntuacion = 0;
        int Elecresp;

        amateur[0] = Pamateur.getPreguntaAmateur1();
        amateur[1] = Pamateur.getPreguntaAmateur2();
        amateur[2] = Pamateur.getPreguntaAmateur3();
        amateur[3] = Pamateur.getPreguntaAmateur4();
        amateur[4] = Pamateur.getPreguntaAmateur5();

        respuestasamateur[0] = 4;
        respuestasamateur[1] = 3;
        respuestasamateur[2] = 4;
        respuestasamateur[3] = 4;
        respuestasamateur[4] = 4;

        for (int i = 0; i < amateur.length; i++) {
            Elecresp = Integer.parseInt(JOptionPane.showInputDialog(amateur[i]));
            if (Elecresp == 5) {
                JOptionPane.showMessageDialog(null, "gracias por jugar, tu puntuacion es:" +Puntuacion);
                System.exit(0);
            }
            if (Elecresp == respuestasamateur[i]) {
                JOptionPane.showMessageDialog(null, "Muy bien!");
                Puntuacion = Puntuacion +3;
                if (Puntuacion == 15) {
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
