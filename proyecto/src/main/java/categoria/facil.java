package categoria;

import javax.swing.JOptionPane;

public class facil {

    public static preguntas Pfacil = new preguntas();

    public void Facil() {
        String[] facil = new String[5];
        int[] respuestasfacil = new int[5];
        int Puntuacion = 0;
        int Elecresp;

        facil[0] = Pfacil.getPreguntaFacil1();
        facil[1] = Pfacil.getPreguntaFacil2();
        facil[2] = Pfacil.getPreguntaFacil3();
        facil[3] = Pfacil.getPreguntaFacil4();
        facil[4] = Pfacil.getPreguntaFacil5();

        respuestasfacil[0] = 4;
        respuestasfacil[1] = 3;
        respuestasfacil[2] = 4;
        respuestasfacil[3] = 4;
        respuestasfacil[4] = 4;

        for (int i = 0; i < facil.length; i++) {
            Elecresp = Integer.parseInt(JOptionPane.showInputDialog(facil[i]));
            if (Elecresp == 5) {
                JOptionPane.showMessageDialog(null, "gracias por jugar, tu puntuacion es:" +Puntuacion);
                System.exit(0);
            }
            if (Elecresp == respuestasfacil[i]) {
                JOptionPane.showMessageDialog(null, "Muy bien!");
                Puntuacion = Puntuacion +2;
                if (Puntuacion == 10) {
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
