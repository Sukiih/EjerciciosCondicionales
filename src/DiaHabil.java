import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el día de la semana (en minúsculas): ");
        String diaUsuario = teclado.next().toLowerCase();

        if (diaUsuario.equals("lunes") || diaUsuario.equals("martes") || diaUsuario.equals("miercoles") ||
                diaUsuario.equals("jueves") || diaUsuario.equals("viernes")) {
            System.out.println(diaUsuario + " es un día hábil");
        } else if (diaUsuario.equals("sabado") || diaUsuario.equals("domingo")  ){
            System.out.println(diaUsuario + " no es un día hábil");
        } else {
            System.out.println(diaUsuario + " no es un día");
        }

        teclado.close();
    }
}
