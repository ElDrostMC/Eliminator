import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.*;
public class Eliminator{
    public static final String[] option = {"[", "]", "{", "}"};
        public static void inicializar_simbolos(String [] vect)
        {
            System.out.print(" VALOR INICIAL : ");
            Random rand = new Random();
            for (int i = 0; i < vect.length; i++) {
                int num = rand.nextInt(4);
                if (num == 0) {
                    vect[i] = "[";
                }
                if (num == 1) {
                    vect[i] = "]";
                }
                if (num == 2) {
                    vect[i] = "{";
                }
                if (num == 3) {
                    vect[i] = "}";
                }
            }

        }
        public static void imprimir_vector(String [] vect)
        {
            for (String s : vect) {
                System.out.print(s);
            }
            System.out.println(" ");
        }
        public static String pedir_simbolo_eliminar()
        {
            JFrame frame = new JFrame("CLAUDATORS");
            String caracter_elegido = (String) JOptionPane.showInputDialog(frame, "QUE ELERMENTO DESEAS ELIMINAR?", "CLAUDATORS", JOptionPane.QUESTION_MESSAGE,
                    null, option, option[0]);
            System.out.println(" CARACTER ELEGIDO : " + caracter_elegido);

          return caracter_elegido;
        }
        public static void eliminar_elegido(String [] vect_ori, String carac,String [] vect_des)
        {
            System.out.print(" VALOR FINAL : ");
            for (int i = 0; i < vect_ori.length; i++) {
                if (vect_ori[i].equals(carac)){
                    vect_des[i] = "";
                } else {
                    vect_des[i] = vect_ori[i];
                }
                System.out.print(vect_des[i]);
           }
        }
        public static void main(String[] args) {
            String [] vect_ini = new String[15];
            String [] vect_des = new String[15];
            String elegido;
            inicializar_simbolos (vect_ini);
            imprimir_vector(vect_ini);
            elegido = pedir_simbolo_eliminar();
            eliminar_elegido(vect_ini, elegido,vect_des);


        }

    }
