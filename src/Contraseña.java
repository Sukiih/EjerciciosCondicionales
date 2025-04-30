import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la contraseña");
        int passUsuario = teclado.nextInt();
        int contrasenaSistema = 123456;
        if (passUsuario == contrasenaSistema) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado!");
        }
    }
}
